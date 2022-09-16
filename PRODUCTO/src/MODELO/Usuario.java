/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author prisc
 */
public class Usuario{
    
    private String clave;
    private String usuario;
    private String permisos;

    public Usuario() {
    }

    public Usuario(String clave, String usuario, String permisos) {
        this.clave = clave;
        this.usuario = usuario;
        this.permisos = permisos;
    }

    //Getters y Setters

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPermisos() {
        return permisos;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
    }


}
