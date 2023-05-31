/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1electrodomestico;

import entidad.Electrodomestico;
import entidad.Lavadora;
import entidad.Television;
import java.util.ArrayList;

/**
 *
 * @author monte
 */
public class Ej2Electrodomestico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Electrodomestico electro = new Electrodomestico();
        Television tv = new Television();
        ArrayList<Electrodomestico> productos = new ArrayList<>();

        productos.add(new Lavadora(10, 2000, "azul", 'D', 20));//4000 500 500
        productos.add(new Lavadora(20, 3000, "blanco", 'C', 30));//5100 500 600
                                    ///    0   500  5000+1000 800 100
        productos.add(new Television(10, true, 5000, "blanco", 'B', 10));//(7400  500 800 100 con 30")
        productos.add(new Television(21, false, 2000, "azul", 'A', 10));//4600 500 1100

        double precioTotalElectrodomestico = 0, precioLavadora = 0, precioTv = 0;

        for (Electrodomestico producto : productos) {

            precioTotalElectrodomestico += producto.precioFinal();
            
            if (producto instanceof Lavadora) {

                System.out.println(" precio lavadora " + producto.getPrecio());
                precioLavadora += producto.precioFinal();
            }
            if (producto instanceof Television) {
                System.out.println(" precio tv " + producto.precioFinal());
                precioTv += producto.precioFinal();
            }
        }
        System.out.println("Precio de las lavadoras " + precioLavadora);
        System.out.println("Precio de las televisiones " + precioTv);
        System.out.println("Precio total de los electrodomesticos " + precioTotalElectrodomestico);
    }

}
