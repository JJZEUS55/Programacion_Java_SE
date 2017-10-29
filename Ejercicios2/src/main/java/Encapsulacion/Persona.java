/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulacion;

/**
 *
 * @author Lety
 */
public class Persona {
    
    private String nombre;
    private String sexo;
    
    Persona madre;
    Persona padre;

    public String getNombre() {
        return nombre;
    }
    
    public boolean matchPareja(Persona p1, Persona p2){
        System.out.println("==========TRATANDO DE REPRODUCIRSE=============");
        if(p1.sexo == p2.sexo){
            System.out.println("Lo sentimos Diosito no acepta hijos de gays :v");
            return false;
        }
        else if(p1.padre != p1 || p2.madre != p2){
            System.out.println("Baia Baia Parece que alguien es hijo del lechero");
            return false;
        }
        else{
            return true;
        }
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Persona getMadre() {
        return madre;
    }

    public void setMadre(Persona madre) {
        this.madre = madre;
    }

    public Persona getPadre() {
        return padre;
    }

    public void setPadre(Persona padre) {
        this.padre = padre;
    }
    
    public Persona reproducirse(Persona p1){
        Persona hijo = null;
        boolean procede = matchPareja(this, p1);
        System.out.println("==========REPRODUCIENDOSE================");
        if(procede){
            System.out.println("Su hijo ha sido creado");
//            hijo.nombre = "Juanito"; 
//            hijo.sexo = "H";
//            hijo.padre = this;
//            hijo.madre = p1;
        return hijo;
        }
        else{
            System.out.println("No se pudo crear hijo");
            return null;
        }      
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sexo=" + sexo + '}';
    }
}
