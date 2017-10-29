package org.ipn.escom.service;

import java.util.List;
import javax.ejb.Remote;
import org.ipn.escom.domain.Persona;

@Remote
//Remote visitas
public interface PersonaServiceRemote {

	public List<Persona> listarPersonas();
	
	public Persona encontrarPersonaPorId(Persona persona);
	
	public Persona econtrarPersonaPorEmail(Persona persona);

	public void registrarPersona(Persona persona);

	public void modificarPersona(Persona persona);

	public void eliminarPersona(Persona persona);

}
