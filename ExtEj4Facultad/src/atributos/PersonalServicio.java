/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atributos;

/**
 *
 * @author monte
 */
public class PersonalServicio extends Empleados{
    private String []seccion={"Biblioteca","Laboratorio","Coliseo","Secretaria","Decanato"};
    private String seccionPersonal;

    public PersonalServicio() {
    }

    public PersonalServicio(String seccionPersonal, double anoIncorporacionFacu, double numDespacho, String nombre, String apellido, String estadoCivil, String numIdentificacion) {
        super(anoIncorporacionFacu, numDespacho, nombre, apellido, estadoCivil, numIdentificacion);
        this.seccionPersonal = seccionPersonal;
    }

   

    public String[] getSeccion() {
        return seccion;
    }

    public void setSeccion(String[] seccion) {
        this.seccion = seccion;
    }

    public String getSeccionPersonal() {
        return seccionPersonal;
    }

    public void setSeccionPersonal(String seccionPersonal) {
        this.seccionPersonal = seccionPersonal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Personal de Servicio{");
        sb.append("\nNombre ").append(getNombre());
        sb.append("\nAapellido ").append(getApellido());
        sb.append(" \nEstado Civil ").append(getEstadoCivil());
        sb.append("\nNumIdentificacion=").append(getNumIdentificacion());
   
     //   sb.append("\nSeccion ").append(seccion);
        sb.append("\nseccionPersonal ").append(seccionPersonal);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
