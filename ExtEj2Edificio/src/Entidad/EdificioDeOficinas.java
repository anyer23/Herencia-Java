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
public class EdificioDeOficinas extends Edificio {

    private int numOficinas;
    private int cantPersonas;
    private int numPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numOficinas, int cantPersonas, int numPisos) {
        this.numOficinas = numOficinas;
        this.cantPersonas = cantPersonas;
        this.numPisos = numPisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    
    Scanner leer = new Scanner(System.in);

    @Override
    public double calcularSuperficie() {
        
        System.out.println("Ingrese el Ancho de Edificio");
        this.ancho=leer.nextDouble();
        System.out.println("Ingrese la Largo de Edificio ");
        this.largo=leer.nextDouble();
        return largo * ancho;
    }

    

    @Override
    public double calcularVolumen() {
        System.out.println("Ingrese el alto de la oficina");
        this.alto = leer.nextDouble();
        System.out.println("El volumen es ");
        return largo * ancho * alto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Edificio De Oficinas{");
        sb.append("\n Numero de Oficinas ").append(numOficinas);
        sb.append("\n Cantidad de Personas ").append(cantPersonas);
        sb.append("\n Numero de Pisos ").append(numPisos);
      
        return sb.toString();
    }

}
