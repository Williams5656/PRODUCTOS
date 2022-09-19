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

/**
 *
 * @author Andrea
 */
public class Proveedor {
    
    private String Id;
    private String Tipo_id;
    private String RazonSocial;
    private String Sucursal;
    private String Telefono;
    private String Celular;
    private String Domicilio;
    private String Provincia;
    private String Ciudad;
    private String Codigo;
    private String Correo;

    
    //Constructores
    public Proveedor(String Id, String Tipo_id, String RazonSocial, String Sucursal, String Telefono, String Celular, String Domicilio, String Provincia, String Ciudad, String Codigo, String Correo) {
        this.Id = Id;
        this.Tipo_id = Tipo_id;
        this.RazonSocial = RazonSocial;
        this.Sucursal = Sucursal;
        this.Telefono = Telefono;
        this.Celular = Celular;
        this.Domicilio = Domicilio;
        this.Provincia = Provincia;
        this.Ciudad = Ciudad;
        this.Codigo = Codigo;
        this.Correo = Correo;
    }

    public Proveedor(){
        
    }
     
    //Getters y Setters

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public String getSucursal() {
        return Sucursal;
    }

    public void setSucursal(String Sucursal) {
        this.Sucursal = Sucursal;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTipo_id() {
        return Tipo_id;
    }

    public void setTipo_id(String Tipo_id) {
        this.Tipo_id = Tipo_id;
    }
    
    
    
    //Metodos de la Base
    
     public boolean InsertarProveedor(String tipo_id, String id, String nomb, String aliasS, String codsuc, String dir, String telf, String cel, String corr, String prov, String ciu) {
        ConexionDB conec=new ConexionDB();  
        try {
            String sql;
                sql = "Insert into proveedor ";
                sql += " (tipo_id, identificacion, nombres, alias_suc, cod_suc, direccion, telefono, celular, correo, provincia, ciudad, eliminado) ";
                sql += "VALUES ('"+tipo_id+"','"+id+"','"+nomb+"','"+aliasS+"','"+codsuc+"','"+dir+"','"+telf+"','"+cel+"','"+corr+"','"+prov+"','"+ciu+"', '1')";
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
     public boolean ActualizarProveedor( String tipid, String id, String nomb, String aliasS, String codsuc, String dir, String telf, String cel, String corr, String prov, String ciu){
        ConexionDB conec=new ConexionDB();  
        String sql;
        sql = "Update proveedor ";
        sql += "SET  nombres='"+nomb+"', alias_suc= '"+aliasS+"', cod_suc='"+codsuc+"', direccion='"+dir+"', telefono='"+telf+"', celular='"+cel+"', correo='"+corr+"', provincia='"+prov+"', ciudad='"+ciu+"' ";
        sql += "WHERE identificacion = '"+id+"'";
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
    public boolean EliminarProveedor(String cedula){
        ConexionDB conec=new ConexionDB();
        try {

        String sql;
        sql = "update proveedor set eliminado = 0 where identificacion ='"+cedula+"'";
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
    public List<Proveedor> mostrarProveedor(String busca, String campo){
        ConexionDB conec=new ConexionDB();  
        try {
        String sql = "SELECT * FROM proveedor where UPPER("+campo+") like UPPER('"+busca+"%') and eliminado= '1'";
        ResultSet rs = conec.query(sql);
        List<Proveedor> listaC = new ArrayList<Proveedor>();
            while (rs.next()) {
                Proveedor p = new Proveedor();
                  
                p.setId(rs.getString("identificacion"));
                p.setRazonSocial(rs.getString("nombres"));
                p.setSucursal(rs.getString("alias_suc"));
                p.setCodigo(rs.getString("cod_suc"));
                p.setDomicilio(rs.getString("direccion"));
                p.setTelefono(rs.getString("telefono"));
                p.setCelular(rs.getString("celular"));
                p.setCorreo(rs.getString("correo"));
                p.setProvincia(rs.getString("provincia"));
                p.setCiudad(rs.getString("ciudad"));
                 p.setTipo_id(rs.getString("tipo_id"));
                
                listaC.add(p);
            }
            rs.close();
            return listaC;
        } catch (SQLException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
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
