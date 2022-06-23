/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author prisc
 */
public class Cliente {

    private int codigo_cliente;
    private String cedula_cliente;
    private String nombre_cliente;
    private String apellido_cliente;
    private String correo_cliente;
    private String fecha_nac_cliente;
    private String telefono_cliente;
    private String direccion_cliente;
    private String ciudad_cliente;

    public Cliente(int codigo_cliente, String cedula_cliente, String nombre_cliente, String apellido_cliente, String correo_cliente, String fecha_nac_cliente, String telefono_cliente, String direccion_cliente, String ciudad_cliente) {
        this.codigo_cliente = codigo_cliente;
        this.cedula_cliente = cedula_cliente;
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.correo_cliente = correo_cliente;
        this.fecha_nac_cliente = fecha_nac_cliente;
        this.telefono_cliente = telefono_cliente;
        this.direccion_cliente = direccion_cliente;
        this.ciudad_cliente = ciudad_cliente;
    }

    public String getCiudad_cliente() {
        return ciudad_cliente;
    }

    public void setCiudad_cliente(String ciudad_cliente) {
        this.ciudad_cliente = ciudad_cliente;
    }

  

    public int getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(int codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getCedula_cliente() {
        return cedula_cliente;
    }

    public void setCedula_cliente(String cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellido_cliente() {
        return apellido_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    public String getCorreo_cliente() {
        return correo_cliente;
    }

    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }

    public String getFecha_nac_cliente() {
        return fecha_nac_cliente;
    }

    public void setFecha_nac_cliente(String fecha_nac_cliente) {
        this.fecha_nac_cliente = fecha_nac_cliente;
    }

    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

}
