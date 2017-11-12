/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

/**
 *
 * @author Lety
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account a = new Checking();
        Account b = new Saving();
        //a.withdraw();
        //boolean b = a instanceof Checking;
        // System.out.println("val " +  b);
        
        Saving c = (Saving)a;
    }
    
}
