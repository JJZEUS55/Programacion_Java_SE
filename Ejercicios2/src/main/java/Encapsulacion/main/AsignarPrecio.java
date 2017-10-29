/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulacion.main;

import Encapsulacion.Camisa;

/**
 *
 * @author Lety
 */
public class AsignarPrecio {
    
    public static void main(String[] args) {
        Camisa camisa = new Camisa();
        camisa.setPrecio(100);
        camisa.setTalla(20);
        camisa.setColor("ROJO");
        camisa.setCuello("V");
        
        
        System.out.println(camisa);
        
    }
}
