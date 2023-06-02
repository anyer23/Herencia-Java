/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author monte
 */
public abstract class Edificio {
    protected double ancho;
    protected double alto;
    protected double largo;
    
    
    public abstract double calcularSuperficie();
     public abstract double calcularVolumen();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nTipo de Edificio ");
        sb.append("\nAncho=").append(ancho);
        sb.append("\nAlto=").append(alto);
        sb.append("\nLargo=").append(largo);
        
        return sb.toString();
    }

     
     
}
