/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author prisc
 */
public class Persona {

    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;
    private String celular;
    private String telefono;
    private String fecha_nac;
    private String ciudad;
//    private String usuario;
//    private String contrasenia;
//    private int codigo_usuario;
//    private int codigo_cliente;

//    public Persona(String cedula, String nombre, String apellido, String correo, String direccion, String telefono, String fecha_nac, String usuario, String contrasenia, int codigo_usuario, int codigo_cliente) {
//        this.cedula = cedula;
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.correo = correo;
//        this.direccion = direccion;
//        this.telefono = telefono;
//        this.fecha_nac = fecha_nac;
////        this.usuario = usuario;
////        this.contrasenia = contrasenia;
////        this.codigo_usuario = codigo_usuario;
////        this.codigo_cliente = codigo_cliente;
//    }

    public Persona() {
    }
    
    public Persona(String cedula, String nombre, String apellido, String correo, String direccion, String telefono, String fecha_nac, String ciudad, String celular) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha_nac = fecha_nac;
        this.ciudad = ciudad;
        this.celular = celular;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getCelular() {
        return celular;
    }

//
//    public String getUsuario() {
//        return usuario;
//    }
//
//    public void setUsuario(String usuario) {
//        this.usuario = usuario;
//    }
//
//    public String getContrasenia() {
//        return contrasenia;
//    }
//
//    public void setContrasenia(String contrasenia) {
//        this.contrasenia = contrasenia;
//    }
//
//    public int getCodigo_usuario() {
//        return codigo_usuario;
//    }
//
//    public void setCodigo_usuario(int codigo_usuario) {
//        this.codigo_usuario = codigo_usuario;
//    }
//
//    public int getCodigo_cliente() {
//        return codigo_cliente;
//    }
//
//    public void setCodigo_cliente(int codigo_cliente) {
//        this.codigo_cliente = codigo_cliente;
//    }
    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
