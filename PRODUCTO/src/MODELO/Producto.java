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
public class Producto {

    private String nombre_producto;
    private int codigo_producto;
    private String descripcion;
    private double precio;
    private int existencia;

    public Producto(String nombre_producto, int codigo_producto, String descripcion, double precio, int existencia) {
        this.nombre_producto = nombre_producto;
        this.codigo_producto = codigo_producto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencia = existencia;
    }

    public Producto() {
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    ConexionDB conec = new ConexionDB();

    //IMPLEMENTACION DE MÉTODOS
//CREAR PRODUCTO
    public boolean CrearProducto() {
        String sql = new String();
//        String sentencia;

        sql = "INSERT INTO producto (cod_producto,nombre, descripcion, existencia,precio)";
        sql = sql + "VALUES('" +getCodigo_producto () + "','" + getNombre_producto() + "','" + getDescripcion() + "','"
                + getExistencia() + "','" + getPrecio() + "','TRUE')";
        return conec.accion(sql);

    }

    /*
    public boolean CrearProducto(String nombre_producto, String codigo_producto, String descripcion, double precio, int existencia) {

        try {
            String sql;
            sql = "Insert into producto ";
            sql += "(nombre_producto, codigo_producto, descripcion, precio, existencia)";
            sql += "VALUES ('" + nombre_producto + "', '" + codigo_producto + "', '" + descripcion + "', '" + precio + "', '" + existencia + "')";
            if (conec.noQuery(sql) == null) {
                // CrearProducto(nombre_producto,codigo_producto,descripcion,precio,existencia);

                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El producto ya se encuentra registrado en la base de datos");
            return false;
        } finally {
            try {
                conec.CerrarConexion();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
     */
//EDITAR PRODUCTO
    public boolean EditarProducto(int codigo_producto) {
//cod_producto,nombre, descripcion, existencia,precio)
        String sql = "UPDATE producto SET nombre='" + getNombre_producto() + "',descripcion='"
                + getDescripcion() + "',precio='" + getPrecio() + "',existencia='"
                + getExistencia() + "'WHERE cod_producto=" + codigo_producto + ";";
        return conec.accion(sql);
    }
//ELIMINAR    

    public boolean EliminarProducto(int codigo_producto) {

        try {

            String sql;
            sql = "delete from producto where cod_producto ='" + codigo_producto + "'";
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

    
      public List<Producto> prolist() {

        try {
            
             //String sql = "SELECT * FROM producto WHERE estado_socio='true' AND nombre_socio<>'Cuenta' "
               //     + "ORDER BY nombre DESC";
            String sql = "SELECT * FROM producto ORDER BY nombre DESC";
            ResultSet rs = conec.query(sql);
            List<Producto> ls = new ArrayList<Producto>();

            while (rs.next()) {
                Producto pro = new Producto();
                pro.setCodigo_producto(rs.getInt("cod_producto"));
                pro.setNombre_producto(rs.getString("nombre"));
                pro.setDescripcion(rs.getString("descripcion"));
                pro.setExistencia(rs.getInt("existencia"));
                pro.setPrecio(rs.getDouble("precio"));

                ls.add(pro);
            }
            rs.close();
            return ls;
        } catch (SQLException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    
//mostrar los clientes de la base 
    public List<Producto> productos(String aguja) {

        try {
            String sql = "SELECT * FROM producto WHERE";
            sql += " UPPER(cod_producto) like UPPER('%" + aguja + "%') OR";
            sql += " UPPER(nombre) like UPPER('%" + aguja + "%') OR";
            sql += " UPPER(descripcion) like UPPER('%" + aguja + "%') ";

            ResultSet rs = conec.query(sql);
            List<Producto> lista_pro = new ArrayList<Producto>();

            while (rs.next()) {
                Producto prod = new Producto();

                prod.setNombre_producto(rs.getString(nombre_producto));
                prod.setCodigo_producto(rs.getInt(codigo_producto));
                prod.setDescripcion(rs.getString(descripcion));

                prod.setPrecio(rs.getDouble("precio"));
                prod.setExistencia(rs.getInt(existencia));

                lista_pro.add(prod);
            }
            rs.close();
            return lista_pro;
        } catch (SQLException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
}
