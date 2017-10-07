
package org.ipn.sistemaventas.dao;

import java.sql.Connection;
import java.sql.DriverManager;



public class SistemaVentasConnection {
  
    private Connection con;
    
    public Connection getConeccion(){
        return con;        
    }
    
    public void Conectar(){        
        String url = "jdbc:derby://localhost:1527/SistemaVentas";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String usuario = "root";
        String password = "1234";        
 
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, usuario, password);
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
