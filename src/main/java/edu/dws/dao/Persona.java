package edu.dws.dao;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.context.annotation.ComponentScan;

@Entity
@Table(name = "personas-lista", schema = "vistas-ejercicio")
@ComponentScan
public class Persona {
	//Atributos
		/*@Column(name = "md_uuid")
		private String mdUuid;
		@Column(name = "md_date")
		@Temporal(TemporalType.TIMESTAMP)
		private Calendar mdDate;
		@Id
		@Column(name = "id_persona", unique = true, nullable = false)
		private long idPersona; */
		@Column(name = "nombre_persona")
		private String nombrePersona;
		@Column(name = "apellidos_persona")
		private String apellidosPersona;
		@Column(name = "edad_persona")
		private long edadPersona;
		
		//Constructores
		
		public Persona(String mdUuid, Calendar mdDate, long idPersona, String nombrePersona, String apellidosPersona,
				long edadPersona) {
			super();
			/*this.mdUuid = mdUuid;
			this.mdDate = mdDate;
			this.idPersona = idPersona;*/
			this.nombrePersona = nombrePersona;
			this.apellidosPersona = apellidosPersona;
			this.edadPersona = edadPersona;
		}

		public Persona() {
			super();
		}
		
		//Getters y Setters

		/*public String getMdUuid() {
			return mdUuid;
		}*/

		/*public void setMdUuid(String mdUuid) {
			this.mdUuid = mdUuid;
		}*/

		/*public Calendar getMdDate() {
			return mdDate;
		}*/

		/*public void setMdDate(Calendar mdDate) {
			this.mdDate = mdDate;
		}*/

		/*public long getIdPersona() {
			return idPersona;
		}*/

		/*public void setIdPersona(long idPersona) {
			this.idPersona = idPersona;
		}*/

		public String getNombrePersona() {
			return nombrePersona;
		}

		public void setNombrePersona(String nombrePersona) {
			this.nombrePersona = nombrePersona;
		}

		public String getApellidosPersona() {
			return apellidosPersona;
		}

		public void setApellidosPersona(String apellidosPersona) {
			this.apellidosPersona = apellidosPersona;
		}

		public long getEdadPersona() {
			return edadPersona;
		}

		public void setEdadPersona(long edadPersona) {
			this.edadPersona = edadPersona;
		}
}
