package com.test;

import com.dto.empleado.Admin;
import com.dto.empleado.Director;
import com.dto.empleado.Empleado;
import com.dto.empleado.Engineer;
import com.dto.empleado.Manager;
import java.lang.Math;
import static java.lang.Math.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lety
 */
public class Test {
   static int i;
    
    {
        i=1;
    }
    
    {i=2;}
    
     static {i=3;}
    
    public static void imprime(){
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {

        Empleado ingeniero = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        
        Empleado gerente = new Manager(207, "Barbara Jonhnson", "054-12-2367", 109_501.36, "US Marketing");
        
        Empleado administrador = new Admin(12, "Susan Wheeler", "108-23-6509", 75_002.34);
        
        Empleado director = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing", 1_000_000.00);
        
        
        
        ingeniero.printEmployee();
        gerente.printEmployee();
        administrador.printEmployee();
        director.printEmployee();
               
        ingeniero.incrementarSalario(200);
        ingeniero.setNombre("Pablito picasa");
        ingeniero.printEmployee();
        
        ingeniero.incrementarSalario(-200);
        ingeniero.setNombre(null); 
        
        System.out.println("" +  ingeniero.hashCode());
        Test t = new Test();
        t.imprime();
        
        imprime();
        
       // System.out.println("numero " + i);
        
    }
}
