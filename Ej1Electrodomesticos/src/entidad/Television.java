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
public class Television extends Electrodomestico{
      private int pulgadas;
    private boolean sintonizadorTDT;

    public Television() {
    }

    public Television(int pulgadas, boolean sintonizadorTDT) {
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Television(int pulgadas, boolean sintonizadorTDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    
    public void crearTelevisor(){
        Scanner leer=new Scanner(System.in);
        
        crearElectrodomestico();
        System.out.println("Ingrese las pulgadas");
        this.pulgadas=leer.nextInt();
        System.out.println("Desea ingresar un sintonizador (True/False)");
        this.sintonizadorTDT=leer.nextBoolean();
//      precioFinal();
    }

    @Override
    public double precioFinal() {
     super.precioFinal(); 
        
        if (this.pulgadas>40) {
           this.precio*=1.3;
           
        }
        
        if (this.sintonizadorTDT==true) {
            this.precio+=500;
          
        }
        return this.precio;

        
    }


    @Override
    public String toString() {
       // return "Television "+ super.toString()+" pulgadas = "+pulgadas+" sintonizador = "+sintonizadorTDT; 
    
        StringBuffer sb=new StringBuffer();
        
      sb.append("\nTelevisor \nPrecio ").append(this.precio);
      sb.append("\nColor ").append(color);
      sb.append("\nPulgadas ").append(pulgadas);
      sb.append("\nConsumo energetico ").append(consumoEnergetico);
      sb.append("\nPeso ").append(peso);
      
      
      return sb.toString();
    }
}
