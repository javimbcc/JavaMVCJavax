package edu.dws.DTOs;

import org.springframework.context.annotation.ComponentScan;

import edu.dws.dao.Persona;

@ComponentScan
public class PersonaDTOaDaoImpl implements aDatoService{

	@Override
	public Persona personaToDAO(PersonaDTO p) {
		Persona per = new Persona();
		if (p !=null) {
			//per.setMdUuid(p.getMdUuid());
			//per.setMdDate(p.getMdDate());
			//per.setIdPersona(p.getIdPersona());
			per.setNombrePersona(p.getNombrePersona());
			per.setApellidosPersona(p.getApellidosPersona());
			per.setEdadPersona(p.getEdadPersona());
		}
		return per;
	}

}
