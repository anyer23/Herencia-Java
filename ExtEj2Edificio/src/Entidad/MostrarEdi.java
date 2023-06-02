/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Servicie.ServicieM;
import java.util.ArrayList;

/**
 *
 * @author monte
 */
public class MostrarEdi {
    
    public void moatrarDa(){
    ArrayList <Edificio> edificios=new ArrayList<>();
    ///creacion de polideportivos
    Polideportivo mp1=new Polideportivo("Adan", true);
    Polideportivo mp2=new Polideportivo("Ana", false);
       
    System.out.println("Datos del Poli0");
        System.out.println(mp1.calcularSuperficie()+" m2");
        System.out.println(mp1.calcularVolumen()+" m3");
        
        System.out.println("Datos del Poli02");
        System.out.println(mp2.calcularSuperficie()+" m2");
        System.out.println(mp2.calcularVolumen()+" m3");
        
       //crear edificio de oficinas
        System.out.println("Datos de Edificio1");
        ServicieM mServ=new ServicieM();
       

        mServ.crearEdificio();
        edificios.add(mServ.eof);
        mServ.cantPersonas();
        
         //crear edificio de oficinas
        System.out.println("Datos de Edificio2");
       
        mServ.crearEdificio();
        edificios.add(mServ.eof);
        mServ.cantPersonas();
        
        edificios.add(mp2);
        edificios.add(mp2);
        
        for (Edificio edificio : edificios) {
            System.out.println(edificio);
        }
    }
    
}
