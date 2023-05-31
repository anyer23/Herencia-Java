/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1electrodomesticos;

import entidad.Lavadora;
import entidad.Television;

/**
 *
 * @author monte
 */
public class Ej1Electrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lavadora lava1 = new Lavadora(10, 2000, "azul", 'F', 20);//2600

        lava1.precioFinal();
        System.out.println(lava1);

     Television tv2 = new Television(30, true, 5000, "blanco", 'B', 10);//6400 1100
        tv2.precioFinal();
        System.out.println(tv2);

    }

}
