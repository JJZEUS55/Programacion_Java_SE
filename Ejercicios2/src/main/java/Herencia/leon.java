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
public class leon extends Animal{

    @Override
    protected void comer(String alimento) {
        if(alimento.equals("Carne")){
            System.out.println(nombre + "Comiendo: " +  alimento);
            
        }
    }

    @Override
    protected void dormir() {
        System.out.println("Durmiendo como el fukin rey ");
    }
    
    
}
