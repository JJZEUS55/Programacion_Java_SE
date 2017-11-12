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
public class Director extends Manager {
    
    private double budget;

    public Director(int id, String nombre, String numeroSeguroSocial, double salario, String deptName, double  budget) {
        super(id, nombre, numeroSeguroSocial, salario, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }  
    
}
