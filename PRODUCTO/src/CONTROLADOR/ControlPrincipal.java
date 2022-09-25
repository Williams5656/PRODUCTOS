/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import VISTA.CRUD.VCrearCliente;
import VISTA.CRUD.VCrearFactura;
import VISTA.CRUD.VCrearProducto;
import VISTA.CRUD.VCrearProveedor;
import VISTA.CRUD.VCrearTransportista;
import VISTA.CRUD.VOpcionesCli;
import VISTA.CRUD.VOpcionesComp;
import VISTA.CRUD.VOpcionesProd;
import VISTA.CRUD.VcrudCliente;
import VISTA.CRUD.VcrudProducto;
import VISTA.CRUD.VcrudProveedor;
import VISTA.CRUD.VcrudTransportista;
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
            //If usuario en la base, permitir ingreso
            iniciarPrograma();
        }
    };   
    //fin proceso verificaion usuario

    //Inicia Prgrama
    private void iniciarPrograma() {
        contenedor = new PrincipalC();
        vlogin.dispose();
        contenedor.setVisible(true);
        //Abre ventana opciones Producto
        MLProducto();
        //Abre ventana opciones Clientes, proveedores y transportistas
        MLCliPro();
        //Abre ventana opciones Facturas, etc
        MLCompEle();
    }
    //Fin Inicia Programa

    //Internal Frames
    //Abrir CRUD Producto
    public void AbrirMostrarProducto() {
        ControlCRUDProducto ccp=new ControlCRUDProducto();
        VcrudProducto vcpd = new VcrudProducto();
        contenedor.getDtPrincipal().add(vcpd);
        contenedor.getDtPrincipal().updateUI();
        CentrarVentanaInterna(vcpd);
        ccp.inicarControl(vcpd);
    }   
    
    //
    public void AbrirCrearProducto(){
        ControlCRUDProducto ccp=new ControlCRUDProducto();
        VCrearProducto vcpd = new VCrearProducto();
        contenedor.getDtPrincipal().add(vcpd);
        contenedor.getDtPrincipal().updateUI();
        CentrarVentanaInterna(vcpd);
        ccp.iniciarControlCrear(vcpd);
    }
     
    //Abrir CRUD CLIENTE
    public void AbrirMostrarCliente() {
        ControlCRUDCliente ccc = new ControlCRUDCliente();
        VcrudCliente vcc = new VcrudCliente();
        contenedor.getDtPrincipal().add(vcc);
        contenedor.getDtPrincipal().updateUI();
        CentrarVentanaInterna(vcc);
        ccc.IniciarControl(vcc);
    }
    
    public void AbrirCrearCliente(){
        ControlCRUDCliente ccp=new ControlCRUDCliente();
        VCrearCliente vcc = new VCrearCliente();
        contenedor.getDtPrincipal().add(vcc);
        contenedor.getDtPrincipal().updateUI();
        CentrarVentanaInterna(vcc);
        ccp.IniciarControlCrear(vcc);
    }    
    //

    //Abrir CRUD Proveedores
    public void AbrirCrearProveedor() {
        controlCrudProveedor ccc = new controlCrudProveedor ();
        VCrearProveedor vcp = new VCrearProveedor();
        contenedor.getDtPrincipal().add(vcp);
        contenedor.getDtPrincipal().updateUI();
        CentrarVentanaInterna(vcp);
        ccc.iniciarControlCrear(vcp);
    }        
    
    public void AbrirMostrarProveedor() {
        controlCrudProveedor ccc = new controlCrudProveedor ();
        VcrudProveedor vcp = new VcrudProveedor();
        contenedor.getDtPrincipal().add(vcp);
        contenedor.getDtPrincipal().updateUI();
        CentrarVentanaInterna(vcp);
        ccc.iniciarControl(vcp);
    }    
    
    //Abrir CRUD Proveedores
    public void AbrirCrearTransportista() {
        ControlCrudTransportista cct = new ControlCrudTransportista ();
        VCrearTransportista vct = new VCrearTransportista();
        contenedor.getDtPrincipal().add(vct);
        contenedor.getDtPrincipal().updateUI();
        CentrarVentanaInterna(vct);
        cct.iniciarControlCrear(vct);
    }        
    
    public void AbrirMostrarTransportista() {
        ControlCrudTransportista cct = new ControlCrudTransportista ();
        VcrudTransportista vct = new VcrudTransportista();
        contenedor.getDtPrincipal().add(vct);
        contenedor.getDtPrincipal().updateUI();
        CentrarVentanaInterna(vct);
        cct.iniciarControl(vct);
    }     
    
    public void AbrirCrearFactura(){
        VCrearFactura vcpd = new VCrearFactura();
        contenedor.getDtPrincipal().add(vcpd);
        contenedor.getDtPrincipal().updateUI();
        CentrarVentanaInterna(vcpd);
    }    
    
//    //Arir CRUD Usuario
//    public void AbrirCrudUsuario() {
//        VcrudUsuario vcu = new VcrudUsuario();
//        contenedor.getDtp_principal().add(vcu);
//        contenedor.getDtp_principal().updateUI();
//        CentrarVentanaInterna(vcu);
//    }
//    //
//

    //Abrir Eleccion de acciones en producto
    public void AbrirOpcionesProd(){
        VOpcionesProd vop=new VOpcionesProd();
        contenedor.getDtPrincipal().add(vop);
        contenedor.getDtPrincipal().updateUI();
        CentrarVentanaInterna(vop);
        AsignaBtnControlPro(vop);
    }
    
    public void AbrirOpcionesCli(){
        VOpcionesCli voc=new VOpcionesCli();
        contenedor.getDtPrincipal().add(voc);
        contenedor.getDtPrincipal().updateUI();
        CentrarVentanaInterna(voc);   
        AsignaBtnControlCli(voc);
    }
    
    public void AbrirOpcionesComp(){
        VOpcionesComp voc=new VOpcionesComp();
        contenedor.getDtPrincipal().add(voc);
        contenedor.getDtPrincipal().updateUI();
        CentrarVentanaInterna(voc);   
        AsignaBtnControlComp(voc);
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
    
    //MouseListener Botones jlabel
    public void AsignaBtnControlPro(VOpcionesProd vop){        
        //LbNuevo
        vop.getLbNuev().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
               contenedor.getDtPrincipal().removeAll();
               AbrirCrearProducto();
            }
        });    
        
        vop.getLbMostrar().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
               contenedor.getDtPrincipal().removeAll();
                AbrirMostrarProducto();
            }
        });           
    }
    
    public void AsignaBtnControlCli(VOpcionesCli voc){        
        //LbNuevo
        
        voc.getLbNCli().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
               contenedor.getDtPrincipal().removeAll();
               AbrirCrearCliente();
            }
        });            
        
        voc.getLbMostrarCli().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
               contenedor.getDtPrincipal().removeAll();
               AbrirMostrarCliente();
            }
        });    
        
        voc.getLbNProv().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
               contenedor.getDtPrincipal().removeAll();
                AbrirCrearProveedor();
            }
        });   
        
        voc.getLbMostrarProv().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
               contenedor.getDtPrincipal().removeAll();
                AbrirMostrarProveedor();
            }
        });           

        voc.getLbNTrans().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
               contenedor.getDtPrincipal().removeAll();
                AbrirCrearTransportista();
            }
        });          
        
        voc.getLbMostrarTrans().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
               contenedor.getDtPrincipal().removeAll();
                AbrirMostrarTransportista();
            }
        });          
    } 
    
    public void AsignaBtnControlComp(VOpcionesComp voc){        
        //LbNuevo
        voc.getLbNFact().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
               contenedor.getDtPrincipal().removeAll();
               AbrirCrearFactura();
            }
        });    
      
    }    
    
    //
    //MouseListener CRUD producto
    public void MLProducto(){
        contenedor.getLbProdYSer().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
               contenedor.getDtPrincipal().removeAll();
                 AbrirOpcionesProd();
            }
        });   
    }
    //Clientes Proveedores
    public void MLCliPro(){
        contenedor.getLbCliYProv().addMouseListener(new java.awt.event.MouseAdapter() {            
            @Override
            public void mouseReleased(MouseEvent e) {
               contenedor.getDtPrincipal().removeAll();
               AbrirOpcionesCli();
            }
        });          
    }
    
    //Comprobantes Electronicos
    public void MLCompEle(){
        contenedor.getLbCompElec().addMouseListener(new java.awt.event.MouseAdapter() {            
            @Override
            public void mouseReleased(MouseEvent e) {
               contenedor.getDtPrincipal().removeAll();
               AbrirOpcionesComp();
            }
        });          
    }    
    
    //MouseListener Login
    public void mouseListenerBtn(JLabel jc) {

        jc.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
              iniciarPrograma();
            }
        }
        );
    }    
    //
}
