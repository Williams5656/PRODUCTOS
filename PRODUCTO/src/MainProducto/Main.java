/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainProducto;

import CONTROLADOR.ControlPrincipal;
import VISTA.VLogin;

/**
 *
 * @author james
 */
public class Main {
    public static void main(String[] args) {
        try {
            VLogin vlogin = new VLogin();
            ControlPrincipal cp = new ControlPrincipal(vlogin);
            cp.iniciarcontrol();
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }   
}
