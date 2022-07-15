/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.ModeloProducto;
import VISTA.CRUD.VcrudCliente;
import VISTA.CRUD.VcrudProducto;
import VISTA.CRUD.VcrudProveedor;
import VISTA.CRUD.VcrudUsuario;
import VISTA.PRINCIPAL;
import VISTA.VLogin;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author james
 */
public class ControlPrincipal {

    private PRINCIPAL contenedor;
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
        vlogin.getBtn_iniciarsesion().addActionListener(action);
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
        contenedor = new PRINCIPAL();
        vlogin.dispose();
        contenedor.setVisible(true);
        contenedor.setExtendedState(JFrame.MAXIMIZED_BOTH);

        //Abre ventana crud clientes
        contenedor.getItemClientes().addActionListener(l -> {
            contenedor.getDtp_principal().removeAll();
            AbrirCrudCliente();
        });

        //Abre ventana crud Usuarios
        contenedor.getItemUsuarios().addActionListener(l -> {
            contenedor.getDtp_principal().removeAll();
            AbrirCrudUsuario();
        });

        //Abre ventana crud Proveedores
        contenedor.getItemProveedores().addActionListener(l -> {
            contenedor.getDtp_principal().removeAll();
            AbrirCrudProveedor();
        });

        //Abre ventana crud Producto
        contenedor.getItemProductos().addActionListener(l -> {
            contenedor.getDtp_principal().removeAll();
            AbrirCrudProducto();
        });

    }
    //Fin Inicia Programa

    //Abrir CRUD CLIENTE
    public void AbrirCrudCliente() {
        ControlCRUDCliente ccc = new ControlCRUDCliente();
        VcrudCliente vcc = new VcrudCliente();
        contenedor.getDtp_principal().add(vcc);
        contenedor.getDtp_principal().updateUI();
        CentrarVentanaInterna(vcc);
        ccc.IniciarControl(vcc);
    }
    //

    //Arir CRUD Usuario
    public void AbrirCrudUsuario() {
        VcrudUsuario vcu = new VcrudUsuario();
        contenedor.getDtp_principal().add(vcu);
        contenedor.getDtp_principal().updateUI();
        CentrarVentanaInterna(vcu);
    }
    //

    //Abrir CRUD Proveedor
    public void AbrirCrudProveedor() {
        VcrudProveedor vcp = new VcrudProveedor();
        contenedor.getDtp_principal().add(vcp);
        contenedor.getDtp_principal().updateUI();
        CentrarVentanaInterna(vcp);
    }
    //

    //Abrir CRUD Producto
    public void AbrirCrudProducto() {
        //ControlCRUDProducto pr = new ControlCRUDProducto();
        ModeloProducto mode= new ModeloProducto();
        VcrudProducto vcpd = new VcrudProducto();
        contenedor.getDtp_principal().add(vcpd);
        contenedor.getDtp_principal().updateUI();
        CentrarVentanaInterna(vcpd);
         ControlProductos cp= new ControlProductos(mode, vcpd);
        cp.inicarControl();
         //vcpd(vcpd);

    }
//    

//Centrar Ventanas Internas
    public void CentrarVentanaInterna(JInternalFrame internalFr) {
        int x = (contenedor.getDtp_principal().getWidth() / 2) - internalFr.getWidth() / 2;
        int y = (contenedor.getDtp_principal().getHeight() / 2) - internalFr.getHeight() / 2;
        if (internalFr.isShowing()) {
            internalFr.setLocation(x, y);
        } else {
            internalFr.show();
            internalFr.setLocation(x, y);
        }
    }
    /*
    public void Centrar(JInternalFrame frame) {
        int x = (contenedor.getDtp_principal().getWidth() / 2 - frame.getWidth() / 2);
        int y = (contenedor.getDtp_principal().getHeight() / 2 - frame.getHeight() / 2);
        if (frame.isShowing()) {
            frame.setLocation(x, y);
        } else {
            contenedor.getDtp_principal().add(frame);
            frame.setLocation(x, y);
        }
    }
     */
    //Fin Centrar Ventanas Internas
}
