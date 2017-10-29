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
public class Hospital {
    
    public String paciente;
    private String cama;
    protected String especialidades;
    String doctor;
    
    public Hospital(){
        this.paciente = "";
        this.doctor = "";
    }
    
  public Hospital(String paci, String doc){
        this.paciente = paci;
        this.doctor = doc;
    }
}
