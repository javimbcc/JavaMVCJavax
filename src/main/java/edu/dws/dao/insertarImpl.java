package edu.dws.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class insertarImpl implements DalService{

	@PersistenceContext
	private EntityManager em;
	@Override
	public void insertarPersona(Persona p) {
		try {
			em.persist(p);
		} catch (Exception e) {
			System.out.println("[edu.dws.dal-insertarImpl-inertarPersona]: " + e);
		}
		
	}

}
