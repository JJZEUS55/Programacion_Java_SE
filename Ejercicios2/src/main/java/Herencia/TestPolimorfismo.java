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
public class TestPolimorfismo {
    
    public static void main(String[] args) {
        
        Animal animalL = new leon();
        Animal animalC = new caballo();
    }
    
    public String adoptarMascota(Animal animal){
        
        String instrucciones = "Instrucciones para: ";
        
        if(animal instanceof leon){
            instrucciones += " come mucha carne tambien humanos cuidao!!!";
        }
        
        if(animal instanceof caballo){
            instrucciones += " come cebada, peinalo y seras feliz :v";
            
        }
        
        if(animal instanceof Perro){
            instrucciones += " bañarlo, peinarlo y tenerlo gordito";
            
        }
        
        return instrucciones;
    }
    
    
    
}
