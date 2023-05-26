/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstracta;

/**
 *
 * @author monte
 */
public class Circulo implements Figura, Dibujable, Rotable {

    private double radio=5;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

   

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;

    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    
    
    @Override
    public void dibujar() {
        System.out.println("Hola, estoy dibujando un circula");
    }

    @Override
    public void rotar() {
        System.out.println("Hola, estoy rotando un circulo");
    }

  

    
}
