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
public class Camisa {
    
    private String color;
    private String cuello;
    private int talla;
    private double precio;

    @Override
    public String toString() {
        return "Camisa{" + "color=" + color + ", cuello=" + cuello + ", talla=" + talla + ", precio=" + precio + '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        if(talla > 0){
            this.talla = talla;
        }
        else{
            System.out.println("No existen tallas negativas men :v");
        }
        
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio > 0){        
        this.precio = precio;
        }
        else{
            System.out.println("No se pueden poner precios negativos");
        }
    }
    
    
    
    
}
