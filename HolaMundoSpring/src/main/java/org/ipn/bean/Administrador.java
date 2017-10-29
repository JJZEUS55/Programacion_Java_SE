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
public class Administrador {
    
    private int idAdmin;
    private String nombre;

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Administrador(int idAdmin, String nombre) {
        this.idAdmin = idAdmin;
        this.nombre = nombre;
    }
    
    public Administrador(){
        
    }

    @Override
    public String toString() {
        return "Administrador{" + "idAdmin=" + idAdmin + ", nombre=" + nombre + '}';
    }
    
    
    
}
