package org.ipn.sistemaventas.dao.implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import org.ipn.sistemaventas.dao.ClienteDAO;
import org.ipn.sistemaventas.dao.SistemaVentasConnection;
import org.ipn.sistemaventas.model.ClienteDTO;

public class ClienteDAOImpl extends SistemaVentasConnection implements ClienteDAO{

    @Override
    public void crearNuevoCliente(ClienteDTO clienteDTO) {
        
        try {
            this.Conectar();
            
            String sqlInsert = "INSERT INTO cliente (codigo, nombre, apellidos, pais, sexo) VALUES (?, ?, ?, ?, ?)";            
            PreparedStatement st = this.getConeccion().prepareStatement(sqlInsert);
            
            st.setInt(1, clienteDTO.getCodigo());
            st.setString(2, clienteDTO.getNombre());
            st.setString(3, clienteDTO.getApellidos());
            st.setString(4, clienteDTO.getPais());
            st.setString(5, clienteDTO.getSexo());
            
            st.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }

    @Override
    public void listarClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClienteDTO buscarClienteporCodigo(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarCliente(ClienteDTO clienteDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarCliente(ClienteDTO clienteDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
