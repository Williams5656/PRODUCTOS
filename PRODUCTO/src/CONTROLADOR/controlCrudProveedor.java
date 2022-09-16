/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Cliente;
import MODELO.Proveedores;
import VISTA.CRUD.VCrearProveedor;
import VISTA.CRUD.VcrudCliente;
import VISTA.CRUD.VcrudProducto;
import VISTA.CRUD.VcrudProveedor2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CLIENTE
 */
public class controlCrudProveedor {
    
    Proveedores pro=new Proveedores();
    VCrearProveedor vcpr= new VCrearProveedor();
    VcrudProveedor2 vcp2=new VcrudProveedor2();
    
    public void iniciarControl(VcrudProveedor2 vcp2){
      this.FiltrarProveedor(vcp2);
      this.CargarProveedor(vcp2, "");
        vcp2.getBtnEditarCli().addActionListener(l-> EditarProveedor (vcp2));
        vcp2.getBtnEliminarCli().addActionListener(l-> EliminarProveedor(vcp2));
    }
    
    public void iniciarControlC(VCrearProveedor vcp){
        vcp.getjButtonGuardar().addActionListener(l->GuardarCliente(vcp));
        
    }
    
    private void CargarProveedor(VcrudProveedor2 vc, String cedula){
        List<Proveedores> ListaC = pro.mostrarProveedor(cedula);
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
    
    public void GuardarCliente(VCrearProveedor vc){        
        //Agregar
        List<Proveedores> Bc = new ArrayList<>();
        try {
                Bc = pro.mostrarProveedor(vc.getjTextID().getText());
                Bc.get(0).getId().equalsIgnoreCase("");
                JOptionPane.showMessageDialog(null, "El proveedor ya se encuentra registrado en la base de datos");
        } catch (Exception e) {
                pro.InsertarProveedor(vc.getjComboTipoI().getSelectedItem().toString(), vc.getjTextID().getText(), vc.getjTextRazonS().getText(), vc.getjTextSucursal().getText(), vc.getjTextSucursal().getText(), vc.getjTextDir().getText(), vc.getjTextCel().getText(), vc.getjTextTelf().getText(), vc.getjTextEmail().getText(),vc.getjComboPro().getSelectedItem().toString(), vc.getjComboCiu().getSelectedItem().toString());
                JOptionPane.showMessageDialog(vc, "Guardado Exitoso");
        }
      
    }  
     public void ActualizarProveedor(VCrearProveedor vc){
//        editar
            try{
                pro.ActualizarProveedior(vc.getjTextID().getText(), vc.getjTextRazonS().getText(), vc.getjTextSucursal().getText(), vc.getjTextSucursal().getText(), vc.getjTextDir().getText(), vc.getjTextCel().getText(), vc.getjTextTelf().getText(), vc.getjTextEmail().getText(),vc.getjComboPro().getSelectedItem().toString(), vc.getjComboCiu().getSelectedItem().toString());
                JOptionPane.showMessageDialog(vc, "Cambios guardados con exito");
                CargarProveedor(vcp2, "");
              
            }catch(Exception e){}   
    }
     
  
          public void EditarProveedor(VcrudProveedor2 vcp){
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
             List<Proveedores> ListaP = pro.mostrarProveedor(cedula);
             vcp.getTxtCedulaCli().setText(cedula);             
             vcp.getTxtNombre().setText(ListaP.get(0).getRazonSocial());
             vcp.getTxtDireccion().setText(ListaP.get(0).getCiudad());
             vcp.getTxtCorreo().setText(ListaP.get(0).getCorreo());
            
        }
    }
          
         
           public void EliminarProveedor(VcrudProveedor2 vistac){
        int filaseleccionada = vistac.getJtb_cliente().getSelectedRow();
        if(filaseleccionada<0){
            JOptionPane.showMessageDialog(null, "Seleccione el cliente que desea eliminar");
        }else{
        int fila = vistac.getJtb_cliente().getSelectedRow();
        String cedula = vistac.getJtb_cliente().getValueAt(fila, 0).toString();
        String nombre = vistac.getJtb_cliente().getValueAt(fila, 1).toString();
                int elim = JOptionPane.showConfirmDialog(vcp2, "¿Seguro que desea eliminar a "+nombre+"?","Eliminar",JOptionPane.YES_NO_OPTION);
                if(elim==0){
                    pro.EliminarpProveedor(cedula);
                    CargarProveedor(vistac, "");
                    JOptionPane.showMessageDialog(vcp2, "proveedor eliminado exitosamente");
                }
        }        
    }
       public void FiltrarProveedor(VcrudProveedor2 vc){
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
                 CargarProveedor(vc, cadena);
            }
        };
        vc.getTxtBuscarCli().addKeyListener(eventoTeclado);
    }
}






































