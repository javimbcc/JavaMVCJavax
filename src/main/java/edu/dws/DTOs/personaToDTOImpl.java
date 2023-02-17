package edu.dws.DTOs;

import org.springframework.context.annotation.ComponentScan;

import edu.dws.dao.Persona;

@ComponentScan
public class personaToDTOImpl  implements DtosService{

	@Override
	public PersonaDTO personaToDTO(Persona p) {
		PersonaDTO pers = new PersonaDTO(p.getNombrePersona(),
				p.getApellidosPersona(), p.getEdadPersona());
		
		return pers;
	}

}
