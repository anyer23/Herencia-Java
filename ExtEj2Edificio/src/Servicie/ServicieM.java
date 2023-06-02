/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicie;

import Entidad.EdificioDeOficinas;
import java.util.Scanner;

/**
 *
 * @author monte
 */
public class ServicieM  {
    Scanner leer=new Scanner(System.in);
  public  EdificioDeOficinas eof=new EdificioDeOficinas();
    
    public void crearEdificio(){
        System.out.println("Ingrese la cantidad de oficinas");
        eof.setNumOficinas(leer.nextInt());
        eof.setCantPersonas(eof.getNumOficinas());
        
        System.out.println("Ingrese la cantidad de lersonas /oficina");
        eof.setCantPersonas(leer.nextInt());
        
        System.out.println(eof.calcularSuperficie()+ " m2");
        System.out.println(eof.calcularVolumen()+" m3");
    }

    public void cantPersonas(){
        System.out.println("La cantidad de personas que entran el un edificio son "+eof.getCantPersonas());
        System.out.println("En todo el edificio entran "+(eof.getCantPersonas()*eof.getNumOficinas()) + " personas");
    }

}
