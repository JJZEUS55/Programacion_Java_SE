package com.dto.empleado;

import java.text.NumberFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lety
 */
public class Empleado {

    private int id;
    private String nombre;
    private String numeroSeguroSocial;
    private double salario;
   
    public Empleado(int id, String nombre, String numeroSeguroSocial, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.salario = salario;
    }

  

    public void setNombre(String nombre) {
        if(nombre != null)
            this.nombre = nombre;
        else
            System.out.println("No ha agregado un nuevo nombre");
    }
    
    public void incrementarSalario(double incremento){
        if(incremento < 0)
            System.out.println("No se puede hacer con numeros negativos");    
       
        else
            this.salario += incremento;   
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        String salario = "" + NumberFormat.getCurrencyInstance().format((double) getSalario());
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", numeroSeguroSocial=" + numeroSeguroSocial + ", salario=" + salario + '}';
    }
    
    
    
    
}
