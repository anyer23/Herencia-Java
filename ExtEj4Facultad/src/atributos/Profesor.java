/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atributos;

/**
 *
 * @author monte
 */
public class Profesor extends Empleados{
    private String[] departamentos={"Idiomas","Matematicas","Historia","Redes"}; 
    
    private String depProfesor;

    public Profesor() {
    }

    public Profesor(String depProfesor, double anoIncorporacionFacu, double numDespacho, String nombre, String apellido, String estadoCivil, String numIdentificacion) {
        super(anoIncorporacionFacu, numDespacho, nombre, apellido, estadoCivil, numIdentificacion);
        this.depProfesor = depProfesor;
    }

   

    public String[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(String[] departamentos) {
        this.departamentos = departamentos;
    }

    public String getDepProfesor() {
        return depProfesor;
    }

    public void setDepProfesor(String depProfesor) {
        this.depProfesor = depProfesor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Profesor ");
          sb.append("\nNombre ").append(getNombre());
        sb.append("\nApellido").append(getApellido());
        sb.append(" \nEstado Civil ").append(getEstadoCivil());
        sb.append("\nNumIdentificacion=").append(getNumIdentificacion());
        sb.append("\nAño de Incorporacion a la Facultad ").append(getAnoIncorporacionFacu());
        sb.append("\nNumero de Despacho ").append(getNumDespacho());
      
        //sb.append("\nDepartamentos ").append(departamentos);
        sb.append("\nDepProfesor=").append(depProfesor);
        
        return sb.toString();
    }
    
    
}
