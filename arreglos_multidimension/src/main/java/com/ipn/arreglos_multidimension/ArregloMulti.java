package com.ipn.arreglos_multidimension;

import java.util.logging.Logger;

public class ArregloMulti {
    
    private static Logger LOG = Logger.getLogger(ArregloMulti.class.getName());
    

    public static void main(String[] args) {
        String[][] asignaciones = new String[11][10];
        
        asignaciones[0][0] = "Nombre 1";
        asignaciones[0][1] = "Nombre 2";
        
        asignaciones[3][1] = "Nombre 3";
        asignaciones[3][2] = "Nombre 4";
        
        asignaciones[5][0] = "Nombre 5";
        asignaciones[5][1] = "Nombre 6";
           
        for(int i = 0; i<asignaciones.length; i++){
            for(int j = 0; j<asignaciones[0].length; j++){
                if(asignaciones[i][j] != null){
                    LOG.info("X: " + i + "\nY: " + j + "\nValor = " + asignaciones[i][j]);
                }
            } 
        }
    }
    
    
}
