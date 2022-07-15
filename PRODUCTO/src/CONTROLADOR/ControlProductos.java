/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.ModeloProducto;
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
public class ControlProductos {
int opcion;
    private ModeloProducto modelo;
    // Producto producto = new Producto();
    private VcrudProducto vista;
    int fila;
    int n;
    ModeloProducto modelop = new ModeloProducto();

    public ControlProductos() {
        System.out.println("CONTROL 1");
 
    }

    public ControlProductos(ModeloProducto modelo, VcrudProducto vista) {
        this.modelo = modelo;
        System.out.println("PRIMEMRPPPPPPPPPPPPPPPPPPPPPPPPPPP");
        this.vista = vista;
        
        vista.setTitle("Productos");
        vista.setVisible(true);
        cargarlista();
        
       
        

    }

    private void habilitarBoton(java.awt.event.MouseEvent evt) {
        int column = vista.getJtb_productos().getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / vista.getJtb_productos().getRowHeight();
        if (row < vista.getJtb_productos().getRowCount() && row >= 0 && column < vista.getJtb_productos().getColumnCount() && column >= 0) {
            vista.getBtnGuardaArt().setEnabled(true);
        } else {
            String name = "" + vista.getJtb_productos().getValueAt(row, 1);
        }

    }

    public void inicarControl() {
        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //VALIDACIONES
                if (e.getSource() == vista.getTxtCodArticulo() || e.getSource() == vista.getTxtExistencia() || e.getSource() == vista.getJtxtPrecioCompraBase()) {
                    char caracter = e.getKeyChar();
                    // Verificar si la tecla pulsada no es un digito
                    if (((caracter < '0')
                            || (caracter > '9'))
                            && (caracter != '\b')) {
                        e.consume();

                    }
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                cargarDatosbusqueda(vista.getTxtBuscarEmp().getText());
                System.out.println("ghjk");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                vista.getBtnGuardaArt().setEnabled(true);
            }

        };
        vista.getTxtCodArticulo().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enter(evt);
            }
        });
        vista.getBtnAgregarArt().addActionListener(l -> dialogo(1));
        vista.getBtnEditarArt().addActionListener(l -> dialogo(2));
 
        vista.getBtnGuardaArt().addActionListener(l -> Guardar(opcion));
        vista.getBtnEliminarArt().addActionListener(l -> eliminar());
        //vistat.getBtnBuscar().addActionListener(l -> busquedaSocio(vistat.getTxtCedula_soc().getText()));
        vista.getTxtBuscarEmp().addKeyListener(kl);
        //INVOCAMOS LOES EVENTOS KEYLISTENER PARA VALIDAR
        vista.getTxtCodArticulo().addKeyListener(kl);
        vista.getTxtNombre().addKeyListener(kl);
        vista.getTxtDescripcion().addKeyListener(kl);
        vista.getTxtExistencia().addKeyListener(kl);
        vista.getJtxtPrecioCompraBase().addKeyListener(kl);
        //vista.getBtnGuardaArt().addActionListener(l -> Registrar());

    }
    public  void Guardar(int op) {
        
        if (op==0) {
            crearProducto();
        }else{
            editarProducto();
        }
    }
    public void dialogo(int origen) {

        vista.getjDialog().setSize(800, 500);
        vista.getjDialog().setLocationRelativeTo(vista);
        fila = vista.getJtb_productos().getSelectedRow();
        if (origen == 1) {
            n = 1;
            opcion=0;
            limpiar();
            vista.getjDialog().setTitle("Crear Producto");
            vista.getTxtCodArticulo().setEditable(true);
            vista.getTxtNombre().setEditable(true);
            vista.getTxtDescripcion().setEditable(true);
            vista.getJtxtPrecioCompraBase().setEditable(true);
            vista.getTxtExistencia().setEditable(true);

        } else {
            n = 2;
            mostrarDatos();
             opcion=1;
            vista.getjDialog().setTitle("Editar Producto");
            vista.getTxtNombre().setEditable(true);
            vista.getTxtCodArticulo().setEditable(false);
            vista.getTxtDescripcion().setEditable(true);
            vista.getJtxtPrecioCompraBase().setEditable(true);
            vista.getTxtExistencia().setEditable(true);
        }
        vista.getjDialog().setVisible(true);
    }

    public void enter(java.awt.event.KeyEvent evt) {
        char car = (char) evt.getKeyCode();
        if (car == evt.VK_ENTER) {
            modelop.productos(vista.getTxtBuscarEmp().getText());
        }

    }

    public void cargarlista() {
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vista.getJtb_productos().getModel();
        tblModel.setNumRows(0);
        List<Producto> lista = modelop.listaProducto();
        System.out.println("AQUIUUUUUUUUUUUUUUUUUUUUUUUU    " +  lista.size());
        lista.stream().forEach(r -> {
            String[] tra1 = {String.valueOf(r.getCodigo_producto()), r.getNombre_producto(),r.getDescripcion(), String.valueOf(r.getPrecio()),String.valueOf(r.getExistencia()),
                };
            tblModel.addRow(tra1);
        });
    }
    //AQUIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII
//edissoncore LIBRERIA PARA DISEÑO DE INTERFACES
    public void Registrar() {
        System.out.println("hola registro");
        String codigo_producto = vista.getTxtCodArticulo().getText();
        double precio = Double.valueOf(vista.getJtxtPrecioCompraBase().getText());
        String nombre = vista.getTxtNombre().getText();
        String existencia = vista.getTxtExistencia().getText();
        String descripcion = vista.getTxtDescripcion().getText();

        modelop.setNombre_producto(nombre);
        modelop.setPrecio(precio);
        modelop.setCodigo_producto(Integer.parseInt(codigo_producto));
        modelop.setDescripcion(descripcion);
        modelop.setExistencia(Integer.parseInt(existencia));
        JOptionPane.showMessageDialog(null, "Producto agregado con exito", "", 1);

        limpiar();

    }

    public void limpiar() {
        vista.getTxtCodArticulo().setText("");
        vista.getTxtExistencia().setText("");
        vista.getTxtDescripcion().setText("");
        vista.getJtxtPrecioCompraBase().setText("");
        vista.getTxtNombre().setText("");
    }

    private void crearProducto() {
        System.out.println("craer producto");
        fila = 0;
        int ced;
        if (vista.getTxtCodArticulo().getText() == null || "".equals(vista.getTxtNombre().getText()) || "".equals(vista.getTxtDescripcion().getText())
                || "".equals(vista.getTxtExistencia().getText()) || "".equals(vista.getJtxtPrecioCompraBase().getText())) {
            JOptionPane.showMessageDialog(null, " Existen campos vacíos, llenar todos por favor ", "DATOS INCOMPLETOS", 0);
        } else {

            String codigo = vista.getTxtCodArticulo().getText();
            String nombre = vista.getTxtNombre().getText();
            String descripcion = vista.getTxtDescripcion().getText();
            String existencia = vista.getTxtExistencia().getText();
            String precio = vista.getJtxtPrecioCompraBase().getText();

            ModeloProducto produ = new ModeloProducto();

            produ.setCodigo_producto(Integer.parseInt(codigo));
            // produ.setNumero_cuenta(Integer.parseInt(num_cuenta));
            produ.setNombre_producto(nombre);
            produ.setDescripcion(descripcion);
            produ.setExistencia(Integer.parseInt(existencia));
            produ.setPrecio(Double.parseDouble(precio));

            if (produ.AgregarProducto()) {
                JOptionPane.showMessageDialog(vista, "DATOS REGISTRADOS CORRECTAMENTE");
                cargarDatos();

            } else {
                JOptionPane.showMessageDialog(vista, "ERROR");
            }
            limpiar();
            
            vista.getjDialog().setVisible(false);

        }
    }

    private void editarProducto() {

        int op = JOptionPane.showOptionDialog(null,
                "¿Está seguro de modificar al producto a continuación?", "ADVERTENCIA", JOptionPane.YES_NO_CANCEL_OPTION, 3, null, new Object[]{"SI", "NO"}, null);
        if (op == 0) {

            if (vista.getTxtCodArticulo().getText() == null || "".equals(vista.getTxtNombre().getText()) || "".equals(vista.getTxtDescripcion().getText())
                    || "".equals(vista.getTxtExistencia().getText()) || "".equals(vista.getJtxtPrecioCompraBase().getText())) {
            } else {

                String codigo = vista.getTxtCodArticulo().getText();
                String nombre = vista.getTxtNombre().getText();
                String descripcion = vista.getTxtDescripcion().getText();
                String existencia = vista.getTxtExistencia().getText();
                String precio = vista.getJtxtPrecioCompraBase().getText();

                ModeloProducto produ = new ModeloProducto();
                produ.setCodigo_producto(Integer.parseInt(codigo));
                // produ.setNumero_cuenta(Integer.parseInt(num_cuenta));
                produ.setNombre_producto(nombre);
                produ.setDescripcion(descripcion);
                produ.setExistencia(Integer.parseInt(existencia));
                produ.setPrecio(Double.parseDouble(precio));

                if (produ.EditarProducto(Integer.parseInt(vista.getTxtCodArticulo().getText().toString()))) {
                    JOptionPane.showMessageDialog(vista, "SE HA MODIFICADO CORRECTAMENTE");

                } else {
                    JOptionPane.showMessageDialog(vista, "ERROR");
                }
                 limpiar();
                vista.getjDialog().setVisible(false);

            }
            cargarDatos();
            //desactivarBotones();
        }

    }

    private void desactivarBotones() {
        vista.getBtnEditarArt().setEnabled(false);
        vista.getBtnEliminarArt().setEnabled(false);
    }

    private void cargarDatos() {
        DefaultTableModel dtm;
        dtm = (DefaultTableModel) vista.getJtb_productos().getModel();
        dtm.setNumRows(0);

        //de milista
        List<Producto> lista = modelo.listaProducto();
        lista.stream().forEach(s -> {

            String[] productos = {Integer.toString(s.getCodigo_producto()), s.getNombre_producto(),
                s.getDescripcion(), Integer.toString(s.getExistencia()), Double.toString(s.getPrecio())};

            dtm.addRow(productos);
        });
    }

    private void cargarDatosbusqueda(String aguja) {
        DefaultTableModel dtm;
        dtm = (DefaultTableModel) vista.getJtb_productos().getModel();
        dtm.setNumRows(0);
        List<Producto> lista = modelo.productos(aguja);
        lista.stream().forEach(s -> {
            String[] productos = {Integer.toString(s.getCodigo_producto()), s.getNombre_producto(),
                s.getDescripcion(), Integer.toString(s.getExistencia()), Double.toString(s.getPrecio())};

            dtm.addRow(productos);

        });
    }

    public void mostrarDatos() {

        List<Producto> mostrarpro = modelo.listaProducto();

        int fila = vista.getJtb_productos().getSelectedRow();

        //pro.getTxtCodArticulo().setText(pro.get(fila).getCodigo_producto());
        vista.getTxtNombre().setText(String.valueOf(mostrarpro.get(fila).getNombre_producto()));
        vista.getTxtCodArticulo().setText(String.valueOf(mostrarpro.get(fila).getCodigo_producto()));
        vista.getTxtDescripcion().setText(String.valueOf(mostrarpro.get(fila).getDescripcion()));
        vista.getTxtExistencia().setText(String.valueOf(mostrarpro.get(fila).getExistencia()));
        vista.getJtxtPrecioCompraBase().setText(String.valueOf(mostrarpro.get(fila).getPrecio()));

    }

    public void eliminar() {
        System.out.println("elimino en el controlador");
        ModeloProducto ms = new ModeloProducto();
        int op = JOptionPane.showOptionDialog(null,
                "¿Está seguro que desea elimianr al producto seleccionado?", "ADVERTENCIA", JOptionPane.YES_NO_CANCEL_OPTION, 3, null, new Object[]{"SI", "NO"}, null);
        if (op == 0) {

            int fila = vista.getJtb_productos().getSelectedRow();
            String codigo = String.valueOf(vista.getJtb_productos().getValueAt(fila, 0));
            if (ms.EliminarProducto(codigo)) {

                JOptionPane.showMessageDialog(null, "Acción realizada correctamente");
                cargarDatos();

            }
        }

    }
}
