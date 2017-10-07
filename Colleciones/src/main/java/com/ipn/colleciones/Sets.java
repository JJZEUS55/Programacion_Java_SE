/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.colleciones;

import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;
import sun.reflect.generics.tree.Tree;

/**
 *
 * @author Lety
 */
public class Sets {
    
    private static Logger LOG = Logger.getLogger(Sets.class.getName());
    
    public static void main(String[] args) {
        
        Set<Integer> numeroCuenta =  new TreeSet<Integer>();
        Boolean[] b = new Boolean[5];
        
        numeroCuenta.add(778899);
        numeroCuenta.add(665577);
        numeroCuenta.add(554433);
        numeroCuenta.add(665577);
        
        LOG.info("Set: : " + numeroCuenta);
    }
    
}
