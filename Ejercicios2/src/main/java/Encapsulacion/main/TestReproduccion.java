/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulacion.main;

import Encapsulacion.Persona;

/**
 *
 * @author Lety
 */
public class TestReproduccion {
    
    public static void main(String[] args) {
        Persona juan = new Persona();
        
        Persona karolina = new Persona();
        
        Persona pepe = new Persona();
        
        juan.setNombre("Juanito");
        juan.setSexo("H");
        juan.setPadre(juan);
        
        
        
        karolina.setNombre("Karolina");
        karolina.setSexo("M");
        karolina.setMadre(karolina);
        
        
        
        
        Persona suhijo = juan.reproducirse(karolina);
        
        System.out.println(suhijo.getNombre());
        
        
        
        
        
    }
    
}
