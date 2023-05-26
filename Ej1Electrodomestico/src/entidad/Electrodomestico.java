/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author monte
 */
public class Electrodomestico {
    protected int precio;
    protected String color;
    protected char consumoEnergetico;
    protected  int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
    
    private void comprobarConsumoEnergetico(char letra){
        letra=Character.toUpperCase(letra);//convertir letra a mayuscula
                
            //verificar letra
            if (letra>='A' && letra<'F') {
             this.consumoEnergetico=letra;
        }else{
                this.consumoEnergetico= 'F';
            }
        
        
    }
    
    private String comprobarColor(String color){
        color=color.toLowerCase().trim();//trim elimina los espacios
        
        
        if ((color.equals("blanco")) ||( color.equals("negro"))|| (color.equals("rojo")) 
             ||  ( color.equals("azul")) ||  ( color.equals("gris"))) {
            return this.color;
        } else {
            return this.color="Blanco";
        }
    }
    
    
 
    public void crearElectrodomestico(){
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese el color");
        this.color=leer.nextLine();
        comprobarColor(color);
        System.out.println("Ingrese el consumo energetico");
        this.consumoEnergetico=leer.nextLine().toLowerCase().charAt(0);
        comprobarConsumoEnergetico(consumoEnergetico);
        System.out.println("Ingrese el peso");
        this.peso=leer.nextInt();
        this.precio=1000;
        
        
    }
    
    public void precioFinal(){
        switch (consumoEnergetico) {
            case 'A':
                this.precio+=1000;
                break;
             case 'B':
                this.precio+=800;
                break;
              case 'C':
                this.precio+=600;
                break;
               case 'D':
                this.precio+=500;
                break;
             case 'E':
                this.precio+=300;
                break;
             case 'F':
                this.precio+=100;
                break;
             
        }
        
        if (this.peso>=1 && this.peso<=19) {
            this.precio+=100;
        }
        
         if (this.peso>=20 && this.peso<=49) {
            this.precio+=500;
        }
          if (this.peso>=50 && this.peso<=79) {
            this.precio+=800;
        }
           if (this.peso>=80) {
            this.precio+=1000;
        }
    }

    @Override
    public String toString() {
       StringBuffer sb=new StringBuffer();
        
      sb.append("\nTelevisor \nPrecio ").append(precio);
      sb.append("\nColor ").append(color);
      sb.append("Consumo energetico ").append(consumoEnergetico);
      sb.append("Peso ").append(precio);
      
      
      return sb.toString();
    }
    
    
}

