/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Producto;
import VISTA.CRUD.VcrudProducto;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prisc
 */
public class ControlCRUDProducto {

    Producto prod=new Producto();
    VcrudProducto vcp=new VcrudProducto();

    public void inicarControl(VcrudProducto vcp) {
        CargarProductos(vcp, "", "nombre");
        vcp.getBtnAgregarArt().addActionListener(l -> AgregarProducto(vcp));
        vcp.getBtnGuardarProd().addActionListener(l->GuardarProducto(vcp));
    }

    //Cargar Datos a la tabla    
    private void CargarProductos(VcrudProducto vcp, String nombre, String campo){
        List<Producto> ListaC = prod.mostrarProductos(nombre, campo);
        DefaultTableModel mtdTable;
        mtdTable = (DefaultTableModel)vcp.getJtb_productos().getModel();
        mtdTable.setRowCount(0);
        ListaC.forEach(p->{
        String Fila[]={p.getIdP(),p.getNombreP(),Double.toString(p.getPrecio1()),Double.toString(p.getPrecio2()),Double.toString(p.getPrecio3()),p.getTipoIVAP(),p.getIceP(),p.getMStockP(),Integer.toString(p.getStock())};
        mtdTable.addRow(Fila);
        });
        vcp.getJtb_productos().setModel(mtdTable);
    }        
    
    //Agregar Producto
    private void AgregarProducto(VcrudProducto vcp) {
        vcp.getJdProducto().setVisible(true);
        vcp.getJdProducto().setSize(730, 450);
        vcp.getJdProducto().setResizable(false);
        vcp.getJdProducto().setTitle("Agregar");
    }


    public void GuardarProducto(VcrudProducto vcp){        
        //Agregar
        if(vcp.getJdProducto().getTitle().equalsIgnoreCase("Agregar")){
            List<Producto> Bp = new ArrayList<>();
                try {
                    Bp = prod.mostrarProductos(vcp.getTxtCodProd().getText(),"codigo_prod");
                    Bp.get(0).getCodigoP().equalsIgnoreCase("");
                    JOptionPane.showMessageDialog(null, "Ya existe otro producto con el mismo codigo");
                } catch (Exception e) {
                    prod.InsertarProducto(vcp.getTxtCodProd().getText(),vcp.getTxtNombreProd().getText(),vcp.getTxtDescProd().getText(),"1",vcp.getTxtPrecio1Prod().getText(),vcp.getTxtPrecio2Prod().getText(),vcp.getTxtPrecio3Prod().getText(),vcp.getCbTipoProd().getSelectedItem().toString(),vcp.getCbTipoIvaProd().getSelectedItem().toString(),vcp.getCbIceProd().getSelectedItem().toString(),vcp.getCbMStockProd().getSelectedItem().toString(),vcp.getCbCateProd().getSelectedItem().toString(),ObtenFecha(vcp),vcp.getTxtSubsiProd().getText(),vcp.getCbUnidadProd().getSelectedItem().toString(),vcp.getTxtCodAuxProd().getText());
                    JOptionPane.showMessageDialog(vcp, "Guardado Exitoso");
                    CargarProductos(vcp, "","nombre");
                    vcp.getJdProducto().dispose(); 
                }
        }        
        //editar
        if(vcp.getJdProducto().getTitle().equalsIgnoreCase("Editar")){
            try{
//                cli.ActualizarPersona(vc.getTxtCedulaCli().getText(), vc.getTxtNombre().getText(),vc.getTxtApellido().getText(), vc.getTxtCorreo().getText(), vc.getTxtDireccion().getText(),vc.getTxtTelefono().getText(), vc.getTxtCelular().getText(), vc.getTxtCiudad().getText(), vc.getTxtDireccionDom().getText());
                JOptionPane.showMessageDialog(vcp, "Cambios guardados con exito");
                CargarProductos(vcp, "","nombre");
                vcp.getJdProducto().dispose();
            }catch(Exception e){
                System.out.println(e);
            }
        }         
    }       
    


    public void limpiar(VcrudProducto vcp) {
        vcp.getTxtCodProd().setText("");
        vcp.getTxtPrecio1Prod().setText("");
        vcp.getTxtPrecio2Prod().setText("");
        vcp.getTxtPrecio3Prod().setText("");
        vcp.getTxtNombreProd().setText("");
        vcp.getTxtDescProd().setText("");
        vcp.getCbTipoProd().setSelectedIndex(1);
        vcp.getCbTipoIvaProd().setSelectedIndex(1);
        vcp.getCbIceProd().setSelectedIndex(1);
        vcp.getCbMStockProd().setSelectedIndex(1);
        vcp.getCbCateProd().setSelectedIndex(1);
        vcp.getJcFVenciProd().setDate(null);
        vcp.getTxtSubsiProd().setText("");
        vcp.getCbUnidadProd().setSelectedIndex(1);
        vcp.getTxtCodAuxProd().setText("");
        
        
    }

    private void crearProducto() {
//        System.out.println("craer producto");
//        fila = 0;
//        int ced;
//        if (vista.getTxtCodArticulo().getText() == null || "".equals(vista.getTxtNombre().getText()) || "".equals(vista.getTxtDescripcion().getText())
//                || "".equals(vista.getTxtExistencia().getText()) || "".equals(vista.getJtxtPrecioCompraBase().getText())) {
//            JOptionPane.showMessageDialog(null, " Existen campos vacíos, llenar todos por favor ", "DATOS INCOMPLETOS", 0);
//        } else {
//
//            String codigo = vista.getTxtCodArticulo().getText();
//            String nombre = vista.getTxtNombre().getText();
//            String descripcion = vista.getTxtDescripcion().getText();
//            String existencia = vista.getTxtExistencia().getText();
//            String precio = vista.getJtxtPrecioCompraBase().getText();
//
//            ModeloProducto produ = new ModeloProducto();
//
//            produ.setCodigo_producto(Integer.parseInt(codigo));
//            // produ.setNumero_cuenta(Integer.parseInt(num_cuenta));
//            produ.setNombre_producto(nombre);
//            produ.setDescripcion(descripcion);
//            produ.setExistencia(Integer.parseInt(existencia));
//            produ.setPrecio(Double.parseDouble(precio));
//
//            if (produ.AgregarProducto()) {
//                JOptionPane.showMessageDialog(vista, "DATOS REGISTRADOS CORRECTAMENTE");
//                cargarDatos();
//
//            } else {
//                JOptionPane.showMessageDialog(vista, "ERROR");
//            }
//            limpiar();
//            
//            vista.getjDialog().setVisible(false);
//
//        }
    }

    private void editarProducto() {
//
//        int op = JOptionPane.showOptionDialog(null,
//                "¿Está seguro de modificar al producto a continuación?", "ADVERTENCIA", JOptionPane.YES_NO_CANCEL_OPTION, 3, null, new Object[]{"SI", "NO"}, null);
//        if (op == 0) {
//
//            if (vista.getTxtCodArticulo().getText() == null || "".equals(vista.getTxtNombre().getText()) || "".equals(vista.getTxtDescripcion().getText())
//                    || "".equals(vista.getTxtExistencia().getText()) || "".equals(vista.getJtxtPrecioCompraBase().getText())) {
//            } else {
//
//                String codigo = vista.getTxtCodArticulo().getText();
//                String nombre = vista.getTxtNombre().getText();
//                String descripcion = vista.getTxtDescripcion().getText();
//                String existencia = vista.getTxtExistencia().getText();
//                String precio = vista.getJtxtPrecioCompraBase().getText();
//
//                ModeloProducto produ = new ModeloProducto();
//                produ.setCodigo_producto(Integer.parseInt(codigo));
//                // produ.setNumero_cuenta(Integer.parseInt(num_cuenta));
//                produ.setNombre_producto(nombre);
//                produ.setDescripcion(descripcion);
//                produ.setExistencia(Integer.parseInt(existencia));
//                produ.setPrecio(Double.parseDouble(precio));
//
//                if (produ.EditarProducto(Integer.parseInt(vista.getTxtCodArticulo().getText().toString()))) {
//                    JOptionPane.showMessageDialog(vista, "SE HA MODIFICADO CORRECTAMENTE");
//
//                } else {
//                    JOptionPane.showMessageDialog(vista, "ERROR");
//                }
//                 limpiar();
//                vista.getjDialog().setVisible(false);
//
//            }
//            cargarDatos();
//            //desactivarBotones();
//        }

    }

    
    //Obtener Fecha Seleccionada
    private String ObtenFecha(VcrudProducto vcp){
        int d, m, a;
        d = vcp.getJcFVenciProd().getCalendar().get(Calendar.DAY_OF_MONTH);
        m = 1+(vcp.getJcFVenciProd().getCalendar().get(Calendar.MONTH));
        a = vcp.getJcFVenciProd().getCalendar().get(Calendar.YEAR);
        String fe = (a+"-"+m+"-"+d);
        return fe;
    }
}
