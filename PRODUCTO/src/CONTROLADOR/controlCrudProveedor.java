/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Cliente;
import MODELO.Proveedores;
import VISTA.CRUD.VcrudCliente;
import VISTA.CRUD.VcrudProveedor;
import VISTA.CRUD.VcrudProveedor2;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CLIENTE
 */
public class controlCrudProveedor {
    Proveedores pro=new Proveedores();
    VcrudProveedor vcp=new VcrudProveedor();
    VcrudProveedor2 vcp2=new VcrudProveedor2();
    
   public void iniciarControl(VcrudProveedor vcp, VcrudProveedor2 vcp2 ){
//        FiltrarCliente(vcc);
//        CargarCliente(vcc, "", "cedula");


   } 
     private void CargarProveedor(VcrudProveedor2 vcp2, String cedula, String campo){
        List<Proveedores> ListaP = pro.mostrarProveedor(cedula, campo);
        vcp2.getJtb_cliente().setRowHeight(135);
        DefaultTableModel mtdTable;
        mtdTable = (DefaultTableModel)vcp2.getJtb_cliente().getModel();
        mtdTable.setRowCount(0);
        ListaP.forEach(p->{
        String Fila[]={p.getCedula(),p.getApellido(),p.getNombre(), p.getCelular(), p.getProvincia()};
        mtdTable.addRow(Fila);
        });
        vcp2.getJtb_cliente().setModel(mtdTable);
    }    
    
      public void GuardarCliente(  VcrudProveedor vcp){        
//        //Agregar
//        if(vcp.getJdCliente.getTitle().equalsIgnoreCase("Agregar")){
//            List<Proveedores> Bc = new ArrayList<>();
//            try {
//                Bc = pro.mostrarProveedor(vc.getTxtCedulaCli().getText(),"cedula");
//                Bc.get(0).getCedula().equalsIgnoreCase("");
//                try {
//                    Bc = pro.mostrarProveedor(vc.getTxtCedulaCli().getText(),"cedula");
//                    Bc.get(0).getCedula().equalsIgnoreCase("");
//                    JOptionPane.showMessageDialog(null, "El Cliente ya se encuentra registrado en la base de datos");
//                } catch (Exception e) {
//                    pro.InsertarProveedor(vc.getTxtDireccionDom().getText(), vc.getTxtCedulaCli().getText());
//                    JOptionPane.showMessageDialog(vcc, "Guardado Exitoso");
//                    CargarCliente(vc, "","cedula");
//                    vc.getJdCliente().dispose(); 
//                }
//            } catch (Exception e) {
//                    cli.InsertarPersona(vc.getTxtCedulaCli().getText(), vc.getTxtNombre().getText(),vc.getTxtApellido().getText(), vc.getTxtDireccion().getText(), vc.getTxtTelefono().getText(), vc.getTxtCelular().getText(), vc.getTxtCiudad().getText(), vc.getTxtDireccionDom().getText(),vc.getTxtCorreo().getText());
//                    JOptionPane.showMessageDialog(vcc, "Guardado Exitoso");
//                    CargarCliente(vc, "","cedula");
//                    vc.getJdCliente().dispose();             
//            }
//        }        
//        //editar
//        if(vc.getJdCliente().getTitle().equalsIgnoreCase("Editar")){
//            try{
//                cli.ActualizarPersona(vc.getTxtCedulaCli().getText(), vc.getTxtNombre().getText(),vc.getTxtApellido().getText(), vc.getTxtCorreo().getText(), vc.getTxtDireccion().getText(),vc.getTxtTelefono().getText(), vc.getTxtCelular().getText(), vc.getTxtCiudad().getText(), vc.getTxtDireccionDom().getText());
//                JOptionPane.showMessageDialog(vcc, "Cambios guardados con exito");
//                CargarCliente(vc, "", "cedula");
//                vc.getJdCliente().dispose();
//            }catch(Exception e){}
//        }         
    }
}
