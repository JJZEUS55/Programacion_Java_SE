
import com.ipn.escom.Operaciones;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lety
 */
public class Main {

    public static void main(String[] args) {
        
        Operaciones op = new Operaciones();
        
        int r1 = op.multiplicar(5, 2);       
        
        int r2 = op.sumar(4, 2);
        
        
        System.out.println("Multiplicacion = " + r1);
        System.out.println("Suma = " + r2);
    }
}
