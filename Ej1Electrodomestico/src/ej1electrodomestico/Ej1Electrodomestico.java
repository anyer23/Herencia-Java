/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1electrodomestico;

import entidad.Lavadora;
import entidad.Television;

/**
 *
 * @author monte
 */
public class Ej1Electrodomestico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lavadora lavadora=new Lavadora();
        Television tv=new Television();
        
        lavadora.crearLavadora();
        lavadora.precioFinal();
        
        System.out.println(lavadora.toString());
        tv.crearTelevisor();
        tv.precioFinal();
        
        System.out.println(tv.toString());
       
    }
    
}
