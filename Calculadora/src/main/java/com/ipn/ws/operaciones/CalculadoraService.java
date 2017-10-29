package com.ipn.ws.operaciones;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CalculadoraService {
    
    @WebMethod
    public String saludar(String nombre);
    
    @WebMethod
    public int sumar(int n1, int n2);

    @WebMethod
    public int restar(int n1, int n2);

    @WebMethod
    public int multiplicar(int n1, int n2);
    
}
