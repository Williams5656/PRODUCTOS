/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.Producto;
import MODELO.Validaciones;
import VISTA.CRUD.VCrearProducto;
import VISTA.CRUD.VcrudProducto;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prisc
 */
public class ControlCRUDProducto {

    private Image foto;
    private ImageIcon ic;    
    Producto prod=new Producto();
    VcrudProducto vcp=new VcrudProducto();
    VCrearProducto vcpd=new VCrearProducto();
    Validaciones vali=new Validaciones();

    public void inicarControl(VcrudProducto vcp) {
        vali.validarJDialog(vcp.getJdProducto());
        FiltrarProducto(vcp);
        mouseListenerTabla(vcp);
        CargarProductos(vcp, "", "nombre");
        vcp.getBtnGuardarProd().addActionListener(l->ActualizarProducto(vcp));
        vcp.getBtnImportarFoto().addActionListener(l->CargarFoto(vcp));
        vcp.getBtnEditarArt().addActionListener(l->EditarProducto(vcp));
        vcp.getBtnEliminarArt().addActionListener(l->EliminarProducto(vcp));
    }

    public void iniciarControlCrear(VCrearProducto vcpd){
        vcpd.getBtnGuardarProd().addActionListener(l->GuardarNuevoProducto(vcpd));
        vcpd.getBtnImportarFoto().addActionListener(l->CargarFotoN(vcpd));
    }
    
    //Cargar Datos a la tabla    
    private void CargarProductos(VcrudProducto vcp, String nombre, String campo){
        List<Producto> ListaC = prod.mostrarProductos(nombre, campo);
        DefaultTableModel mtdTable;
        mtdTable = (DefaultTableModel)vcp.getJtb_productos().getModel();
        mtdTable.setRowCount(0);
        ListaC.forEach(p->{
        String Fila[]={p.getIdP(),p.getCodigoP(),p.getNombreP(),Double.toString(p.getPrecio1()),Double.toString(p.getPrecio2()),Double.toString(p.getPrecio3()),p.getTipoIVAP(),p.getIceP(),p.getMStockP(),Integer.toString(p.getStock())};
        mtdTable.addRow(Fila);
        });
            vcp.getLbFotoM().setIcon(null);
            vcp.getLbNombreArtF().setText("");        
        vcp.getJtb_productos().setModel(mtdTable);
    }        
    
    //Agregar Producto
    private void AgregarProducto(VcrudProducto vcp) {
        vcp.getJdProducto().setVisible(true);
        vcp.getJdProducto().setSize(730, 450);
        vcp.getJdProducto().setResizable(false);
        vcp.getJdProducto().setTitle("Agregar");
    }
        //Agregar
    public void ActualizarProducto(VcrudProducto vcp){              
        //editar
        if(vcp.getJdProducto().getTitle().equalsIgnoreCase("Editar")){
            try{
                prod.ActualizarProducto(vcp.getTxtCodProd().getText(),vcp.getTxtNombreProd().getText(),vcp.getTxtDescProd().getText(),"1",vcp.getTxtPrecio1Prod().getText(),vcp.getTxtPrecio2Prod().getText(),vcp.getTxtPrecio3Prod().getText(),vcp.getCbTipoProd().getSelectedItem().toString(),vcp.getCbTipoIvaProd().getSelectedItem().toString(),vcp.getCbIceProd().getSelectedItem().toString(),vcp.getCbMStockProd().getSelectedItem().toString(),vcp.getCbCateProd().getSelectedItem().toString(),ObtenFecha(vcp),vcp.getTxtSubsiProd().getText(),vcp.getCbUnidadProd().getSelectedItem().toString(),vcp.getTxtCodAuxProd().getText(),OFoto(vcp));
                JOptionPane.showMessageDialog(vcp, "Cambios guardados con exito");
                CargarProductos(vcp, "","nombre");
                vcp.getJdProducto().dispose();
            }catch(Exception e){
                System.out.println(e);
            }
        }         
    }       
    
    public void GuardarNuevoProducto(VCrearProducto vcpd){
            List<Producto> Bp = new ArrayList<>();
                try {
                    Bp = prod.mostrarProductos(vcpd.getTxtCodProd().getText(),"codigo_prod");
                    Bp.get(0).getCodigoP().equalsIgnoreCase("");
                    JOptionPane.showMessageDialog(null, "Ya existe otro producto con el mismo codigo");
                } catch (Exception e) {
                    prod.InsertarProducto(vcpd.getTxtCodProd().getText(),vcpd.getTxtNombreProd().getText(),vcpd.getTxtDescProd().getText(),"1",vcpd.getTxtPrecio1Prod().getText(),vcpd.getTxtPrecio2Prod().getText(),vcpd.getTxtPrecio3Prod().getText(),vcpd.getCbTipoProd().getSelectedItem().toString(),vcpd.getCbTipoIvaProd().getSelectedItem().toString(),vcpd.getCbIceProd().getSelectedItem().toString(),vcpd.getCbMStockProd().getSelectedItem().toString(),vcpd.getCbCateProd().getSelectedItem().toString(),ObtenFechaN(vcpd),vcpd.getTxtSubsiProd().getText(),vcpd.getCbUnidadProd().getSelectedItem().toString(),vcpd.getTxtCodAuxProd().getText(),OFotoN(vcpd));
                    JOptionPane.showMessageDialog(vcp, "Guardado Exitoso");
                }        
    }
    
    //Para mostrar la foto segun la fila seleccionada
    public void mouseListenerTabla(VcrudProducto vcp) {
        vcp.getJtb_productos().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                FilaSelec(vcp);
            }

            @Override
            public void mouseEntered(MouseEvent e) {                
            }
        }
        );
    }   
    //Fila
    public void FilaSelec(VcrudProducto vcp){
        int fila = vcp.getJtb_productos().getSelectedRow();
        String codp = vcp.getJtb_productos().getValueAt(fila, 1).toString();
        List<Producto> ListaC = prod.mostrarProductos(codp, "codigo_prod");
        if (ListaC.get(0).getFoto() != null) {
            ImageIcon image = new ImageIcon();
            image = new ImageIcon(ListaC.get(0).getFoto());
            vcp.getLbFotoM().setIcon(image);
            vcp.getLbNombreArtF().setText(ListaC.get(0).getDescripcionP());
        }else{
            vcp.getLbFotoM().setIcon(null);
            vcp.getLbNombreArtF().setText("");
        }
    }   
    //
    
 //Editar Producto (carga los datos)
    public void EditarProducto(VcrudProducto vcp){
        int filaseleccionada = vcp.getJtb_productos().getSelectedRow();
        if(filaseleccionada<0){
            JOptionPane.showMessageDialog(null, "Seleccione el cliente que desea editar");
        }else{
                    //configuracion para mostrar jdialog
                    vcp.getJdProducto().setVisible(true);
                    vcp.getJdProducto().setSize(730, 450);
                    vcp.getJdProducto().setResizable(false);
                    vcp.getJdProducto().setTitle("Editar");
                    vcp.getTxtCodProd().setEditable(false);
            //carga
            int fila = vcp.getJtb_productos().getSelectedRow();
            String codi = vcp.getJtb_productos().getValueAt(fila, 1).toString();
             List<Producto> ListaP = prod.mostrarProductos(codi,"codigo_prod");
             vcp.getTxtCodProd().setText(codi);             
             vcp.getTxtNombreProd().setText(ListaP.get(0).getNombreP());
             vcp.getTxtDescProd().setText(ListaP.get(0).getDescripcionP());
             vcp.getTxtPrecio1Prod().setText(Double.toString(ListaP.get(0).getPrecio1()));
             vcp.getTxtPrecio2Prod().setText(Double.toString(ListaP.get(0).getPrecio2()));
             vcp.getTxtPrecio3Prod().setText(Double.toString(ListaP.get(0).getPrecio3()));
             vcp.getTxtSubsiProd().setText(Double.toString(ListaP.get(0).getSubsiP()));
             vcp.getTxtCodAuxProd().setText(ListaP.get(0).getCodAuxP());
        }
    }      

//Eliminar
    private void EliminarProducto(VcrudProducto vcp){
        int filaseleccionada = vcp.getJtb_productos().getSelectedRow();
        if(filaseleccionada<0){
            JOptionPane.showMessageDialog(null, "Seleccione el producto que desea eliminar");
        }else{
        int fila = vcp.getJtb_productos().getSelectedRow();
        String cod = vcp.getJtb_productos().getValueAt(fila, 1).toString();
        String nomb = vcp.getJtb_productos().getValueAt(fila, 2).toString();
                int elim = JOptionPane.showConfirmDialog(vcp, "¿Seguro que desea eliminar "+nomb+"?","Eliminar",JOptionPane.YES_NO_OPTION);
                if(elim==0){
                    prod.EliminarProducto(cod);
                    CargarProductos(vcp, "", "nombre");
                    JOptionPane.showMessageDialog(vcp, "Producto eliminado exitosamente");
                }
        }           
    }
    
    public void FiltrarProducto(VcrudProducto vcp){
        KeyListener eventoTeclado=new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {                 
            }

            @Override
            public void keyPressed(KeyEvent ke) {
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                 String busca = (vcp.getTxtBuscarArt().getText());
                 CargarProductos(vcp, busca, SeleccionaCampo(vcp));
            }
        };
        vcp.getTxtBuscarArt().addKeyListener(eventoTeclado);
    }       
    
    //Cargar Foto
    private void CargarFoto(VcrudProducto vcp){
        //Para dar estilo Windows
       try {
            // TODO add your handling code here:
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VcrudProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    //Proceso de Foto
        vcp.getLbFotoAGProd().setIcon(null);
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jfc.setFileFilter(new FileNameExtensionFilter("IMAGENES", "jpg", "png", "jpeg"));
        int estado = jfc.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                Image foto = ImageIO.read(jfc.getSelectedFile());
                vcp.getLbFotoAGProd().setIcon(new ImageIcon(foto.getScaledInstance(vcp.getLbFotoAGProd().getWidth(), vcp.getLbFotoAGProd().getHeight(), Image.SCALE_DEFAULT)));
                vcp.getLbFotoAGProd().updateUI();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }     
    
    private void CargarFotoN(VCrearProducto vcp){
        //Para dar estilo Windows
       try {
            // TODO add your handling code here:
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VcrudProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    //Proceso de Foto
        vcp.getLbFotoAGProd().setIcon(null);
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jfc.setFileFilter(new FileNameExtensionFilter("IMAGENES", "jpg", "png", "jpeg"));
        int estado = jfc.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                Image foto = ImageIO.read(jfc.getSelectedFile());
                vcp.getLbFotoAGProd().setIcon(new ImageIcon(foto.getScaledInstance(vcp.getLbFotoAGProd().getWidth(), vcp.getLbFotoAGProd().getHeight(), Image.SCALE_DEFAULT)));
                vcp.getLbFotoAGProd().updateUI();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }       
    
    public Image OFoto(VcrudProducto vcp){
        ImageIcon ico = (ImageIcon)vcp.getLbFotoAGProd().getIcon();
        return ico.getImage();
    }   
    
    public Image OFotoN(VCrearProducto vcp){
        ImageIcon ico = (ImageIcon)vcp.getLbFotoAGProd().getIcon();
        return ico.getImage();
    }      
    
    //Foto
    
    //Obtener Fecha Seleccionada
    private String ObtenFecha(VcrudProducto vcp){
        int d, m, a;
        d = vcp.getJcFVenciProd().getCalendar().get(Calendar.DAY_OF_MONTH);
        m = 1+(vcp.getJcFVenciProd().getCalendar().get(Calendar.MONTH));
        a = vcp.getJcFVenciProd().getCalendar().get(Calendar.YEAR);
        String fe = (a+"-"+m+"-"+d);
        return fe;
    }
    
    private String ObtenFechaN(VCrearProducto vcp){
        int d, m, a;
        d = vcp.getJcFVenciProd().getCalendar().get(Calendar.DAY_OF_MONTH);
        m = 1+(vcp.getJcFVenciProd().getCalendar().get(Calendar.MONTH));
        a = vcp.getJcFVenciProd().getCalendar().get(Calendar.YEAR);
        String fe = (a+"-"+m+"-"+d);
        return fe;
    }    

    public String SeleccionaCampo(VcrudProducto vp){
        String camp= "";
        if (vp.getCbBuscarProd().getSelectedIndex() == 0) {
            camp = "nombre";
        }else{
            if (vp.getCbBuscarProd().getSelectedIndex() == 1) {
                camp = "codigo_prod";
            }
        }
        return camp;
    }        
    
    //Limpia los campos o los deja por defecto
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
}
