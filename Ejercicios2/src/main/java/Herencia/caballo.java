/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Lety
 */
public class caballo extends Animal{

    @Override
    protected void comer(String alimento) {
        if(alimento.equals("Hierba")){
            System.out.println(nombre + "Comiendo: " + alimento);
        }
        else{
            System.out.println("NO SE PUEDE");
        }
    }

    @Override
    protected void dormir() {
        System.out.println("Durmiendo como caballo");
    }
    
}
