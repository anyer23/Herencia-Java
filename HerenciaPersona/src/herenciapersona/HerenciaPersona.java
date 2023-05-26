/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciapersona;

import herencia.Alumno;
import herencia.Persona;
import java.util.Scanner;

/**
 *
 * @author monte
 */
public class HerenciaPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumna1=new Alumno("maria", 23, 25511);
        Alumno alumno2=new Alumno("Juan", 30, 22111);
      //  Persona person=new Persona(nombre, Integer.SIZE, Integer.SIZE);
        
       alumna1.setMateria("Matematicas");
       alumno2.setMateria("Historia");
        System.out.println(alumna1.getEdad());
        System.out.println(alumna1.getMateria());
    }
    
}
