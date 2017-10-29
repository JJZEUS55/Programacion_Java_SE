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
public abstract class Animal {
    
    protected String nombre;
    protected String especie;
    
    
    
    protected abstract void comer(String alimento);
    
   protected abstract void dormir();
}
