package com.ipn.colleciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class Mapas {
    
    private static Logger LOG = Logger.getLogger(Mapas.class.getName());
    
    public static void main(String[] args) {

        /**
         * Mapa para guardar estudiantes con numero de boleta Key: Numero de
         * boleta Valor: Nombre del alumno
         */
        Map<Integer, String> estudiante = new HashMap<Integer, String>();
        
        estudiante.put(25, "Ramirez Edwin");
        estudiante.put(27, "Papita Edwin");
        estudiante.put(28, "Sucker Edwin");
        
        
        Set<Integer> numBoleta = estudiante.keySet();
        
        LOG.info("Estudiante " + estudiante);
        
        for (Integer integer : numBoleta) {
            LOG.info("Numero" + integer);
            
        }
    }
    
}
