package org.ipn.sistemaventas.dao;

import org.ipn.sistemaventas.model.ClienteDTO;

public interface ClienteDAO {
    
    public void crearNuevoCliente(ClienteDTO clientrDTO);
    
    public void listarClientes();
    
    public ClienteDTO buscarClienteporCodigo(int codigo);
    
    public void modificarCliente(ClienteDTO clienteDTO);
    
    public void eliminarCliente(ClienteDTO clienteDTO);
}
