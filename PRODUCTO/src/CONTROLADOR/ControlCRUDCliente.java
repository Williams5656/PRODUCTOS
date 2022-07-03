/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Cliente;
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
    
    public void IniciarControl(VcrudCliente vcc){
        FiltrarCliente(vcc);
        CargarCliente(vcc, "", "cedula");  
        vcc.getBtnAgregarCli().addActionListener(l->AgregarCliente(vcc));
        vcc.getBtnGuardarCli().addActionListener(l->GuardarCliente(vcc));
        vcc.getBtnEliminarCli().addActionListener(l->EliminarCliente(vcc));
        vcc.getBtnEditarCli().addActionListener(l->EditarCliente(vcc));
    }
    
    //Carga datos de cliente a la tabla
    private void CargarCliente(VcrudCliente vc, String cedula, String campo){
        List<Cliente> ListaC = cli.mostrarClientes(cedula, campo);
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
    
    //Agregar un cliente
    
    public void AgregarCliente(VcrudCliente vc){
        //configuracion para mostrar jdialog
        vc.getJdCliente().setVisible(true);
        vc.getJdCliente().setSize(580,420);
        vc.getJdCliente().setResizable(false);
        vc.getJdCliente().setTitle("Agregar");
        vc.getjLabelTitulo().setText("Agregar Cliente");
        //proceso de guardado              
    }     

    public void GuardarCliente(VcrudCliente vc){        
        //Agregar
        if(vc.getJdCliente().getTitle().equalsIgnoreCase("Agregar")){
            List<Cliente> Bc = new ArrayList<>();
            try {
                Bc = cli.mostrarClientes(vc.getTxtCedulaCli().getText(),"cedula");
                Bc.get(0).getCedula().equalsIgnoreCase("");
                try {
                    Bc = cli.mostrarClientes(vc.getTxtCedulaCli().getText(),"cedula");
                    Bc.get(0).getCedula().equalsIgnoreCase("");
                    JOptionPane.showMessageDialog(null, "El Cliente ya se encuentra registrado en la base de datos");
                } catch (Exception e) {
                    cli.InsertarCliente(vc.getTxtDireccionDom().getText(), vc.getTxtCedulaCli().getText());
                    JOptionPane.showMessageDialog(vcc, "Guardado Exitoso");
                    CargarCliente(vc, "","cedula");
                    vc.getJdCliente().dispose(); 
                }
            } catch (Exception e) {
                    cli.InsertarPersona(vc.getTxtCedulaCli().getText(), vc.getTxtNombre().getText(),vc.getTxtApellido().getText(), vc.getTxtDireccion().getText(), vc.getTxtTelefono().getText(), vc.getTxtCelular().getText(), vc.getTxtCiudad().getText(), vc.getTxtDireccionDom().getText(),vc.getTxtCorreo().getText());
                    JOptionPane.showMessageDialog(vcc, "Guardado Exitoso");
                    CargarCliente(vc, "","cedula");
                    vc.getJdCliente().dispose();             
            }
        }        
        //editar
        if(vc.getJdCliente().getTitle().equalsIgnoreCase("Editar")){
            try{
                cli.ActualizarPersona(vc.getTxtCedulaCli().getText(), vc.getTxtNombre().getText(),vc.getTxtApellido().getText(), vc.getTxtCorreo().getText(), vc.getTxtDireccion().getText(),vc.getTxtTelefono().getText(), vc.getTxtCelular().getText(), vc.getTxtCiudad().getText(), vc.getTxtDireccionDom().getText());
                JOptionPane.showMessageDialog(vcc, "Cambios guardados con exito");
                CargarCliente(vc, "", "cedula");
                vc.getJdCliente().dispose();
            }catch(Exception e){}
        }         
    }   
    
    //Editar Cliente
    public void EditarCliente(VcrudCliente vistac){
        int filaseleccionada = vistac.getJtb_cliente().getSelectedRow();
        if(filaseleccionada<0){
            JOptionPane.showMessageDialog(null, "Seleccione el cliente que desea editar");
        }else{
                    //configuracion para mostrar jdialog
                    vistac.getJdCliente().setVisible(true);
                    vistac.getJdCliente().setSize(580,420);
                    vistac.getJdCliente().setResizable(false);
                    vistac.getJdCliente().setTitle("Editar");
                    vistac.getTxtCedulaCli().setEditable(false);
                    vistac.getjLabelTitulo().setText("Editar Cliente");
            //carga
            int fila = vistac.getJtb_cliente().getSelectedRow();
            String cedula = vistac.getJtb_cliente().getValueAt(fila, 0).toString();
             List<Cliente> ListaC = cli.mostrarClientes(cedula,"cedula");
             vistac.getTxtCedulaCli().setText(cedula);             
             vistac.getTxtNombre().setText(ListaC.get(0).getNombre());
             vistac.getTxtApellido().setText(ListaC.get(0).getApellido());
             vistac.getTxtDireccion().setText(ListaC.get(0).getDireccion());
             vistac.getTxtTelefono().setText(ListaC.get(0).getTelefono());
             vistac.getTxtCelular().setText(ListaC.get(0).getCelular());
             vistac.getTxtCiudad().setText(ListaC.get(0).getCiudad());
             vistac.getTxtDireccionDom().setText(ListaC.get(0).getDomicilio());
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
        String apellido = vistac.getJtb_cliente().getValueAt(fila, 2).toString();
                int elim = JOptionPane.showConfirmDialog(vcc, "¿Seguro que desea eliminar a "+nombre+" "+apellido+"?","Eliminar",JOptionPane.YES_NO_OPTION);
                if(elim==0){
                    cli.EliminarCliente(cedula);
                    CargarCliente(vistac, "", "cedula");
                    JOptionPane.showMessageDialog(vcc, "Cliente eliminado exitosamente");
                }
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
                 String cadena = (vc.getTxtBuscarCli().getText());
                 String campo = (String)vc.getjComboBuscar().getSelectedItem();
                 CargarCliente(vcc, cadena, campo);
            }
        };
        vc.getTxtBuscarCli().addKeyListener(eventoTeclado);
    }    
}
