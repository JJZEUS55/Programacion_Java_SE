package com.ipn.uso_hibernate.DAO;

import com.ipn.uso_hibernate.entity.PersonaDB;
import java.util.List;


public interface PersonaDAO {
    
    public void guardarPersona(PersonaDB persona);

    public List<PersonaDB> obtenerPersonas();
    
    public PersonaDB buscarPersonaID(int id);
    
    public PersonaDB buscarPersonaEmail(PersonaDB persona);
    
    public void modificarPersona(PersonaDB persona);
    
    public void eliminarPersona(PersonaDB persona);
}
