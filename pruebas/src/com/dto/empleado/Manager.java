/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dto.empleado;

/**
 *
 * @author Lety
 */
public class Manager extends Empleado{
    
    private String deptName;

    public Manager(int id, String nombre, String numeroSeguroSocial, double salario, String deptName) {
        super(id, nombre, numeroSeguroSocial, salario);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
    
    
    
}
