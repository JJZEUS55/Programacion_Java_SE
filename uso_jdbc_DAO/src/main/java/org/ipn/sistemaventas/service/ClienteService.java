
package org.ipn.sistemaventas.service;

import org.ipn.sistemaventas.model.ClienteDTO;


public interface ClienteService {
 
    public void crearNuevoCliente(ClienteDTO clienteDTO);
    
    public void listarClientes();
    
    public ClienteDTO buscarClienteporCodigo(int codigo);
    
    public void modificarCliente(ClienteDTO clienteDTO);
    
    public void eliminarCliente(ClienteDTO clienteDTO);
    
}
