/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author prisc
 */
public class Proveedores extends Persona{
    
    private int codigo_proveedor;
    private String provincia;

    public Proveedores(int codigo_proveedor, String provincia) {
        this.codigo_proveedor = codigo_proveedor;
        this.provincia = provincia;
    }

    public Proveedores(int codigo_proveedor, String provincia, String cedula, String nombre, String apellido, String correo, String direccion, String telefono, String fecha_nac, String ciudad, String celular) {
        super(cedula, nombre, apellido, correo, direccion, telefono, fecha_nac, ciudad, celular);
        this.codigo_proveedor = codigo_proveedor;
        this.provincia = provincia;
    }

    public Proveedores() {
       
    }

    public int getCodigo_proveedor() {
        return codigo_proveedor;
    }

    public void setCodigo_proveedor(int codigo_proveedor) {
        this.codigo_proveedor = codigo_proveedor;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

     public boolean InsertarPersona(String Ced, String nomb, String Ape, String Dir, String telf, String cel, String ciudad, String direcciondom, String correo,int codigo, String provincia) {
        ConexionDB conec=new ConexionDB();  
        try {
            String sql;
                sql = "Insert into persona ";
                sql += "(cedula, nombre, apellido, direccion, telefono, celular, correo, ciudad)";
                sql += "VALUES ('"+Ced+"', '"+nomb+"', '"+Ape+"', '"+Dir+"', '"+telf+"', '"+cel+"', '"+correo+"', '"+ciudad+"')";
                if (conec.noQuery(sql) == null) {
                    InsertarProveedor(codigo,provincia);
                    return true;
                } else {
                    return false;
                }
        } catch (Exception e) {
            //En caso de que la persona ya se encuentre registrada en la base, solo se añadiran los datos adicionales como cliente
           InsertarProveedor(codigo,provincia);
            return false;
        }finally{
            try {
                conec.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(e);
            }            
        }   
    }   

     public boolean InsertarProveedor(int codigo, String prov) {
        ConexionDB conec=new ConexionDB();  
        try {
            String sql;
                sql = "Insert into proveedor ";
                sql += " (codigo_proveedor, provincia) ";
                sql += "VALUES ('"+codigo+"','"+prov+"')";
                if (conec.noQuery(sql) == null) {
                    return true;
                } else {
                    return false;
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El proveedor ya se encuentra registrado en la base de datos");
            return false;
        }finally{
            try {
                conec.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(e);
            }            
        }   
    }
    public boolean ActualizarPersona(String Ced, String nomb, String Ape, String correo, String dir, String telf, String cel, String ciudad, String direcciondom, int codigo, String prov){
        ConexionDB conec=new ConexionDB();  
        String sql;
        sql = "UPDATE persona ";
        sql += "SET nombre = '"+nomb+"', apellido = '"+Ape+"', correo = '"+correo+"', direccion = '"+dir+"', telefono = '"+telf+"', celular = '"+cel+"', ciudad = '"+ciudad+"'";
        sql += "WHERE cedula = '"+Ced+"'";        
        if (conec.noQuery(sql) == null) {
            ActualizarProveedor(codigo,prov);
            return true;
        } else {
            return false;
        }
    }

        
   
    public boolean ActualizarProveedor(int codigo, String prov){
        ConexionDB con=new ConexionDB();  
        String sql;
        sql = "Update proveedor ";
        sql += "SET codigo_proveedor ='"+codigo+"' ";
        sql += "WHERE provincia = '"+prov+"'";
        if (con.noQuery(sql) == null) {
                        try {
                con.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(e);
            } 
            return true;
        } else {
                        try {
                con.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(e);
            } 
            return false;
        }        
    } 
       public boolean EliminarProvedor(String codigo){
        ConexionDB con=new ConexionDB();
        try {

        String sql;
        sql = "delete from cliente where codigo_proveedor ='"+codigo+"'";
        if (con.noQuery(sql) == null) {
                        try {
                con.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(e);
            } 
            return true;
        } else {
                        try {
                con.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(e);
            } 
            return false;
        }            
        } catch (Exception ex) {
           return false;
        }
    }  
     public List<Proveedores> mostrarClientes(String codigo, String campo){
        ConexionDB conec=new ConexionDB();  
        try {
        String sql = "SELECT * FROM vista_cliemte_comp where UPPER("+campo+") like UPPER('"+codigo+"%')";
        ResultSet rs = conec.query(sql);
        List<Proveedores> listaC = new ArrayList<Proveedores>();
            while (rs.next()) {
                Proveedores p= new Proveedores();
                Cliente c = new Cliente();
                p.setCodigo_proveedor(rs.getInt("codigo_proveedor"));
                p.setCedula(rs.getString("cedula"));
                p.setApellido(rs.getString("apellido"));
                p.setNombre(rs.getString("nombre"));
                p.setTelefono(rs.getString("telefono"));
                p.setCelular(rs.getString("celular"));
                p.setProvincia(rs.getString("domicilio"));
                p.setDireccion(rs.getString("direccion"));
                p.setCiudad(rs.getString("ciudad"));
                p.setCorreo(rs.getString("correo"));
                listaC.add(p);
            }
            rs.close();
            return listaC;
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }   finally{
            try {
                conec.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(e);
            }            
        }        
    }    

 
 

    
    

  
    


 
    
}
