package com.ipn.uso_hibernate.DAO;

import com.ipn.uso_hibernate.entity.PersonaDB;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PersonaDAOImplement implements PersonaDAO{
    
    //Llenar Base de datos
    private EntityManager manager;    
    //
    private EntityManagerFactory emf;
    
    {
        emf = Persistence.createEntityManagerFactory("PersonaUP");
        manager = emf.createEntityManager();
    }
            
            

    @Override
    public void guardarPersona(PersonaDB persona) {        
        manager.getTransaction().begin();
        manager.persist(persona);
        manager.getTransaction().commit();
        
//        manager.getTransaction().rollback();
    }

    @Override
    public List<PersonaDB> obtenerPersonas() {
        return manager.createQuery("FROM PersonaDB").getResultList();
    }

    @Override
    public PersonaDB buscarPersonaID(int id) {
        
        return manager.find(PersonaDB.class, id);
    }

    @Override
    public PersonaDB buscarPersonaEmail(PersonaDB persona) {
        Query query = manager.createQuery("FROM PersonaDB p where p.correo= :correo");
        query.setParameter("correo", persona.getCorreo());
        return (PersonaDB) query.getSingleResult();
    }

    @Override
    public void modificarPersona(PersonaDB persona) {    
        
        //manager.getTransaction().begin();
        manager.merge(persona);
        manager.getTransaction().commit();
    }

    @Override
    public void eliminarPersona(PersonaDB persona) {    
        manager.getTransaction().begin();
        manager.remove(persona);
        manager.getTransaction().commit();
    }
    
}
