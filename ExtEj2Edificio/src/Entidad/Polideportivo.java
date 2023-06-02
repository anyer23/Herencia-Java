/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author monte
 */
public class Polideportivo extends Edificio {

    private String nombre;
    private boolean techado;

    public Polideportivo() {
    }

    
    public Polideportivo(String nombre, boolean techado) {
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    
    Scanner leer=new Scanner(System.in);
    @Override
    public double calcularSuperficie() {
          System.out.print("Ingrese la dimension ANCHO de Polideportivo: ");
        this.ancho = leer.nextDouble();
        System.out.print("Ingrese la dimension LARGO de Polideportivo: ");
        this.largo = leer.nextDouble();
        System.out.print("La superficie es: ");
        return ancho * largo;
    }

    @Override
    public double calcularVolumen() {
        if (techado) {
            return ancho * largo * alto;
        }
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nPolideportivo ");
        sb.append("\nnombre=").append(nombre);
        sb.append(" \ntechado=").append(techado);
        sb.append("\nleer=").append(leer);
        
        return sb.toString();
    }

}
