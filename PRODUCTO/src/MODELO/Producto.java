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
public class Producto{
    
    //Atributos
    private String CodigoP, idP;
    private double precio1, precio2, precio3, SubsiP;
    private String NombreP, DescripcionP, FechaVP, TipoP, TipoIVAP, IceP, MStockP, CategoriaP, UnidP, CodAuxP;
    private int Stock;
    //constructores
    
    public Producto() {
    }

    public Producto(String CodigoP, double precio1, double precio2, double precio3, String NombreP, String DescripcionP, String FechaVP, String TipoP, String TipoIVAP, String IceP, String MStockP, String CategoriaP, double SubsiP, String UnidP, String CodAuxP, String idP, int Stock) {
        this.idP = idP;
        this.CodigoP = CodigoP;
        this.precio1 = precio1;
        this.precio2 = precio2;
        this.precio3 = precio3;
        this.NombreP = NombreP;
        this.DescripcionP = DescripcionP;
        this.FechaVP = FechaVP;
        this.TipoP = TipoP;
        this.TipoIVAP = TipoIVAP;
        this.IceP = IceP;
        this.MStockP = MStockP;
        this.CategoriaP = CategoriaP;
        this.SubsiP = SubsiP;
        this.UnidP = UnidP;
        this.Stock = Stock;
        this.CodAuxP = CodAuxP;
    }

    //getters y setters

    public String getIdP() {
        return idP;
    }

    public void setIdP(String idP) {
        this.idP = idP;
    }
    
    public String getCodigoP() {
        return CodigoP;
    }

    public void setCodigoP(String CodigoP) {
        this.CodigoP = CodigoP;
    }

    public double getPrecio1() {
        return precio1;
    }

    public void setPrecio1(double precio1) {
        this.precio1 = precio1;
    }

    public double getPrecio2() {
        return precio2;
    }

    public void setPrecio2(double precio2) {
        this.precio2 = precio2;
    }

    public double getPrecio3() {
        return precio3;
    }

    public void setPrecio3(double precio3) {
        this.precio3 = precio3;
    }

    public String getNombreP() {
        return NombreP;
    }

    public void setNombreP(String NombreP) {
        this.NombreP = NombreP;
    }

    public String getDescripcionP() {
        return DescripcionP;
    }

    public void setDescripcionP(String DescripcionP) {
        this.DescripcionP = DescripcionP;
    }

    public String getFechaVP() {
        return FechaVP;
    }

    public void setFechaVP(String FechaVP) {
        this.FechaVP = FechaVP;
    }

    public String getTipoP() {
        return TipoP;
    }

    public void setTipoP(String TipoP) {
        this.TipoP = TipoP;
    }

    public String getTipoIVAP() {
        return TipoIVAP;
    }

    public void setTipoIVAP(String TipoIVAP) {
        this.TipoIVAP = TipoIVAP;
    }

    public String getIceP() {
        return IceP;
    }

    public void setIceP(String IceP) {
        this.IceP = IceP;
    }

    public String getMStockP() {
        return MStockP;
    }

    public void setMStockP(String MStockP) {
        this.MStockP = MStockP;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    
    public String getCategoriaP() {
        return CategoriaP;
    }

    public void setCategoriaP(String CategoriaP) {
        this.CategoriaP = CategoriaP;
    }

    public double getSubsiP() {
        return SubsiP;
    }

    public void setSubsiP(double SubsiP) {
        this.SubsiP = SubsiP;
    }

    public String getUnidP() {
        return UnidP;
    }

    public void setUnidP(String UnidP) {
        this.UnidP = UnidP;
    }

    public String getCodAuxP() {
        return CodAuxP;
    }

    public void setCodAuxP(String CodAuxP) {
        this.CodAuxP = CodAuxP;
    }
    
//metodos DB

//Inserta Producto
    public boolean InsertarProducto(String cod, String nomb, String desc, String stck, String pre, String pre2, String pre3, String tipp, String tipi, String ic, String mst, String cate, String fec, String subs, String und, String codaux   ) {
        ConexionDB conec=new ConexionDB();  
        try {
            String sql;
                sql = "Insert into producto ";
                sql += "( codigo_prod, nombre, descripcion, stock, precio, precio2, precio3, tipo_producto, tipo_iva, ice, maneja_stock, categoria_prod, fecha_venci, subsidio_unit, unidad, codigo_auxiliar, eliminado)";
                sql += "VALUES ('"+cod+"', '"+nomb+"', '"+desc+"', "+stck+", "+pre+","+pre2+","+pre3+", '"+tipp+"', '"+tipi+"', '"+ic+"', '"+mst+"', '"+cate+"', '"+fec+"', "+subs+", '"+und+"', '"+codaux+"', '1')";
                if (conec.noQuery(sql) == null) {
                    return true;
                } else {
                    return false;
                }
        } catch (Exception e) {
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
//    public boolean ActualizarPersona(String Ced, String nomb, String Ape, String correo, String dir, String telf, String cel, String ciudad, String direcciondom){
//        ConexionDB conec=new ConexionDB();  
//        String sql;
//        sql = "UPDATE persona ";
//        sql += "SET nombre = '"+nomb+"', apellido = '"+Ape+"', correo = '"+correo+"', direccion = '"+dir+"', telefono = '"+telf+"', celular = '"+cel+"', ciudad = '"+ciudad+"'";
//        sql += "WHERE cedula = '"+Ced+"'";        
//        if (conec.noQuery(sql) == null) {
//            ActualizarCliente(direcciondom,Ced);
//            return true;
//        } else {
//            return false;
//        }
//    }   
    
//Eliminar Clientes   
//    public boolean EliminarCliente(String cedula){
//        ConexionDB conec=new ConexionDB();
//        try {
//
//        String sql;
//        sql = "delete from cliente where cedula_persona ='"+cedula+"'";
//        if (conec.noQuery(sql) == null) {
//                        try {
//                conec.CerrarConexion();
//            } catch (SQLException e) {
//                System.err.println(e);
//            } 
//            return true;
//        } else {
//                        try {
//                conec.CerrarConexion();
//            } catch (SQLException e) {
//                System.err.println(e);
//            } 
//            return false;
//        }            
//        } catch (Exception ex) {
//           return false;
//        }
//    }     
    
//mostrar los productos de la base 
    public List<Producto> mostrarProductos(String nomb, String campo){
        ConexionDB conec=new ConexionDB();  
        try {
        String sql = "SELECT * FROM producto where UPPER("+campo+") like UPPER('"+nomb+"%')";
        ResultSet rs = conec.query(sql);
        List<Producto> listaP = new ArrayList<Producto>();
            while (rs.next()) {
                Producto p = new Producto();
                p.setIdP(rs.getString("id_producto"));
                p.setCodigoP(rs.getString("codigo_prod"));
                p.setPrecio1(rs.getDouble("precio"));
                p.setPrecio2(rs.getDouble("precio2"));
                p.setPrecio3(rs.getDouble("precio3"));
                p.setNombreP(rs.getString("nombre"));
                p.setDescripcionP(rs.getString("descripcion"));
                p.setTipoP(rs.getString("tipo_producto"));
                p.setTipoIVAP(rs.getString("tipo_iva"));
                p.setIceP(rs.getString("ice"));
                p.setMStockP(rs.getString("maneja_stock"));
                p.setCategoriaP(rs.getString("categoria_prod"));
                p.setFechaVP(rs.getString("fecha_venci"));
                p.setSubsiP(rs.getDouble("subsidio_unit"));
                p.setUnidP(rs.getString("unidad"));
                p.setCodAuxP(rs.getString("codigo_auxiliar"));
                p.setStock(rs.getInt("stock"));
                listaP.add(p);
            }
            rs.close();
            return listaP;
        } catch (SQLException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
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
