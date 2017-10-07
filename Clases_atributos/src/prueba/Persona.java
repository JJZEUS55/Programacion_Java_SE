/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author Lety
 */
public class Persona {    
    String nombre;
    String sexo;
    int edad;
    String [] sa  = new String[3];
    
    
    
    
    public void caminar(){
        System.out.println(nombre + " Esta caminando");
    }
    
    public void estudiar(){
        System.out.println(nombre + " Esta estudiando");
    }
    
    public void comer(String comida){
        System.out.println(nombre + " Esta comiendo " + comida);
    }
    
    public void pedircervesa(){
        if(edad >= 18){
            System.out.println(nombre + " Dar cerveza");
        }
        else{
            System.out.println(nombre + " No puedes Estas meco para tomar");
        }
    }
}

class Curso{
    public static void main(String [] args){
        Persona juan = new Persona();
        juan.nombre = "Juan Perez";
        juan.sexo = "M";
        juan.edad = 16;        
        juan.caminar();
        juan.estudiar();
        juan.pedircervesa();
        
        
        Persona bety = new Persona();
        bety.nombre = "Beatriz Rosales";
        bety.sexo = "F";
        bety.edad = 20;
        bety.caminar();
        bety.estudiar();   
        bety.comer("Sopita de pollo :v");
        bety.pedircervesa();
    }
}
