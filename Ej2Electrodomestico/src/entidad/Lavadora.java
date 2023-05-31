/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author monte
 */
public class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        Scanner leer=new Scanner(System.in);
        
        crearElectrodomestico();
        System.out.println("Ingrese el nivel de carga");
        this.carga=leer.nextInt();
        
    }

    @Override
    public double precioFinal() {
        super.precioFinal(); 
        if (this.carga>30) {
            this.precio+=500;
        }
        return precio;
    }

    @Override
    public String toString() {
      StringBuffer sb=new StringBuffer();
        
      sb.append("\nLavadora \nPrecio ").append(precio);
      sb.append("\nColor ").append(color);
      sb.append("\nCarga ").append(carga);
      sb.append("\nConsumo energetico ").append(consumoEnergetico);
      sb.append("\nPeso ").append(peso);
      
      
      return sb.toString();
    
        
    }

  
    
  
}
