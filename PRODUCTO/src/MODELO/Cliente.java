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
public class Cliente {

    private int codigo_cliente;
    private String tipoid, idcliente, nombres, aliassucur, codsucur, direccion, telefono, celular, correo, provincia, ciudad;

    //constructores
    
    public Cliente() {
    }

    public Cliente(int codigo_cliente, String tipoid, String idcliente, String nombres, String aliassucur, String codsucur, String direccion, String telefono, String celular, String correo, String provincia, String ciudad) {
        this.codigo_cliente = codigo_cliente;
        this.tipoid = tipoid;
        this.idcliente = idcliente;
        this.nombres = nombres;
        this.aliassucur = aliassucur;
        this.codsucur = codsucur;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.correo = correo;
        this.provincia = provincia;
        this.ciudad = ciudad;
    }
    
    //Getters y Setters
    public String getTipoid() {
        return tipoid;
    }

    public void setTipoid(String tipoid) {
        this.tipoid = tipoid;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getAliassucur() {
        return aliassucur;
    }

    public void setAliassucur(String aliassucur) {
        this.aliassucur = aliassucur;
    }

    public String getCodsucur() {
        return codsucur;
    }

    public void setCodsucur(String codsucur) {
        this.codsucur = codsucur;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

//metodos DB

//Inserta Cliente
    public boolean InsertarCliente(String tipid, String idcli, String nomb, String aliasS, String codsuc, String dir, String telf, String cel, String corr, String prov, String ciu) {
        ConexionDB conec=new ConexionDB();  
        try {
            String sql;
                sql = "Insert into cliente ";
                sql += " (tipo_id, id_cliente, nombres, alias_sucursal, cod_sucursal, direccion, telefono, celular, correo, provincia, ciudad, eliminado) ";
                sql += "VALUES ('"+tipid+"','"+idcli+"','"+nomb+"','"+aliasS+"','"+codsuc+"','"+dir+"','"+telf+"','"+cel+"','"+corr+"','"+prov+"','"+ciu+"', '1')";
                if (conec.noQuery(sql) == null) {
                    return true;
                } else {
                    return false;
                }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }finally{
            try {
                conec.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(e);
            }            
        }   
    }
//Editar Cliente 
    public boolean ActualizarCliente(String tipid, String idcli, String nomb, String aliasS, String codsuc, String dir, String telf, String cel, String corr, String prov, String ciu){
        ConexionDB conec=new ConexionDB();  
        String sql;
        sql = "Update cliente ";
        sql += "SET  nombres='"+nomb+"', alias_sucursal= '"+aliasS+"', cod_sucursal='"+codsuc+"', direccion='"+dir+"', telefono='"+telf+"', celular='"+cel+"', correo='"+corr+"', provincia='"+prov+"', ciudad='"+ciu+"' ";
        sql += "WHERE id_cliente = '"+idcli+"'";
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
        sql = "update cliente set eliminado = 0 where id_cliente ='"+cedula+"'";
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
    public List<Cliente> mostrarClientes(String busca, String campo){
        ConexionDB conec=new ConexionDB();  
        try {
        String sql = "SELECT * FROM cliente where UPPER("+campo+") like UPPER('"+busca+"%') and eliminado = 1";
        ResultSet rs = conec.query(sql);
        List<Cliente> listaC = new ArrayList<Cliente>();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setIdcliente(rs.getString("id_cliente"));
                c.setNombres(rs.getString("nombres"));
                c.setTipoid(rs.getString("tipo_id"));
                c.setAliassucur(rs.getString("alias_sucursal"));
                c.setCodsucur(rs.getString("cod_sucursal"));
                c.setDireccion(rs.getString("direccion"));
                c.setTelefono(rs.getString("telefono"));
                c.setCelular(rs.getString("celular"));
                c.setCorreo(rs.getString("correo"));
                c.setProvincia(rs.getString("provincia"));
                c.setCiudad(rs.getString("ciudad"));
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
