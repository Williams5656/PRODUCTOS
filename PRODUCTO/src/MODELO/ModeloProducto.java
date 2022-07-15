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
public class ModeloProducto extends Producto {

    public ModeloProducto() {
    }

    public ModeloProducto(String nombre_producto, int codigo_producto, String descripcion, double precio, int existencia) {
        super(nombre_producto, codigo_producto, descripcion, precio, existencia);
    }

    ConexionDB con = new ConexionDB();

    //LISTAR
    public List<Producto> listaProducto() {
        boolean a = false;

        try {
            String sql = "SELECT * FROM producto ";
            ResultSet rs = con.consulta(sql);
            ArrayList<Producto> lt = new ArrayList<Producto>();
            while (rs.next()) {
                Producto t = new Producto();

                t.setCodigo_producto(rs.getInt("cod_producto"));
                t.setNombre_producto(rs.getString("nombre"));
                t.setDescripcion(rs.getString("descripcion"));
                t.setExistencia(rs.getInt("existencia"));
                t.setPrecio(rs.getDouble("precio"));

                lt.add(t);
                a = true;
            }
            rs.close();

            return lt;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloProducto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
  //BUSCAR 

    public List<Producto> productos(String aguja) {

        try {
            String sql = "SELECT * FROM producto WHERE ";
            sql += " cod_producto=  "+aguja+ " OR";
            sql += " UPPER(nombre) like UPPER('%" + aguja + "%') OR";
            sql += " UPPER(descripcion) like UPPER('%" + aguja + "%') OR";
            sql += " existencia=  "+aguja ;

            ResultSet rs = con.consulta(sql);
            List<Producto> ls = new ArrayList<Producto>();

            while (rs.next()) {

                Producto t = new Producto();

                t.setCodigo_producto(rs.getInt("cod_producto"));
                t.setNombre_producto(rs.getString("nombre"));
                t.setDescripcion(rs.getString("descripcion"));
                t.setExistencia(rs.getInt("existencia"));
                t.setPrecio(rs.getDouble("precio"));

                ls.add(t);
            }
            rs.close();
            return ls;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloProducto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    //AGREGAR PRODUCTO
    public boolean AgregarProducto() {
        System.out.println(getCodigo_producto());
        System.out.println("aqui agrego producto en el modelo");
        //cod_producto,nombre, descripcion, existencia,precio)
        String sql = "INSERT INTO producto(cod_producto,nombre,descripcion,existencia,precio)"
                + "VALUES('" + getCodigo_producto() + "','" + getNombre_producto() + "','" + getDescripcion()
                + "','" + getExistencia() + "','" + getPrecio() + "')";
        return con.accion(sql);
    }
    //
    //EDITAR PRODUCTO

    public boolean EditarProducto(int codigo_producto) {

        System.out.println("modifico" + getNombre_producto());
        String sql = "UPDATE producto SET nombre='" + getNombre_producto() + "',descripcion='"
                + getDescripcion() + "',precio='" + getPrecio() + "',existencia='"
                + getExistencia() + "'WHERE cod_producto=" + codigo_producto + ";";

        return conec.accion(sql);
    }
//ELIMINAR    

    public boolean EliminarProducto(String codigo_producto) {

        try {

            String sql;
            sql = "delete from producto where cod_producto ='" + codigo_producto + "'";
            System.out.println(codigo_producto);
            if (conec.noQuery(sql) == null) {

                return true;
            }
            conec.CerrarConexion();
            return false;
        } catch (Exception ex) {

            return false;
        }
    }

}
