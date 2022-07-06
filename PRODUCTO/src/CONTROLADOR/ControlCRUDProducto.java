/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Producto;

import VISTA.CRUD.VcrudProducto;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author prisc
 */
public class ControlCRUDProducto {

    Producto producto = new Producto();
   VcrudProducto pro= new VcrudProducto();

    /*
    public ControlCRUDProductorudProducto pro) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setTitle("Datos y registro del Socio");
        vista.setVisible(true);
        cargarDatos();
        desactivarBotones();
        vista.getTxtFechaIngreso().setText(FechaActual());
        vista.getTxtFechaIngreso().setEditable(false);
        vista.getTxtNumCuenta().setEditable(false);
        vista.getTxtCodigo().setEditable(false);

    }
     */
    public void ControlProducto(VcrudProducto pro) {
        this.pro = pro;
        //FALTA
    }

    private void crearProducto() {
        int fila = 0;
        int ced;
        if (pro.getTxtNombre().getText() == null || "".equals(pro.getTxtCodArticulo().getText()) || "".equals(pro.getTxtBuscarEmp().getText())
                || "".equals(pro.getTxtDescripcion().getText())) {
            JOptionPane.showMessageDialog(null, " Existen campos vacíos, llenar todos por favor ", "DATOS INCOMPLETOS", 0);
        } else {

//String nombre_producto, String codigo_producto, String descripcion, double precio, int existencia)
            String nombre_producto = pro.getTxtNombre().getText();
            String codigo_producto = pro.getTxtCodArticulo().getText();
            String descripcion = pro.getTxtDescripcion().getText();
            //String precio = pro.().getText();
            //int existencia = pro.gett().getText();

            producto.setNombre_producto(nombre_producto);
            producto.setCodigo_producto(codigo_producto);
            producto.setDescripcion(descripcion);

            //producto.setPrecio(Double.parseDouble(precio));
            //producto.setExistencia(Integer.parseInt(existencia));
            if (producto.CrearProducto()) {
                JOptionPane.showMessageDialog(pro, "PRODUCTO REGISTRADO CORRECTAMENTE");

            } else {
                JOptionPane.showMessageDialog(pro, "ERROR");
            }
            //limpiar();

        }
    }

}

//cargarDatos();
    

//EDITAR

   //ELIMINAR

          
       

    

