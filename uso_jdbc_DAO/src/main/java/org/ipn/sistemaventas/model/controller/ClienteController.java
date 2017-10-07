package org.ipn.sistemaventas.model.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.ipn.sistemaventas.model.ClienteDTO;
import org.ipn.sistemaventas.service.ClienteService;
import org.ipn.sistemaventas.service.impl.ClienteServiceImpl;

//Este sirve para que puedan interactuar entre el JSF y la clase, manejar datos con la vista
@ManagedBean(name = "miCliente")
//Este sirve para obtener los parametros del JSF y utilizarlos en la clase, de bajo alcance se obtiene y se destruye, periodo de vida de las variables en nuestra clase
@RequestScoped

public class ClienteController {
    
    private ClienteService clienteService;
    
    private ClienteDTO cliente;
    
    public ClienteController(){
        cliente = new ClienteDTO();
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }
    
    public void guardarCliente(){        
        
        clienteService = new ClienteServiceImpl();
        clienteService.crearNuevoCliente(cliente);
        
        System.out.println("========Guardando Cliente============");
        System.out.println(cliente);
    }
        
}
