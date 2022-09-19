/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Cliente;
import MODELO.Validaciones;
import VISTA.CRUD.VCrearCliente;
import VISTA.CRUD.VcrudCliente;
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
public class ControlCRUDCliente {
    
    Cliente cli=new Cliente();
    VcrudCliente vcc=new VcrudCliente();    
    VCrearCliente vac=new VCrearCliente();
    Validaciones vali = new Validaciones();
    
    public void IniciarControl(VcrudCliente vcc){
        vali.validarJDialog(vcc.getJdCliente());
        FiltrarCliente(vcc);
        CargarCliente(vcc, "","id_cliente");  
        vcc.getBtnEliminarCli().addActionListener(l->EliminarCliente(vcc));
        vcc.getBtnEditarCli().addActionListener(l->EditarCliente(vcc));
        vcc.getBtnGuardarCli().addActionListener(l->ActuCli(vcc));
    }
    
    public void IniciarControlCrear(VCrearCliente vac){
        vac.getBtnGuardarCli().addActionListener(l->GuardarCliente(vac));
    }    
    
    //Carga datos de cliente a la tabla
    private void CargarCliente(VcrudCliente vc, String busca, String campo){
        List<Cliente> ListaC = cli.mostrarClientes(busca, campo);
//        vcc.getJtb_cliente().setRowHeight(135);
        DefaultTableModel mtdTable;
        mtdTable = (DefaultTableModel)vcc.getJtb_cliente().getModel();
        mtdTable.setRowCount(0);
        ListaC.forEach(p->{
        String Fila[]={p.getIdcliente(),p.getNombres(),p.getTipoid()};
        mtdTable.addRow(Fila);
        });
        vc.getJtb_cliente().setModel(mtdTable);
    }    
    
    //Agregar un cliente
    public void GuardarCliente(VCrearCliente vc){        
        //Agregar
        List<Cliente> Bc = new ArrayList<>();//Para buscar si el cliente ya se encuentra en la base de datos
        try {
                Bc = cli.mostrarClientes(vc.getTxtId().getText(),"id_cliente");
                Bc.get(0).getTipoid().equalsIgnoreCase("");
                JOptionPane.showMessageDialog(null, "El Cliente ya se encuentra registrado en la base de datos");
        } catch (Exception e) {
                cli.InsertarCliente(vc.getCbTipoId().getSelectedItem().toString(), vc.getTxtId().getText(), vc.getTxtNombre().getText(), vc.getTxtAliasSuc().getText(), vc.getTxtCodSucursal().getText(), vc.getTxtDireccion().getText(), vc.getTxttelefono().getText(), vc.getTxtCelular().getText(), vc.getTxtCorreo().getText(),vc.getCbProvincia().getSelectedItem().toString(), vc.getCbCiudad().getSelectedItem().toString());
                JOptionPane.showMessageDialog(vcc, "Guardado Exitoso");
        }
    }   
    
    public void ActuCli(VcrudCliente vc){
            //Guardar Cambios editados
            try{
                cli.ActualizarCliente(vc.getCbTipoId().getSelectedItem().toString(), vc.getTxtIdentificacion().getText(), vc.getTxtNombre().getText(), vc.getTxtSucursal().getText(), vc.getTxtCodSucursal().getText(), vc.getTxtDireccion().getText(), vc.getTxttelefono().getText(), vc.getTxtCelular().getText(), vc.getTxtCorreo().getText(),vc.getCbProvincia().getSelectedItem().toString(), vc.getCbCiudad().getSelectedItem().toString());
                JOptionPane.showMessageDialog(vcc, "Cambios guardados con exito");
                CargarCliente(vc, "", "id_cliente");
                vc.getJdCliente().dispose();
            }catch(Exception e){}   
    }
    
    //Editar Cliente
    public void EditarCliente(VcrudCliente vistac){
        int filaseleccionada = vistac.getJtb_cliente().getSelectedRow();
        if(filaseleccionada<0){
            JOptionPane.showMessageDialog(null, "Seleccione el cliente que desea editar");
        }else{
                    //configuracion para mostrar jdialog
                    vistac.getJdCliente().setVisible(true);
                    vistac.getJdCliente().setSize(1100,700);
                    vistac.getJdCliente().setResizable(false);
                    vistac.getJdCliente().setTitle("Editar");
                    vistac.getTxtIdentificacion().setEditable(false);
                    vistac.getCbTipoId().setEnabled(false);
            //carga
            int fila = vistac.getJtb_cliente().getSelectedRow();
            String cedula = vistac.getJtb_cliente().getValueAt(fila, 0).toString();
             List<Cliente> ListaC = cli.mostrarClientes(cedula, "id_cliente");
             vistac.getTxtIdentificacion().setText(ListaC.get(0).getIdcliente());      
             vistac.getTxtNombre().setText(ListaC.get(0).getNombres());
             vistac.getTxtSucursal().setText(ListaC.get(0).getAliassucur());
             vistac.getTxtDireccion().setText(ListaC.get(0).getDireccion());
             vistac.getTxtCodSucursal().setText(ListaC.get(0).getCodsucur());
             vistac.getTxttelefono().setText(ListaC.get(0).getTelefono());
             vistac.getTxtCelular().setText(ListaC.get(0).getCelular());
             vistac.getTxtCorreo().setText(ListaC.get(0).getCorreo());
        }
    }      
    
    //Eliminar Clientes
    public void EliminarCliente(VcrudCliente vistac){
        int filaseleccionada = vistac.getJtb_cliente().getSelectedRow();
        if(filaseleccionada<0){
            JOptionPane.showMessageDialog(null, "Seleccione el cliente que desea eliminar");
        }else{
        int fila = vistac.getJtb_cliente().getSelectedRow();
        String cedula = vistac.getJtb_cliente().getValueAt(fila, 0).toString();
        String nombre = vistac.getJtb_cliente().getValueAt(fila, 1).toString();
                int elim = JOptionPane.showConfirmDialog(vcc, "¿Seguro que desea eliminar a "+nombre+"?","Eliminar",JOptionPane.YES_NO_OPTION);
                if(elim==0){
                    cli.EliminarCliente(cedula);
                    CargarCliente(vistac, "", "id_cliente");
                    JOptionPane.showMessageDialog(vcc, "Cliente eliminado exitosamente");
                }
        CargarCliente(vcc, "","id_cliente");          
        }        
    }    
    
    //Filtrar Clientes    
    public void FiltrarCliente(VcrudCliente vc){
        KeyListener eventoTeclado=new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {                 
            }

            @Override
            public void keyPressed(KeyEvent ke) {
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                 String busca = (vc.getTxtBuscarCli().getText());
                 CargarCliente(vcc, busca, SeleccionaCampo(vc));
            }
        };
        vc.getTxtBuscarCli().addKeyListener(eventoTeclado);
    }    
    
    public String SeleccionaCampo(VcrudCliente vc){
        String camp= "";
        if (vc.getCbBuscarCli().getSelectedIndex() == 0) {
            camp = "id_cliente";
        }else{
            if (vc.getCbBuscarCli().getSelectedIndex() == 1) {
                camp = "nombres";
            }else{
                camp= "tipo_id";
            }
        }
        return camp;
    }
}
