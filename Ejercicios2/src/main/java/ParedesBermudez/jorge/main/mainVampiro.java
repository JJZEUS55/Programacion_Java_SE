/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParedesBermudez.jorge.main;
import ParedesBermudez.Vampiro;

/**
 *
 * @author Lety
 */
public class mainVampiro {
    
    public static void main(String[] args) {
        Vampiro vas = new Vampiro();
        
        vas.nombre = "Dracula";
        vas.tanqueSangre = 0;
        vas.rango = "Novato";
        vas.genteComida = 0;
        
        vas.getTanque();
        vas.chuparSangre();
        vas.subirRango(15);
        
        
        
    }
}
