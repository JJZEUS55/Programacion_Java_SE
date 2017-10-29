/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.escom;

/**
 *
 * @author Lety
 */
public class Estudiante {
    public int numCuenta;
    public String nombre;
    public String apellidos;
    public String direccion;
    public int telCel;
    
    
    public void inscribir(Estudiante estudiante){
        System.out.println("Inscribieno " + estudiante.nombre );
        
        
    }
    
    public void DardeBaja(int numCuenta){
        System.out.println("Estudiante con numero de cuenta " + numCuenta + "Dado de baja");
        
    }
    
    public Estudiante buscarEstudiante(int numCuenta){
        
        System.out.println("Buscando estudiante " + numCuenta);
        return new Estudiante();
    }
    
    public void modificarEstudiante(Estudiante estudiante){
        
        System.out.println("Modificando estudiante: " + estudiante.nombre);
        
    }
    
    
    public void mostrarDatos(){       
        
        System.out.println("================ Informacion Estudiante ================");
        System.out.println("Numero de cuenta: " + numCuenta);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Direccion: " + direccion);
        System.out.println("Celular: " + telCel);
    }
    
    
}
