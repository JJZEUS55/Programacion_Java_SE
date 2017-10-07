
package org.ipn.sistemaventas.service.impl;

import org.ipn.sistemaventas.dao.implementacion.ClienteDAOImpl;
import org.ipn.sistemaventas.model.ClienteDTO;
import org.ipn.sistemaventas.service.ClienteService;

public class ClienteServiceImpl implements ClienteService{

     ClienteDAOImpl clienteDao;
     
    @Override
    public void crearNuevoCliente(ClienteDTO clienteDTO) {
        
        clienteDao = new ClienteDAOImpl();
        clienteDao.crearNuevoCliente(clienteDTO);
        
    }

    @Override
    public void listarClientes() {
        clienteDao = new ClienteDAOImpl();
        clienteDao.listarClientes();
    }

    @Override
    public ClienteDTO buscarClienteporCodigo(int codigo) {
        clienteDao = new ClienteDAOImpl();
        return clienteDao.buscarClienteporCodigo(codigo);
    }

    @Override
    public void modificarCliente(ClienteDTO clienteDTO) {
        
        clienteDao = new ClienteDAOImpl();
        clienteDao.modificarCliente(clienteDTO);
        
    }

    @Override
    public void eliminarCliente(ClienteDTO clienteDTO) {
        
        clienteDao = new ClienteDAOImpl();
        clienteDao.eliminarCliente(clienteDTO);
        
    }
    
}
