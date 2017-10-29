/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulacion.template;

/**
 *
 * @author Lety
 */
public class Usuario {
    public static void main(String[] args) {
        
        Pedido mx =  new PedidoMexico();        
        mx.setImporteSinIva(1_000);
        mx.calculaPrecioConIva();
        System.out.println(mx);
    }
    
}
