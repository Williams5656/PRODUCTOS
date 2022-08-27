/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import VISTA.CRUD.VcliOpro;
import VISTA.CRUD.VcrudCliente;
import VISTA.CRUD.VcrudProducto;
import VISTA.CRUD.VcrudProveedor;
import VISTA.CRUD.VcrudUsuario;
import VISTA.PRINCIPAL;
import VISTA.PrincipalC;
import VISTA.VLogin;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

/**
 *
 * @author james
 */
public class ControlPrincipal {

    private PrincipalC contenedor;
    private final VLogin vlogin;

    public ControlPrincipal(VLogin vlogin) {
        this.vlogin = vlogin;
        componentesLogin();
    }

    //Inicia Control
    public void iniciarcontrol() {
        vlogin.setVisible(true);
    }

    //Cargar Login
    public void componentesLogin() {
        vlogin.setLocationRelativeTo(null);
        vlogin.setVisible(true);
        vlogin.setResizable(false);
        vlogin.getTxt_password().setEchoChar((char) '\u2022');
        mouseListenerBtn(vlogin.getLbEntrar());
        vlogin.getTxt_password().addActionListener(action);//para ingresar dando a enter
        vlogin.getTxt_cedula().addActionListener(action);//para ingresar dando a enter
    }
    //Fin Cargar Login

    //proceso verificacion usuario
    public Action action = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            iniciarPrograma();
        }
    };
    //fin proceso verificaion usuario

    //Inicia Prgrama
    private void iniciarPrograma() {
        contenedor = new PrincipalC();
        vlogin.dispose();
        contenedor.setVisible(true);
//        //Abre ventana crud Usuarios
//        contenedor.getItemUsuarios().addActionListener(l -> {
//            contenedor.getDtp_principal().removeAll();
//            AbrirCrudUsuario();
//        });

        //Abre ventana crud Producto
        contenedor.getLbProdYSer().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}
            
            @Override
            public void mouseReleased(MouseEvent e) {
               contenedor.getDtPrincipal().removeAll();
               AbrirCrudProducto();
            }
        });
        
        //Abre opcion entre Clientes o productos
        contenedor.getLbCliYProv().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}
            
            @Override
            public void mouseReleased(MouseEvent e) {
               contenedor.getDtPrincipal().removeAll();
               AbrirVentanaEscCP();
            }
        });        

    }
    //Fin Inicia Programa

    //Escoger entre Cli o Prov
    public void AbrirVentanaEscCP(){
        VcliOpro vcop = new VcliOpro();
        contenedor.getDtPrincipal().add(vcop);
        contenedor.getDtPrincipal().updateUI();  
        CentrarVentanaInterna(vcop);
        vcop.getBtnCliente().addActionListener(l -> {
            contenedor.getDtPrincipal().removeAll();
            AbrirCrudCliente();
        });
        vcop.getBtnProveedor().addActionListener(l -> {
            contenedor.getDtPrincipal().removeAll();
            AbrirCrudProveedor();
        });
    }
 
    //Abrir CRUD CLIENTE
    public void AbrirCrudCliente() {
        ControlCRUDCliente ccc = new ControlCRUDCliente();
        VcrudCliente vcc = new VcrudCliente();
        contenedor.getDtPrincipal().add(vcc);
        contenedor.getDtPrincipal().updateUI();
        CentrarVentanaInterna(vcc);
        ccc.IniciarControl(vcc);
    }
    //

//    //Arir CRUD Usuario
//    public void AbrirCrudUsuario() {
//        VcrudUsuario vcu = new VcrudUsuario();
//        contenedor.getDtp_principal().add(vcu);
//        contenedor.getDtp_principal().updateUI();
//        CentrarVentanaInterna(vcu);
//    }
//    //
//
//    //Abrir CRUD Proveedor
    public void AbrirCrudProveedor() {
        VcrudProveedor vcp = new VcrudProveedor();
        contenedor.getDtPrincipal().add(vcp);
        contenedor.getDtPrincipal().updateUI();
        CentrarVentanaInterna(vcp);
    }
    //

    //Abrir CRUD Producto
    public void AbrirCrudProducto() {
        //ControlCRUDProducto pr = new ControlCRUDProducto();
        ControlCRUDProducto ccp=new ControlCRUDProducto();
        VcrudProducto vcpd = new VcrudProducto();
        contenedor.getDtPrincipal().add(vcpd);
        contenedor.getDtPrincipal().updateUI();
        CentrarVentanaInterna(vcpd);
        ccp.inicarControl(vcpd);
    }
    //    

//Centrar Ventanas Internas
    public void CentrarVentanaInterna(JInternalFrame internalFr) {
        int x = (contenedor.getDtPrincipal().getWidth() / 2) - internalFr.getWidth() / 2;
        int y = (contenedor.getDtPrincipal().getHeight() / 2) - internalFr.getHeight() / 2;
        if (internalFr.isShowing()) {
            internalFr.setLocation(x, y);
        } else {
            internalFr.show();
            internalFr.setLocation(x, y);
        }
    }
//Fin Centrar Ventanas Internas
    
    //MouseListener
    public void mouseListenerBtn(JLabel jc) {

        jc.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {
              iniciarPrograma();
            }
         
            @Override
            public void mouseEntered(MouseEvent e) {}
        }
        );
    }    
    //
}
