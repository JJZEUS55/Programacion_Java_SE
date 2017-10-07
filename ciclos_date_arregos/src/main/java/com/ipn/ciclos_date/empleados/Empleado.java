package com.ipn.ciclos_date.empleados;

import java.util.logging.Logger;


public abstract class Empleado {
    
    private static Logger LOG = Logger.getLogger(Empleado.class.getName());
    
    private String nombre;
    private double sueldo;
    private int edad;
    private char sexo;
    public static int numEmpleado;
    
    {
        numEmpleado++;
    }

    public Empleado() {
        
    }
    
    public Empleado(String nombre, double sueldo, int edad, char sexo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    public Empleado(String nombre, double sueldo, int edad) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public static int getNumEmpleado() {
        return numEmpleado;
    }

    public static void setNumEmpleado(int numEmpleado) {
        Empleado.numEmpleado = numEmpleado;
        
    }
    
    public void imprimirInformacion(){
        LOG.info("Nombre: " + nombre);
        LOG.info("Sueldo: " + sueldo);
        LOG.info("Edad: " + edad);
        LOG.info("Sexo: " + sexo);
        
    }
    
    
    public abstract double generarIngresos();
    
    
    
    
    
    
}
