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
public class Admin {
    
    private Integer idAdmin;
    private String nombre;
    private String apellidos;
    private String hobby;

    public Admin() {
    }

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Admin(Integer idAdmin, String nombre, String apellidos, String hobby) {
        this.idAdmin = idAdmin;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.hobby = hobby;
    }
    
}
