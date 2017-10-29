/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulacion.main;

import Encapsulacion.Hospital;

/**
 *
 * @author Lety
 */
public class MainHospital extends Hospital{
    
    String nombreDos;
    
    public static void main(String[] args) {
        
        Hospital h = new Hospital();
        MainHospital m2 = new MainHospital();
        
        
        
        h.paciente = "Juan";
        
    }
    
}
