/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atributos;

/**
 *
 * @author monte
 */
public class Estudiante extends Persona{
    private String cursoMatriculado;

    public Estudiante() {
    }

    public Estudiante(String cursoMatriculado, String nombre, String apellido, String estadoCivil, String numIdentificacion) {
        super(nombre, apellido, estadoCivil, numIdentificacion);
        this.cursoMatriculado = cursoMatriculado;
    }

    public String getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante{");
        sb.append("\nNombre ").append(getNombre());
        sb.append("\nAapellido ").append(getApellido());
        sb.append(" \nEstado Civil ").append(getEstadoCivil());
        sb.append("\nNumIdentificacion=").append(getNumIdentificacion());
   
        sb.append("\nCursoMatriculado ").append(cursoMatriculado);
        
        
        
        return sb.toString();
    }
    
    
}
