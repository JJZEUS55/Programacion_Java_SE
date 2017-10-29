/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ipn.bean;

/**
 *
 * @author Lety
 */
public class Direccion {
    
    private String calle;
    private String cp;

    public Direccion() {
    }

    public Direccion(String calle, String cp) {
        this.calle = calle;
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", cp=" + cp + '}';
    }
    
    
    
    
    
    
    
}
