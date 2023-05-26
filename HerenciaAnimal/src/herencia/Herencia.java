/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

import entidad.Gato;
import entidad.Perro;
import madre.Animal;
import java.util.ArrayList;

/**
 *
 * @author monte
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Animal> pet = new ArrayList();
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();

        pet.add(a);
        pet.add(c);
        pet.add(b);

        for (Animal animal : pet) {
            animal.hacerRuido();
        }
    }

}
