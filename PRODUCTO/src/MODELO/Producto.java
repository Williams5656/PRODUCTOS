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

    public ConexionDB getConec() {
        return conec;
    }

    public void setConec(ConexionDB conec) {
        this.conec = conec;
    }

    ConexionDB conec = new ConexionDB();

    //IMPLEMENTACION DE MÉTODOS
//CREAR PRODUCTO
    /*
    public boolean CrearProducto() {
        String sql;
//        

        sql = "INSERT INTO producto (cod_producto,nombre, descripcion, existencia,precio)";
        sql = sql + "VALUES('" + getCodigo_producto() + "','" + getNombre_producto() + "','" + getDescripcion() + "','"
                + getExistencia() + "','" + getPrecio() + "','TRUE')";
        return conec.accion(sql);

    }
     */
    public boolean CrearProducto(String nombre_producto, String codigo_producto, String descripcion, String precio, String existencia) {

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

}
