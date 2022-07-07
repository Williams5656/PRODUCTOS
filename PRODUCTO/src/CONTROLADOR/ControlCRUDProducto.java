/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Producto;


import VISTA.CRUD.VcrudProducto;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author prisc
 */
public class ControlCRUDProducto {

      private Producto producto;
    private VcrudProducto pro;
      int fila, n;
    char digito = 1;
   
    
    

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
        this.producto = producto;
        this.pro = pro;
        pro.setTitle("Productos");
        pro.setVisible(true);
        //cargarDatos();
        //desactivarBotones();
       
        pro.getTxtCodArticulo().setEditable(false);
    }

    
       public void IniciarControl() {

      

        KeyListener buscador;
        buscador = new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //cargarDatosbusqueda(pro.getTxtBuscarEmp().getText());
            }

            @Override
            public void keyTyped(KeyEvent evt) {

            }
        };
        pro.getJtb_productos().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                habilitarBoton(evt);
            }
        });

        pro.getTxtBuscarEmp().addKeyListener(buscador);
        pro.getBtnAgregarArt().addActionListener(l -> mostrarDialogo(1));
        pro.getBtnEditarArt().addActionListener(l -> mostrarDialogo(2));
        

       
    }
    
       
       public void mostrarDialogo(int origen) {
        pro.getjDialog().setSize(711, 443);
        pro.getjDialog().setLocationRelativeTo(pro);
        fila = pro.getJtb_productos().getSelectedRow();
        if (origen == 1) {
            n = 1;
            //limpiar();
            pro.getjDialog().setTitle("Crear Productos");
           
            pro.getTxtCodArticulo().setVisible(false);
            pro.getTxtDescripcion().setEditable(true);
        } else {
            n = 2;
            mostrarDatos();
            pro.getjDialog().setTitle("Editar Producto");
            pro.getTxtCodArticulo().setEditable(false);
            //pro.getBtnNuevaCuenta().setVisible(false);
           // pro.getLblCodigo().setVisible(true);
            //pro.getTxtCodigo().setVisible(true);
        }
        pro.getjDialog().setVisible(true);
    }
       
       
       public void mostrarDatos() {

        List<Producto> produ = producto.prolist();

        int fila = pro.getJtb_productos().getSelectedRow();

        pro.getTxtCodArticulo().setText(String.valueOf(produ.get(fila).getCodigo_producto()));
        pro.getTxtNombre().setText(String.valueOf(produ.get(fila).getNombre_producto()));
        pro.getTxtDescripcion().setText(String.valueOf(produ.get(fila).getDescripcion()));
        pro.getJtxtPrecioCompraBase().setText(String.valueOf(produ.get(fila).getPrecio()));
      //  pro.get().setText(String.valueOf(socios.get(fila).getCorreo_socio()));
    }
       /*
       private void cargarDatos() {
        DefaultTableModel dtm;
        dtm = (DefaultTableModel) pro.getJtb_productos().getModel();
        dtm.setNumRows(0);
        List<Producto> lista = producto.prolist();
        lista.stream().forEach(s -> {
            String[] producto = {Integer.toString(s.getCodigo_producto()), s.getNombre_producto(),
               Integer.toString(s()) ,s.getDescripcion(), s.getExistencia(), s.getPrecio()};
            dtm.addRow(producto);
        });
    }
*/
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
            //String precio = pro.gettxgetText();
            //int existencia = pro.gett().getText();

            producto.setNombre_producto(nombre_producto);
            //producto.setCodigo_producto (codigo_producto);
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
    
    
    
    //Metodo para habilitar los botones cuando le de clic a un dato de la tabla
    private void habilitarBoton(java.awt.event.MouseEvent evt) {
        int column = pro.getJtb_productos().getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / pro.getJtb_productos().getRowHeight();
        if (row < pro.getJtb_productos().getRowCount() && row >= 0 && column < pro.getJtb_productos().getColumnCount() && column >= 0) {
            pro.getBtnEliminarArt().setEnabled(true);
            pro.getBtnEliminarArt().setEnabled(true);
        } else {
            String name = "" + pro.getJtb_productos().getValueAt(row, 1);
        }

    }
/*
     //Carga datos de cliente a la tabla
    private void CargarProducto(VcrudProducto pr, String cedula, String campo){
        List<Producto> Listap = p(cedula, campo);
        vcc.getJtb_cliente().setRowHeight(135);
        DefaultTableModel mtdTable;
        mtdTable = (DefaultTableModel)vcc.getJtb_cliente().getModel();
        mtdTable.setRowCount(0);
        ListaC.forEach(p->{
        String Fila[]={p.getCedula(),p.getApellido(),p.getNombre(), p.getCelular(), p.getDomicilio()};
        mtdTable.addRow(Fila);
        });
        vc.getJtb_cliente().setModel(mtdTable);
    }    
    */
    
    /*
     public void Eliminar(VcrudProducto pro){
        int filaseleccionada = pro.getJtb_productos().getSelectedRow();
        if(filaseleccionada<0){
            JOptionPane.showMessageDialog(null, "Seleccione el producto que desea eliminar");
        }else{
        int fila = pro.getJtb_productos().getSelectedRow();
         int codigo_producto = (int) pro.getJtb_productos().getValueAt(fila, 0);
                int elim = JOptionPane.showConfirmDialog( null, "¿Seguro que desea eliminar " + JOptionPane.YES_NO_OPTION);
                if(elim==0){
                    producto.EliminarProducto(codigo_producto);
                    //CargarCliente(pro, "", "codigo_producto");
                    JOptionPane.showMessageDialog(pro, "Cliente eliminado exitosamente");
                }
        }        
    }   
*/
}

 

          
       

    

