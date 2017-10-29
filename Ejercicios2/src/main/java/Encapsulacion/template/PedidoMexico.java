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
public class PedidoMexico extends Pedido{
    
  

    @Override
    protected void CalculaIVA() {
        importeIva = importeSinIva * .20;
    }
    
}
