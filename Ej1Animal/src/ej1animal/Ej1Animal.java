/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1animal;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

/**
 *
 * @author monte
 */
public class Ej1Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Animal perro1 = new Perro("Stich", "Carnivoro", "Doberman", 15);
        Animal perro2 = new Perro("Teddy", "Croquetas", "Chihuahua", 10);
        Animal gato = new Gato("Pelusa", "Galletas", "Siames",15);
        Animal caballo = new Caballo("Spark", "Pasto", "Fino", 25);
     
    
        System.out.println(caballo);
        caballo.alimentarse();
        
        System.out.println(perro1);
        perro1.alimentarse();
    }
    
}
