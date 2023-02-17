package edu.dws.DTOs;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class PersonaDTO {
	// Atributos

		/*private String mdUuid;
		private Calendar mdDate;
		private long idPersona;*/
		private String nombrePersona;
		private String apellidosPersona;
		private long edadPersona;

		public PersonaDTO(/*String mdUuid, Calendar mdDate, long idPersona,*/ String nombrePersona, String apellidosPersona,
				long edadPersona) {
			super();
			/*this.mdUuid = mdUuid;
			this.mdDate = mdDate;
			this.idPersona = idPersona;*/
			this.nombrePersona = nombrePersona;
			this.apellidosPersona = apellidosPersona;
			this.edadPersona = edadPersona;
		}

		public PersonaDTO() {
			super();
		}

		/*public String getMdUuid() {
			return mdUuid;
		}

		public void setMdUuid(String mdUuid) {
			this.mdUuid = mdUuid;
		}

		public Calendar getMdDate() {
			return mdDate;
		}

		public void setMdDate(Calendar mdDate) {
			this.mdDate = mdDate;
		}

		public long getIdPersona() {
			return idPersona;
		}

		public void setIdPersona(long idPersona) {
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

		@Override
		public String toString() {
			return "PersonaDTO [nombrePersona=" + nombrePersona + ", apellidosPersona=" + apellidosPersona
					+ ", edadPersona=" + edadPersona + "]";
		}

		/*@Override
		public String toString() {
			return "PersonaDTO [mdUuid=" + mdUuid + ", mdDate=" + mdDate + ", idPersona=" + idPersona + ", nombrePersona="
					+ nombrePersona + ", apellidosPersona=" + apellidosPersona + ", edadPersona=" + edadPersona + "]";
		}*/
}
