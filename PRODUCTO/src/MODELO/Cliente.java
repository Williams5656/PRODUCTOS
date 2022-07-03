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
public class Cliente extends Persona{

    private int codigo_cliente;
    private String domicilio;

    //constructores
    
    public Cliente() {
    }

    public Cliente(int codigo_cliente, String ciudad_cliente, String cedula, String nombre, String apellido, String correo, String direccion, String telefono, String fecha_nac, String ciudad, String celular, String domicilio) {
        super(cedula, nombre, apellido, correo, direccion, telefono, fecha_nac, ciudad, celular);
        this.codigo_cliente = codigo_cliente;
        this.domicilio = domicilio;
    }

    //getters y setters

    public int getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(int codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

//metodos DB

//Inserta persona
    public boolean InsertarPersona(String Ced, String nomb, String Ape, String Dir, String telf, String cel, String ciudad, String direcciondom, String correo) {
        ConexionDB conec=new ConexionDB();  
        try {
            String sql;
                sql = "Insert into persona ";
                sql += "(cedula, nombre, apellido, direccion, telefono, celular, correo, ciudad)";
                sql += "VALUES ('"+Ced+"', '"+nomb+"', '"+Ape+"', '"+Dir+"', '"+telf+"', '"+cel+"', '"+correo+"', '"+ciudad+"')";
                if (conec.noQuery(sql) == null) {
                    InsertarCliente(direcciondom,Ced);
                    return true;
                } else {
                    return false;
                }
        } catch (Exception e) {
            //En caso de que la persona ya se encuentre registrada en la base, solo se añadiran los datos adicionales como cliente
            InsertarCliente(direcciondom,Ced);
            return false;
        }finally{
            try {
                conec.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(e);
            }            
        }   
    }       
    
//Inserta Cliente
    public boolean InsertarCliente(String direcdom, String cedula) {
        ConexionDB conec=new ConexionDB();  
        try {
            String sql;
                sql = "Insert into cliente ";
                sql += " (cedula_persona, domicilio) ";
                sql += "VALUES ('"+cedula+"','"+direcdom+"')";
                if (conec.noQuery(sql) == null) {
                    return true;
                } else {
                    return false;
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El Cliente ya se encuentra registrado en la base de datos");
            return false;
        }finally{
            try {
                conec.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(e);
            }            
        }   
    }
//Editar Persona
    public boolean ActualizarPersona(String Ced, String nomb, String Ape, String correo, String dir, String telf, String cel, String ciudad, String direcciondom){
        ConexionDB conec=new ConexionDB();  
        String sql;
        sql = "UPDATE persona ";
        sql += "SET nombre = '"+nomb+"', apellido = '"+Ape+"', correo = '"+correo+"', direccion = '"+dir+"', telefono = '"+telf+"', celular = '"+cel+"', ciudad = '"+ciudad+"'";
        sql += "WHERE cedula = '"+Ced+"'";        
        if (conec.noQuery(sql) == null) {
            ActualizarCliente(direcciondom,Ced);
            return true;
        } else {
            return false;
        }
    }    
//Editar Cliente 
    public boolean ActualizarCliente(String direcdom, String cedula){
        ConexionDB conec=new ConexionDB();  
        String sql;
        sql = "Update cliente ";
        sql += "SET direcciondomicilio ='"+direcdom+"' ";
        sql += "WHERE cedula_persona = '"+cedula+"'";
        if (conec.noQuery(sql) == null) {
                        try {
                conec.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(e);
            } 
            return true;
        } else {
                        try {
                conec.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(e);
            } 
            return false;
        }        
    } 
    
//Eliminar Clientes   
    public boolean EliminarCliente(String cedula){
        ConexionDB conec=new ConexionDB();
        try {

        String sql;
        sql = "delete from cliente where cedula_persona ='"+cedula+"'";
        if (conec.noQuery(sql) == null) {
                        try {
                conec.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(e);
            } 
            return true;
        } else {
                        try {
                conec.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(e);
            } 
            return false;
        }            
        } catch (Exception ex) {
           return false;
        }
    }     
    
//mostrar los clientes de la base 
    public List<Cliente> mostrarClientes(String cedula, String campo){
        ConexionDB conec=new ConexionDB();  
        try {
        String sql = "SELECT * FROM vista_cliemte_comp where UPPER("+campo+") like UPPER('"+cedula+"%')";
        ResultSet rs = conec.query(sql);
        List<Cliente> listaC = new ArrayList<Cliente>();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setCedula(rs.getString("cedula"));
                c.setApellido(rs.getString("apellido"));
                c.setNombre(rs.getString("nombre"));
                c.setTelefono(rs.getString("telefono"));
                c.setCelular(rs.getString("celular"));
                c.setDomicilio(rs.getString("domicilio"));
                c.setDireccion(rs.getString("direccion"));
                c.setCiudad(rs.getString("ciudad"));
                c.setCorreo(rs.getString("correo"));
                listaC.add(c);
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
