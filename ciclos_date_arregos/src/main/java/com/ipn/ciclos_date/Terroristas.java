package com.ipn.ciclos_date;

import java.util.logging.Logger;


public class Terroristas {
    
    private static Logger LOG = Logger.getLogger(Terroristas.class.getName());
    
    public static void main(String[] args) {
        
        String[] terroristas = {"OBAMA", "ABDUL", "SADAM", "BIN LADEN"}; 
        String[] personas = {"Juan", "Pepe", "Luis"};
        
        for(String persona:personas){
            LOG.info("Persona de bien : " + persona);
            
            for(String terrorista:terroristas){
//                LOG.info("Persona del devil D: : " + terrorista);
                  if(persona.equals(terrorista)){
                      LOG.warning("PELIGROSO ES UN TERRORISTA :V :" + persona);
                  }
            }
        }
    }
}
