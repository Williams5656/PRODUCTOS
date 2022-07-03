/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author prisc
 */
public class Usuario extends Persona{
    
    private String contrasenia;
    private int codigo_usuario;
    private String usuario;

    public Usuario() {
    }

    public Usuario(String contrasenia, int codigo_usuario, String cedula, String nombre, String apellido, String correo, String direccion, String telefono, String fecha_nac, String ciudad, String celular, String usuario) {
        super(cedula, nombre, apellido, correo, direccion, telefono, fecha_nac, ciudad, celular);
        this.contrasenia = contrasenia;
        this.codigo_usuario = codigo_usuario;
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getCodigo_usuario() {
        return codigo_usuario;
    }

    public void setCodigo_usuario(int codigo_usuario) {
        this.codigo_usuario = codigo_usuario;
    }   

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
