package com.ipn.colleciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;


public class Listas {
    
    private static Logger LOG = Logger.getLogger(Listas.class.getName());
    
    public static void main(String[] args) {
        
        List<String> superHeroes = new ArrayList<String>();
        
        //List test = new LinkedList();
        
        superHeroes.add("Hombre Araña");
        superHeroes.add("Iron Man");
        superHeroes.add("Wesker");
        
        LOG.info("ES: " + superHeroes);
        LOG.info("Tamanio : " + superHeroes.size());
        LOG.info("Posicion 1" + superHeroes.get(1));
        
        superHeroes.remove(2);
        
        superHeroes.set(1, "LA ARANA");
        superHeroes.add(2, "GOKU");
        
        
        Object[] arreglo = superHeroes.toArray();
        
        LOG.info("Desordenada: " + superHeroes);
        
        Collections.sort(superHeroes);
        
        LOG.info("Ordenada: " + superHeroes);
        
        for (String superHeroe : superHeroes) {
            System.out.println("Heroe " + superHeroe);
            
        }
        
        
        
        
    }   
}
