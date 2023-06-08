/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import atributos.Estudiante;
import atributos.Persona;
import atributos.PersonalServicio;
import atributos.Profesor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author monte
 */
public class SistemaFacultad {

    Scanner leer = new Scanner(System.in);
   

    Estudiante student = new Estudiante("Informatica", "Mario", "Lopez", "Soltero", "12345");
    PersonalServicio personalSer = new PersonalServicio("Biblioteca", 2015, 03, "Andrez", "Perez", "Soltero", "45120");
    Profesor profesor = new Profesor("Matematicas", 2012, '5', "mario", "Rios", "casado", "45678");

    public void CambioEstadoCivil() {

        System.out.println("Ingrese al nuevo estado civil");
        student.setEstadoCivil(leer.nextLine());

    }

    public void mostraDatos() {
        leer.nextLine();
        System.out.println("De que persona desea ver la informacion");
        String op = leer.nextLine().toLowerCase();
        if (op.equals("estudiante")) {
            System.out.println(student);
        }

        if (op.equals("profesor")) {
            System.out.println(profesor);
        }
         if (op.equals("personal de servicio")) {
            System.out.println(personalSer);
        }
        
    }

    public void menu() {

        int op;
        do {
            System.out.println("Menu");
            System.out.println("1. Cambion de estado civil");
            System.out.println("2. Reasignacion de despacho");
            System.out.println("3.Matriculacion de un estudiante");
            System.out.println("4. Cambio de departamento");
            System.out.println("5. Traslado de seccion del personal de servicio");
            System.out.println("6. Mostrar datos");
            op = leer.nextInt();
            String cp = " ";
            switch (op) {
                case 1:
                    System.out.println("A que persona desea cambiar el estado civil (Estudiante/Profesor/Personal de Servicio");
                    if (cp.equalsIgnoreCase("Estudente")) {
                        profesor.getEstadoCivil();
                        CambioEstadoCivil();
                    }

                    if (cp.equalsIgnoreCase("Profesor")) {
                        profesor.getEstadoCivil();
                        CambioEstadoCivil();
                    }

                    if (cp.equalsIgnoreCase("Presonal de servicio")) {
                        personalSer.getEstadoCivil();
                        CambioEstadoCivil();
                    }

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;
                case 5:

                    break;
                case 6:
mostraDatos();
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (op != 0);
        leer.close();
    }
}
