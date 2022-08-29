/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author Andrea
 */
public class Transportista extends Persona {

    private String Placa;

    public Transportista(String Placa) {
        this.Placa = Placa;
    }

    
    public Transportista() {
    }

    public Transportista(String cedula, String nombre, String apellido, String correo, String direccion, String telefono, String fecha_nac, String ciudad, String celular) {
        super(cedula, nombre, apellido, correo, direccion, telefono, fecha_nac, ciudad, celular);
    }

    public String getPlaca() {
        return Placa;
    }
    

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }
    
    
    public boolean InsertarPersona(String Ced, String nomb, String Ape, String Dir, String telf, String cel, String ciudad, String direcciondom, String correo,int codigo, String provincia, String placa) {
        ConexionDB conec=new ConexionDB();  
        try {
            String sql;
                sql = "Insert into persona ";
                sql += "(cedula, nombre, apellido, direccion, telefono, celular, correo, ciudad, placa)";
                sql += "VALUES ('"+Ced+"', '"+nomb+"', '"+Ape+"', '"+Dir+"', '"+telf+"', '"+cel+"', '"+correo+"', '"+ciudad+"', '"+placa+"')";
                if (conec.noQuery(sql) == null) {
                    InsertarTransportista(placa);
                    return true;
                } else {
                    return false;
                }
        } catch (Exception e) {
            //En caso de que la persona ya se encuentre registrada en la base, solo se añadiran los datos adicionales como cliente
           InsertarTransportista(placa);
            return false;
        }finally{
            try {
                conec.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(e);
            }            
        }   
    }   

     public boolean InsertarTransportista( String placa) {
        ConexionDB conec=new ConexionDB();  
        try {
            String sql;
                sql = "Insert into transportista ";
                sql += " (placa) ";
                sql += "VALUES ('"+placa+"')";
                if (conec.noQuery(sql) == null) {
                    return true;
                } else {
                    return false;
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El transportista ya se encuentra registrado en la base de datos");
            return false;
        }finally{
            try {
                conec.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(e);
            }            
        }   
    }
    public boolean ActualizarPersona(String Ced, String nomb, String Ape, String correo, String dir, String telf, String cel, String ciudad, String direcciondom, String placa){
        ConexionDB conec=new ConexionDB();  
        String sql;
        sql = "UPDATE persona ";
        sql += "SET nombre = '"+nomb+"', apellido = '"+Ape+"', correo = '"+correo+"', direccion = '"+dir+"', telefono = '"+telf+"', celular = '"+cel+"', ciudad = '"+ciudad+"'";
        sql += "WHERE cedula = '"+Ced+"'";        
        if (conec.noQuery(sql) == null) {
            ActualizarTransportista(placa);
            return true;
        } else {
            return false;
        }
    }

        
   
    public boolean ActualizarTransportista(String placa){
        ConexionDB con=new ConexionDB();  
        String sql;
        sql = "Update proveedor ";
        sql += "SET codigo_proveedor ='"+placa+"' ";

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
        sql = "delete from cliente where codigo_transportista ='"+codigo+"'";
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
     public List<Transportista> mostrarClientes(String codigo, String campo){
        ConexionDB conec=new ConexionDB();  
        try {
        String sql = "SELECT * FROM vista_cliemte_comp where UPPER("+campo+") like UPPER('"+codigo+"%')";
        ResultSet rs = conec.query(sql);
        List<Transportista> listaC = new ArrayList<Transportista>();
            while (rs.next()) {
                Transportista t= new Transportista();
                
               
                t.setCedula(rs.getString("cedula"));
                t.setApellido(rs.getString("apellido"));
                t.setNombre(rs.getString("nombre"));
                t.setTelefono(rs.getString("telefono"));
                t.setCelular(rs.getString("celular"));
//                t.setProvincia(rs.getString("domicilio"));
                t.setDireccion(rs.getString("direccion"));
                t.setCiudad(rs.getString("ciudad"));
                t.setCorreo(rs.getString("correo"));
                t.setPlaca(rs.getString("placa"));
                listaC.add(t);
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