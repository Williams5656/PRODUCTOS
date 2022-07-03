/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Cliente;
import VISTA.CRUD.VcrudCliente;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author james
 */
public class ControlCRUDCliente {
    
    Cliente cli=new Cliente();
    VcrudCliente vcc=new VcrudCliente();    
    
    public void IniciarControl(VcrudCliente vcc){
        CargarCliente(vcc);
        
    }
    
    private void CargarCliente(VcrudCliente vistac){
        //recibimos los datos de la base
        List<Cliente> ListaC = cli.mostrarClientes();
        vcc.getJtb_cliente().setRowHeight(135);
        DefaultTableModel mtdTable;
        mtdTable = (DefaultTableModel)vcc.getJtb_cliente().getModel();
        mtdTable.setRowCount(0);
        ListaC.forEach(p->{
        String Fila[]={p.getCedula(),p.getApellido(),p.getNombre(), p.getCelular(), p.getDomicilio()};
        mtdTable.addRow(Fila);
        });
        vistac.getJtb_cliente().setModel(mtdTable);
    }    
    
}
