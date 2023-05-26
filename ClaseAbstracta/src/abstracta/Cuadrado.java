/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstracta;

/**
 *
 * @author monte
 */
public class Cuadrado implements Figura, Dibujable{

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

   
    @Override
    public double calcularArea() {
       double resultado=lado*lado;
    return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola, estoy dibujando un cuadrado");
    }
    
}
