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
public abstract class Pedido {
    protected double importeSinIva;
    protected double importeIva;
    protected double importeConIva;
    
    protected abstract void CalculaIVA();
    
    public void calculaPrecioConIva(){
        this.CalculaIVA();
        importeConIva = importeSinIva + importeIva;
        
        
    }
    
    public void setImporteSinIva(double importeSinIva){
        this.importeSinIva = importeSinIva;
    }

    @Override
    public String toString() {
        return "Pedido{" + "importeSinIva=" + importeSinIva + ", importeIva=" + importeIva + ", importeConIva=" + importeConIva + '}';
    }
    
}
