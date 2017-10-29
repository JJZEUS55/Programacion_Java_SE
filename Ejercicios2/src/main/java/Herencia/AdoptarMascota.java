/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Lety
 */
public class AdoptarMascota {
    
    public static void main(String[] args) {
        TestPolimorfismo mascotas = new TestPolimorfismo();
        
        String instrucciones = mascotas.adoptarMascota(new Perro());
        
        System.out.println(instrucciones);
    }
    
 
}
