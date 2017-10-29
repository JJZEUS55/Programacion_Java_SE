package org.ipn.escom.service;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import org.ipn.escom.domain.Persona;
import org.ipn.escom.dao.PersonaDao;

@Stateless
//Stateless sirve para guarda informacion y borrarla rapidamente, algo asi como una variable rapida
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService {
	
	@Resource
	private SessionContext contexto;
	
	@EJB
	private PersonaDao personaDao;

        @Override
	public List<Persona> listarPersonas() {
		return personaDao.findAllPersonas();
	}

        @Override
	public Persona encontrarPersonaPorId(Persona persona) {
		return personaDao.findPersonaById(persona);
	}

        @Override
	public Persona econtrarPersonaPorEmail(Persona persona) {
		return personaDao.findPersonaByEmail(persona);
	}

        @Override
	public void registrarPersona(Persona persona) {
		personaDao.insertPersona(persona);
	}
        

        @Override
	public void modificarPersona(Persona persona) {
		try{
			personaDao.updatePersona(persona);
		}catch(Throwable t){
			contexto.setRollbackOnly();
		}	
	}

        @Override
	public void eliminarPersona(Persona persona) {
		personaDao.deletePersona(persona);
	}

}
