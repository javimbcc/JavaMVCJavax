package edu.dws.consultas;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import edu.dws.dao.Persona;
import edu.dws.dao.insertarImpl;

@Component
@ComponentScan
public class ConsultasPostgreSQL {
	@Autowired
	private insertarImpl impl;

	// Insertar Alumno
	@Transactional
	public void insertarMatriculaAlumno(Persona eva) {
		impl.insertarPersona(eva);
	}
}
