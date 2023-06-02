/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author monte
 */
public abstract class Circulo  implements CalculosFormas{
    private double radio;

    public Circulo(double radio) {
        this.radio=radio;
        
    }
    
    public double calcularArea(){
        return PI*radio*radio;
    }
    
    public double calculaPerimetro(){
        return 2*PI*radio;
    }

  
  
 

    

   
    
}
