/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author monte
 */
public class Alumno extends Persona{
    private String materia;

    public Alumno(String nombre, Integer edad, Integer documeto) {
        super(nombre, edad, documeto);
    }

    
    public Alumno(String materia, String nombre, Integer edad, Integer documeto) {
        super(nombre, edad, documeto);
        this.materia = materia;
    }

  
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDocumeto() {
        return documeto;
    }

    public void setDocumeto(Integer documeto) {
        this.documeto = documeto;
    }

   
}
