package seleccionDeFutbol;

import java.time.LocalDate;

public class Entrenador extends Integrante {
	private String idFederacion;

	public Entrenador(String nombre, String apellido, String nroPasaporte, LocalDate dob, Estado e,
			String idFederacion) {
		super(nombre, apellido, nroPasaporte, dob, e);
		this.idFederacion = idFederacion;
	}

	public String getIdFederacion() {
		return idFederacion;
	}


	
	
}
