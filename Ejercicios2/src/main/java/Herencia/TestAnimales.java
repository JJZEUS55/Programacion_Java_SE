/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import Herencia.caballo;

/**
 *
 * @author Lety
 */
public class TestAnimales {
    public static void main(String[] args) {
        
        caballo spirit = new caballo();
        spirit.nombre = "Spirit";
        spirit.especie = "Mustang";
        spirit.comer("cebra");
        
        
        
        leon simba = new leon();
        simba.nombre = "Mufasa";
        simba.especie = "Leon africano";
        simba.comer("Gusanos");
        
        
    }
    
}
