package com.ipn.ws.operaciones;

import java.time.LocalDateTime;
import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
//Hace referencia a la interfaz que tiene anotados los metodos
@WebService (endpointInterface = "com.ipn.ws.operaciones.CalculadoraService")
public class CalculadoraServiceImpl implements CalculadoraService{

    @Override
    public String saludar(String nombre) {
        return "Hola mundo desde JAX WS: " + nombre + " Son las: " + LocalDateTime.now();
    }

    @Override
    public int sumar(int n1, int n2) {
        
        return n1+n2;
    }

    @Override
    public int restar(int n1, int n2) {
        
        return n1-n2;
    }

    @Override
    public int multiplicar(int n1, int n2) {
        
        return n1*n2;
    }
    
}
