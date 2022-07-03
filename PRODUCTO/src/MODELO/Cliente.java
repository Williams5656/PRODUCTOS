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
    
    public List<Cliente> mostrarClientes(){
        ConexionDB conec=new ConexionDB();  
        try {
        String sql = "SELECT * FROM vista_cliente";
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
