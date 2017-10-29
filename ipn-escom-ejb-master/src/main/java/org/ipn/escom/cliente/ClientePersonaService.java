package org.ipn.escom.cliente;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.ipn.escom.domain.Persona;
import org.ipn.escom.service.PersonaServiceRemote;


public class ClientePersonaService {

	public static void main(String[] args) {

		try {
			System.out.println("Iniciando llamada al EJB desde el cliente\n");
			Context jndi = new InitialContext();

			PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/ipn-ejb/PersonaServiceImpl!org.ipn.escom.service.PersonaServiceRemote");

			//PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/ipn-web/PersonaServiceImpl!org.ipn.escom.service.PersonaServiceRemote");
                         Persona bety = new Persona("Eduardo", "Castillo", "Mendoza", "e@gmail.com", "55445544");

                        personaService.registrarPersona(bety);
                        
			List<Persona> personas = personaService.listarPersonas();

			for (Persona persona : personas) {
				System.out.println(persona);
			}
			System.out.println("\nFin llamada al EJB desde el cliente");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
