
package com.ipn.ciclos_date;

import java.util.logging.Logger;


public class Arrays1 {
    
    private static final Logger LOG = Logger.getLogger(Arrays1.class.getName());
    
    public static void main(String[] args) {
        
        //LOG.info("Hola desde logger");
        
        
       // Arrays1.arregloAnonimo(new int[]{1,2,3,4,5});
        
        String[] terrorista = new String[]{"Bin laden", "Asura", "IXIPIXi"};
        
        
        for(String element:terrorista){
            LOG.info("TERRORISTA : " + element);
        }
    }
    
    /**
     * Este metodo funciona para mostrar arreglo //ARREGLO EXPLICITO O DECLARACION EXPLICITA
     */ 
    public static void mostrarArreglo(){        
        String [] nombre = new String[5];        
        nombre[0] = "Jorge";
        nombre[1] = "Jorge1";
        nombre[2] = "Jorge2";
        nombre[3] = "Jorge3";
        
         for(String element:nombre){
            if("Jorge".equals(element)){
                LOG.warning("Eres el jorge original " + element);
            }
        }        
    }
    
    /**
     * //DECLARAR ARREGLOS DE MANERA ANONIMA
     */
    
    public static void arregloAnonimo(int[] arreglo){
        
        for(int element:arreglo){
            
                LOG.warning("Valor" + element);
        }     
    }
}

