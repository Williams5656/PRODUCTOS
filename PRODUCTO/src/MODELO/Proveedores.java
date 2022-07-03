/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author prisc
 */
public class Proveedores extends Persona{
    
    private int codigo_proveedor;
    private String razon_social;
    private String provincia;
  
    //metodo constructor

    public Proveedores() {
    } 
    
    public Proveedores(int codigo_proveedor, String razon_social, String provincia, String cedula, String nombre, String apellido, String correo, String direccion, String telefono, String fecha_nac, String ciudad, String celular) {
        super(cedula, nombre, apellido, correo, direccion, telefono, fecha_nac, ciudad, celular);
        this.codigo_proveedor = codigo_proveedor;
        this.razon_social = razon_social;
        this.provincia = provincia;
    }

    //Getters y setters

    public int getCodigo_proveedor() {
        return codigo_proveedor;
    }

    public void setCodigo_proveedor(int codigo_proveedor) {
        this.codigo_proveedor = codigo_proveedor;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
}
