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
public class Transportista {
    private String TipoId;
    private String Id;
    private String RazonSocial;
    private String Telefono;
    private String Celular;
    private String Direccion;
    private String Ciudad;
    private String Provincia;
    private String Correo;
    private String Placa;

    public Transportista(String TipoId, String Id, String RazonSocial, String Telefono, String Celular, String Direccion, String Ciudad, String Provincia, String Correo, String Placa) {
        this.TipoId = TipoId;
        this.Id = Id;
        this.RazonSocial = RazonSocial;
        this.Telefono = Telefono;
        this.Celular = Celular;
        this.Direccion = Direccion;
        this.Ciudad = Ciudad;
        this.Provincia = Provincia;
        this.Correo = Correo;
        this.Placa = Placa;
    }
    public Transportista(){
        
    }

    public String getTipoId() {
        return TipoId;
    }

    public void setTipoId(String TipoId) {
        this.TipoId = TipoId;
    }

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

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }
    
      public boolean InsertarTransportista(String tipid, 
              String id, 
              String razon,
              String telf,
              String celular, 
              String dir,
              String ciud, 
              String prov,
              String corr, 
              String placa) {
        ConexionDB conec=new ConexionDB();  
        try {      String sql;
                sql = "Insert into transportista ";
                sql += " (tipo_id, id_proveedor, razon, telefono, celular, ciudad, provincia,  correo, placa, eliminado) ";
                sql += "VALUES ('"+tipid+"','"+id+"','"+razon+"','"+telf+"','"+celular+"','"+ciud+"','"+prov+"','"+corr+"','"+placa+"', '1')";
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
     public boolean ActualizarTransportista( String id, String razon, String telf,String celular, 
              String dir, String ciud, String prov, String corr, String placa){
        ConexionDB conec=new ConexionDB();  
        String sql;
        sql = "Update cliente ";
        sql += "SET  nombres='"+razon+"', telefono='"+telf+"', celular='"+celular+"', direccion='"+dir+"', ciudad='"+ciud+"', provincia='"+prov+"',correo='"+corr+"',placa='"+placa+"' ";
        sql += "WHERE id_cliente = '"+id+"'";
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
    public boolean EliminarpTransportista(String cedula){
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
    public List<Transportista> mostrarTransportista(String cedula){
        ConexionDB conec=new ConexionDB();  
        try {
        String sql = "SELECT * FROM cliente where UPPER(id_cliente) like UPPER('"+cedula+"%') and eliminado = 1";
        ResultSet rs = conec.query(sql);
        List<Transportista> listaC = new ArrayList<Transportista>();
            while (rs.next()) {
                Transportista t = new Transportista();
                t.setId(rs.getString("Id_Transportista"));
                t.setRazonSocial(rs.getString("RazónSocial"));
                t.setTipoId(rs.getString("Tipo_id"));
                 t.setDireccion(rs.getString("direccion"));
                t.setTelefono(rs.getString("telefono"));
                t.setCelular(rs.getString("celular"));
                t.setCorreo(rs.getString("correo"));
                t.setProvincia(rs.getString("provincia"));
                t.setCiudad(rs.getString("ciudad"));
                t.setPlaca(rs.getString("placa"));
                listaC.add(t);
            }
            rs.close();
            return listaC;
        } catch (SQLException ex) {
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
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
