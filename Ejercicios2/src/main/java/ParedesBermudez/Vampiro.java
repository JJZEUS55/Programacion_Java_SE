/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParedesBermudez;

/**
 *
 * @author Lety
 */
public class Vampiro {
    public String nombre;
    public String rango;
    public float tanqueSangre;
    public int genteComida;
    
    
    public float getTanque(){
        System.out.println("Su tanque de sangre esta en: " + tanqueSangre);
        if(tanqueSangre == 0){
            chuparSangre();            
        }
        else{
            
        }        
        return tanqueSangre;
    }
    
    
    public void chuparSangre(){
        System.out.println("===========Chupando sangre===========");
        tanqueSangre += 50;        
        System.out.println("Su tanque de sangre esta al " + tanqueSangre);  
        
        if(tanqueSangre<100){
            System.out.println("Le falta " + (100 - tanqueSangre) + "Para llenar tanque");
            System.out.println("coma mas gente");
        }
        else{
            System.out.println("Ya estas LLENO");
        }         
    }
    
    public void subirRango(int comida){
        if(comida>1 && comida<10){
            System.out.println("Subiste de rango :)");
            rango = "Cazador";
            System.out.println("Ya eres un " + rango);
        }
        else if (comida>10 && comida<20){
            System.out.println("Subiste de rango :)");
            rango = "Profesional";
            System.out.println("Ya eres un " + rango);
        }   
        
        else{
            System.out.println("Ya no hay mas rangos :(");
        }      
        
    }
    
    
    
}
