/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Transportista;
import MODELO.Validaciones;
import VISTA.CRUD.VCrearTransportista;
import VISTA.CRUD.VcrudTransportista;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrea
 */
public class ControlCrudTransportista {

    Transportista tra=new Transportista();
    VCrearTransportista vat=new VCrearTransportista();
    VcrudTransportista vct=new VcrudTransportista();
    Validaciones vali = new Validaciones();
    
    public void iniciarControl(VcrudTransportista vct){
        vali.validarJDialog(vct.getJdTransportista());
        FiltrarTransportista(vct);
        CargarTransportista(vct, "", "identificacion");
        vct.getBtnEditarTra().addActionListener(l-> EditarTransportista(vct));
        vct.getBtnEliminarTra().addActionListener(l-> EliminarTransportista(vct));
        vct.getBtnGuardarTra().addActionListener(l->ActuTra(vct));
    }
      
    public void iniciarControlCrear(VCrearTransportista vat){
        vat.getBtnGuardarCli().addActionListener(l->GuardarTransportista(vat));
        
    }
    
    private void CargarTransportista(VcrudTransportista vt, String busca, String campo){
        List<Transportista> ListaT = tra.mostrarTransportista(busca, campo);
        DefaultTableModel mtdTable;
        mtdTable = (DefaultTableModel)vt.getJtb_transportista().getModel();
        mtdTable.setRowCount(0);
        ListaT.forEach(p->{
        String Fila[]={p.getId(),p.getRazonSocial(),p.getTipoId(),p.getPlaca(),p.getCiudad(),p.getTelefono(),p.getCorreo()};
        mtdTable.addRow(Fila);
        });
        vt.getJtb_transportista().setModel(mtdTable);
    }  
    
    //Agregar un nuevo Transportista
    public void GuardarTransportista(VCrearTransportista vt){        
        //Agregar
        List<Transportista> Bt = new ArrayList<>();//Para buscar si el transportista ya se encuentra en la base de datos
        try {
                Bt = tra.mostrarTransportista(vt.getTxtId().getText(),"identificacion");
                Bt.get(0).getId().equalsIgnoreCase("");
                JOptionPane.showMessageDialog(null, "El Transportista ya se encuentra registrado en la base de datos");
        } catch (Exception e) {
                tra.InsertarTransportista(vt.getCbTipoId().getSelectedItem().toString(), vt.getTxtId().getText(), vt.getTxtNombre().getText(),vt.getTxtDireccion().getText(), vt.getTxttelefono().getText(), vt.getTxtCelular().getText(), vt.getTxtCorreo().getText(),vt.getCbProvincia().getSelectedItem().toString(), vt.getCbCiudad().getSelectedItem().toString(), vt.getTxtPlaca().getText());
                JOptionPane.showMessageDialog(vt, "Guardado Exitoso");
        }
    }  
    
    //Actualizar transportista
    public void ActuTra(VcrudTransportista vt){
            //Guardar Cambios editados
            try{
                tra.ActualizarTransportista(vt.getCbTipoId().getSelectedItem().toString(), vt.getTxtId().getText(), vt.getTxtNombre().getText(),vt.getTxtDireccion().getText(), vt.getTxttelefono().getText(), vt.getTxtCelular().getText(), vt.getTxtCorreo().getText(),vt.getCbProvincia().getSelectedItem().toString(), vt.getCbCiudad().getSelectedItem().toString(), vt.getTxtPlaca().getText());
                JOptionPane.showMessageDialog(vt, "Cambios guardados con exito");
                CargarTransportista(vt, "", "identificacion");
                vt.getJdTransportista().dispose();
            }catch(Exception e){}   
    }    

    //Editar Transportista
    public void EditarTransportista(VcrudTransportista vt){
        int filaseleccionada = vt.getJtb_transportista().getSelectedRow();
        if(filaseleccionada<0){
            JOptionPane.showMessageDialog(null, "Seleccione el transportista que desea editar");
        }else{
                    //configuracion para mostrar jdialog
                    vt.getJdTransportista().setVisible(true);
                    vt.getJdTransportista().setSize(1100,700);
                    vt.getJdTransportista().setResizable(false);
                    vt.getJdTransportista().setTitle("Editar");
                    vt.getTxtId().setEditable(false);
                    vt.getCbTipoId().setEnabled(false);
            //carga
            int fila = vt.getJtb_transportista().getSelectedRow();
            String cedula = vt.getJtb_transportista().getValueAt(fila, 0).toString();
             List<Transportista> ListaP = tra.mostrarTransportista(cedula, "identificacion");
             vt.getTxtId().setText(ListaP.get(0).getId());      
             vt.getTxtNombre().setText(ListaP.get(0).getRazonSocial());
             vt.getTxtPlaca().setText(ListaP.get(0).getPlaca());
             vt.getTxtDireccion().setText(ListaP.get(0).getDireccion());
             vt.getTxttelefono().setText(ListaP.get(0).getTelefono());
             vt.getTxtCelular().setText(ListaP.get(0).getCelular());
             vt.getTxtCorreo().setText(ListaP.get(0).getCorreo());
        }
    }      
           
    //Eliminar Clientes
    public void EliminarTransportista(VcrudTransportista vt){
        int filaseleccionada = vt.getJtb_transportista().getSelectedRow();
        if(filaseleccionada<0){
            JOptionPane.showMessageDialog(null, "Seleccione el transportista que desea eliminar");
        }else{
        int fila = vt.getJtb_transportista().getSelectedRow();
        String cedula = vt.getJtb_transportista().getValueAt(fila, 0).toString();
        String nombre = vt.getJtb_transportista().getValueAt(fila, 1).toString();
                int elim = JOptionPane.showConfirmDialog(vt, "¿Seguro que desea eliminar a "+nombre+"?","Eliminar",JOptionPane.YES_NO_OPTION);
                if(elim==0){
                    tra.EliminarpTransportista(cedula);
                    CargarTransportista(vt, "", "identificacion");
                    JOptionPane.showMessageDialog(vt, "Proveedor eliminado exitosamente");
                }
                CargarTransportista(vt, "", "identificacion");
        }        
    }    
           
    public void FiltrarTransportista(VcrudTransportista vt){
        KeyListener eventoTeclado=new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {                 
            }

            @Override
            public void keyPressed(KeyEvent ke) {
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                 String cadena = (vt.getTxtBuscarTra().getText());
                 CargarTransportista(vt, cadena, SeleccionaCampo(vt));
            }
        };
        vt.getTxtBuscarTra().addKeyListener(eventoTeclado);
    }
       
    public String SeleccionaCampo(VcrudTransportista vt){
        String camp= "";
        if (vt.getjComboBuscar().getSelectedIndex() == 0) {
            camp = "identificacion";
        }else{
            if (vt.getjComboBuscar().getSelectedIndex() == 1) {
                camp = "nombres";
            }else{
                camp= "tipo_id";
            }
        }
        return camp;
    }       
}






































