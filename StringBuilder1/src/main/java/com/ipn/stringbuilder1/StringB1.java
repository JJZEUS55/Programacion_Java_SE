package com.ipn.stringbuilder1;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;


public class StringB1 {
    
    public static void main(String[] args) {
        
        StringB1.stringAndStringBuilder();
        
        //StringB1.StringBuilderprueba();
        
    }
    
    
    
    
    public static void stringAndStringBuilder(){
        
        String nombres = "Eduardo, ";
//        
//        nombres = nombres + ", Lorena";
//        nombres = nombres + ", Adrian, " + ", Verenice, ";
        
        Instant iniString = Instant.now();
        for (int i = 0; i < 1_000_000; i++) {            
             nombres = nombres + ", NO MMS D: ";
        }    
        Instant finString = Instant.now();
        
        
        System.out.println("Duracion de string " + Duration.between(iniString, finString));
            
    }
    
      public static void StringBuilderprueba(){
        
          
        StringBuilder nombres = new StringBuilder("Eduardo, ");
//        
//        nombres = nombres + ", Lorena";
//        nombres = nombres + ", Adrian, " + ", Verenice, ";
        
        Instant iniString = Instant.now();
        for (int i = 0; i < 1_000_000; i++) {            
             nombres.append(", NO MMS D: ");
        }    
        Instant finString = Instant.now();
        
        
        System.out.println("Duracion de string " + Duration.between(iniString, finString));
            
    }
    
}
