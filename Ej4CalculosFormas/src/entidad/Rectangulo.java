/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author monte
 */
public abstract class Rectangulo implements CalculosFormas{
    private double base;
      private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    
      public double calcularArea(){
        return base*altura;
    }
    
    public double calculaPerimetro(){
        return 2*(base*altura);
    }
}
