/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atributos;

/**
 *
 * @author monte
 */
public class Persona {

   protected String nombre;
    private String apellido,estadoCivil;
    private String numIdentificacion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String estadoCivil, String numIdentificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.numIdentificacion = numIdentificacion;
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

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(String numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona");
        sb.append("\nNombre ").append(nombre);
        sb.append("\nAapellido ").append(apellido);
        sb.append(" \nEstado Civil ").append(estadoCivil);
        sb.append("\nNumIdentificacion=").append(numIdentificacion);
        
        return sb.toString();
    }

   
    
    
}
