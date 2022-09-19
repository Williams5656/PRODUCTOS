/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Proveedor;
import MODELO.Validaciones;
import VISTA.CRUD.VCrearProveedor;
import VISTA.CRUD.VcrudProveedor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author james
 */
public class controlCrudProveedor {
    
    Proveedor pro=new Proveedor();
    VCrearProveedor vap= new VCrearProveedor();
    VcrudProveedor vcp=new VcrudProveedor();
    Validaciones vali = new Validaciones();
    
    public void iniciarControl(VcrudProveedor vcp){
        vali.validarJDialog(vcp.getJdProveedores());
        FiltrarProveedor(vcp);
        CargarProveedor(vcp, "", "identificacion");
        vcp.getBtnEditarProv().addActionListener(l-> EditarProveedor (vcp));
        vcp.getBtnEliminarProv().addActionListener(l-> EliminarProveedor(vcp));
        vcp.getBtnGuardarProv().addActionListener(l->ActuProv(vcp));
    }
    
    public void iniciarControlCrear(VCrearProveedor vap){
        vap.getBtnGuardarProv().addActionListener(l->GuardarProveedor(vap));
        
    }
    
    private void CargarProveedor(VcrudProveedor vp, String busca, String campo){
        List<Proveedor> ListaP = pro.mostrarProveedor(busca, campo);
        DefaultTableModel mtdTable;
        mtdTable = (DefaultTableModel)vp.getJtb_proveedor().getModel();
        mtdTable.setRowCount(0);
        ListaP.forEach(p->{
        String Fila[]={p.getId(),p.getRazonSocial(),p.getTipo_id(),p.getCiudad(),p.getTelefono(),p.getCorreo()};
        mtdTable.addRow(Fila);
        });
        vp.getJtb_proveedor().setModel(mtdTable);
    }  
    
    //Agregar un nuevo Proveedor
    public void GuardarProveedor(VCrearProveedor vc){        
        //Agregar
        List<Proveedor> Bp = new ArrayList<>();//Para buscar si el proveedor ya se encuentra en la base de datos
        try {
                Bp = pro.mostrarProveedor(vc.getTxtId().getText(),"identificacion");
                Bp.get(0).getId().equalsIgnoreCase("");
                JOptionPane.showMessageDialog(null, "El Proveedor ya se encuentra registrado en la base de datos");
        } catch (Exception e) {
                pro.InsertarProveedor(vc.getCbTipoId().getSelectedItem().toString(), vc.getTxtId().getText(), vc.getTxtNombre().getText(), vc.getTxtAliasSuc().getText(), vc.getTxtCodSucursal().getText(), vc.getTxtDireccion().getText(), vc.getTxttelefono().getText(), vc.getTxtCelular().getText(), vc.getTxtCorreo().getText(),vc.getCbProvincia().getSelectedItem().toString(), vc.getCbCiudad().getSelectedItem().toString());
                JOptionPane.showMessageDialog(vc, "Guardado Exitoso");
        }
    }  
    
    public void ActuProv(VcrudProveedor vc){
            //Guardar Cambios editados
            try{
                pro.ActualizarProveedor(vc.getCbTipoId().getSelectedItem().toString(), vc.getTxtId().getText(), vc.getTxtNombre().getText(), vc.getTxtSucursal().getText(), vc.getTxtCodSucursal().getText(), vc.getTxtDireccion().getText(), vc.getTxttelefono().getText(), vc.getTxtCelular().getText(), vc.getTxtCorreo().getText(),vc.getCbProvincia().getSelectedItem().toString(), vc.getCbCiudad().getSelectedItem().toString());
                JOptionPane.showMessageDialog(vc, "Cambios guardados con exito");
                CargarProveedor(vcp, "", "identificacion");
                vc.getJdProveedores().dispose();
            }catch(Exception e){}   
    }    
    

    //Editar Cliente
    public void EditarProveedor(VcrudProveedor vp){
        int filaseleccionada = vp.getJtb_proveedor().getSelectedRow();
        if(filaseleccionada<0){
            JOptionPane.showMessageDialog(null, "Seleccione el proveedor que desea editar");
        }else{
                    //configuracion para mostrar jdialog
                    vp.getJdProveedores().setVisible(true);
                    vp.getJdProveedores().setSize(1100,700);
                    vp.getJdProveedores().setResizable(false);
                    vp.getJdProveedores().setTitle("Editar");
                    vp.getTxtId().setEditable(false);
                    vp.getCbTipoId().setEnabled(false);
            //carga
            int fila = vp.getJtb_proveedor().getSelectedRow();
            String cedula = vp.getJtb_proveedor().getValueAt(fila, 0).toString();
             List<Proveedor> ListaP = pro.mostrarProveedor(cedula, "identificacion");
             vp.getTxtId().setText(ListaP.get(0).getId());      
             vp.getTxtNombre().setText(ListaP.get(0).getRazonSocial());
             vp.getTxtSucursal().setText(ListaP.get(0).getSucursal());
             vp.getTxtDireccion().setText(ListaP.get(0).getDomicilio());
             vp.getTxtCodSucursal().setText(ListaP.get(0).getCodigo());
             vp.getTxttelefono().setText(ListaP.get(0).getTelefono());
             vp.getTxtCelular().setText(ListaP.get(0).getCelular());
             vp.getTxtCorreo().setText(ListaP.get(0).getCorreo());
        }
    }      
          
         
    //Eliminar Clientes
    public void EliminarProveedor(VcrudProveedor vp){
        int filaseleccionada = vp.getJtb_proveedor().getSelectedRow();
        if(filaseleccionada<0){
            JOptionPane.showMessageDialog(null, "Seleccione el proveedor que desea eliminar");
        }else{
        int fila = vp.getJtb_proveedor().getSelectedRow();
        String cedula = vp.getJtb_proveedor().getValueAt(fila, 0).toString();
        String nombre = vp.getJtb_proveedor().getValueAt(fila, 1).toString();
                int elim = JOptionPane.showConfirmDialog(vp, "¿Seguro que desea eliminar a "+nombre+"?","Eliminar",JOptionPane.YES_NO_OPTION);
                if(elim==0){
                    pro.EliminarProveedor(cedula);
                    CargarProveedor(vcp, "", "identificacion");
                    JOptionPane.showMessageDialog(vp, "Proveedor eliminado exitosamente");
                }
                CargarProveedor(vcp, "", "identificacion");
        }        
    }    
           
       public void FiltrarProveedor(VcrudProveedor vc){
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
                 CargarProveedor(vc, cadena, SeleccionaCampo(vc));
            }
        };
        vc.getTxtBuscarCli().addKeyListener(eventoTeclado);
    }
       
    public String SeleccionaCampo(VcrudProveedor vp){
        String camp= "";
        if (vp.getjComboBuscar().getSelectedIndex() == 0) {
            camp = "identificacion";
        }else{
            if (vp.getjComboBuscar().getSelectedIndex() == 1) {
                camp = "nombres";
            }else{
                camp= "tipo_id";
            }
        }
        return camp;
    }       
}






































