/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4calculosformas;

import entidad.Circulo;
import  ej4calculosformas.Ej4CalculosFormas;
import entidad.Rectangulo;
/**
 *
 * @author monte
 */
public class Ej4CalculosFormas {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulo circulo=new Circulo(5.0) {
            @Override
            public double Circulo() {
              System.out.println("Se hace los calculos en circulo"); 
              return  calcularArea()+calculaPerimetro();
            }

            @Override
            public double Rectangulo() {
                System.out.println("Sehace los calculos de rectangulo"); 
            return calcularArea()+calculaPerimetro();
            }
        };
        System.out.println("Area circulo "+circulo.calcularArea());
        System.out.println("Perimetro circulo "+circulo.calculaPerimetro());
         
        Rectangulo rectang=new Rectangulo(10, 15) {
            @Override
            public double Circulo() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
            @Override
            public double Rectangulo() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        
        System.out.println("El area del rectangulo "+rectang.calcularArea());
        System.out.println("El perimetro del rectangulo "+rectang.calculaPerimetro());
    }
    
}
