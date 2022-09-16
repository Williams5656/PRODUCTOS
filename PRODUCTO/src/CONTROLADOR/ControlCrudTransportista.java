/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import Base.cedula;
import MODELO.Proveedores;
import MODELO.Transportista;
import VISTA.CRUD.VCrearProveedor;
import VISTA.CRUD.VCrearTransportista;
import VISTA.CRUD.VcrudProveedor2;
import VISTA.CRUD.VcrudTransportista2;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrea
 */
public class ControlCrudTransportista {

   VCrearTransportista vct=new VCrearTransportista();
   VcrudTransportista2 vct2=new  VcrudTransportista2();
    Transportista tra=new Transportista();
    
     public void iniciarControl(VcrudTransportista2 vc2){
      this.FiltrarProveedor(vct2);
      this.CargarTransportista(vc2, "");
      
        vct2.getBtnEditarCli().addActionListener(l-> EditarTransportista (vct2));
        vct2.getBtnEliminarCli().addActionListener(l-> EliminarTransportista(vct2));
    }
    
    public void iniciarControlC(VCrearTransportista vct){
        vct.getButtonGuardar().addActionListener(l->GuardarTransportista(vct));
        
    }
    
    private void CargarTransportista(VcrudTransportista2 vc, String cedula){
        List<Transportista > ListaC = tra.mostrarTransportista(cedula);
        vc.getJtb_cliente().setRowHeight(135);
        DefaultTableModel mtdTable;
        mtdTable = (DefaultTableModel)vc.getJtb_cliente().getModel();
        mtdTable.setRowCount(0);
        ListaC.forEach(p->{
        String Fila[]={p.getId(),p.getRazonSocial(),p.getCiudad(),p.getCiudad(),p.getCorreo()};
        mtdTable.addRow(Fila);
        });
        vc.getJtb_cliente().setModel(mtdTable);
    }  
    
    public void GuardarTransportista(VCrearTransportista vct){        
        //Agregar
        List<Transportista> Bc = new ArrayList<>();
        try {
                Bc = tra.mostrarTransportista(vct.getTextId().getText());
                Bc.get(0).getId().equalsIgnoreCase("");
                JOptionPane.showMessageDialog(null, "El proveedor ya se encuentra registrado en la base de datos");
        } catch (Exception e) {
                tra.InsertarTransportista(vct.getComboTipoI().getSelectedItem().toString(),
                        vct.getTextId().getText(), 
                        vct.getTextRazonS().getText(), 
                        vct.getjTextTelf().getText(),
                        vct.getTextCel().getText(), 
                        vct.getTextDir().getText(),
                        vct.getComboCiudad().getSelectedItem().toString(),
                        vct.getComboPro().getSelectedItem().toString(),
                        vct.getTextCorreo().getText(),
                        vct.getTextPlaca().getText());
                JOptionPane.showMessageDialog(vct, "Guardado Exitoso");
        }
      
    }  
     public void ActualizarProveedor(VCrearTransportista vct){
//        editar
            try{
                tra.ActualizarTransportista(
                        vct.getTextId().getText(), 
                        vct.getTextRazonS().getText(), 
                        vct.getjTextTelf().getText(),
                        vct.getTextCel().getText(), 
                        vct.getTextDir().getText(),
                        vct.getComboCiudad().getSelectedItem().toString(),
                        vct.getComboPro().getSelectedItem().toString(),
                        vct.getTextCorreo().getText(),
                        vct.getTextPlaca().getText());
                JOptionPane.showMessageDialog(vct, "Cambios guardados con exito");
                CargarTransportista(vct2, "");
              
            }catch(Exception e){}   
    }
     
  
          public void EditarTransportista(VcrudTransportista2 vcp){
        int filaseleccionada = vcp.getJtb_cliente().getSelectedRow();
        if(filaseleccionada<0){
            JOptionPane.showMessageDialog(null, "Seleccione el cliente que desea editar");
        }else{
                    //configuracion para mostrar jdialog
                         vcp.getJdCliente().setVisible(true);
                    vcp.getJdCliente().setSize(1100,700);
                    vcp.getJdCliente().setResizable(false);
                    vcp.getJdCliente().setTitle("Editar");
                    vcp.getTxtCedulaCli().setEditable(false);
                    vcp.getjComboBuscar().setEnabled(false);
                
            //carga
            int fila = vcp.getJtb_cliente().getSelectedRow();
            String cedula = vcp.getJtb_cliente().getValueAt(fila, 1).toString();
             List<Transportista> ListaP = tra.mostrarTransportista(cedula);
             vcp.getTxtCedulaCli().setText(cedula);             
             vcp.getTxtNombre().setText(ListaP.get(0).getRazonSocial());
             vcp.getTxtDireccion().setText(ListaP.get(0).getCiudad());
             vcp.getTxtCorreo().setText(ListaP.get(0).getCorreo());
            
        }
    }
          
         
           public void EliminarTransportista(VcrudTransportista2 vistac){
        int filaseleccionada = vistac.getJtb_cliente().getSelectedRow();
        if(filaseleccionada<0){
            JOptionPane.showMessageDialog(null, "Seleccione el cliente que desea eliminar");
        }else{
        int fila = vistac.getJtb_cliente().getSelectedRow();
        String cedula = vistac.getJtb_cliente().getValueAt(fila, 0).toString();
        String nombre = vistac.getJtb_cliente().getValueAt(fila, 1).toString();
                int elim = JOptionPane.showConfirmDialog(vct2, "¿Seguro que desea eliminar a "+nombre+"?","Eliminar",JOptionPane.YES_NO_OPTION);
                if(elim==0){
                    tra.EliminarpTransportista(cedula);
                    CargarTransportista(vistac, "");
                    JOptionPane.showMessageDialog(vct2, "proveedor eliminado exitosamente");
                }
        }        
    }
       public void FiltrarProveedor(VcrudTransportista2 vc){
        KeyListener eventoTeclado=new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {                 
            }

            @Override
            public void keyPressed(KeyEvent ke) {
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                 String cadena = (vc.getTxtBuscarCli().getText());
//                 CargarProveedor(vc, cadena);
            }
        };
        vc.getTxtBuscarCli().addKeyListener(eventoTeclado);
    }
     
}
