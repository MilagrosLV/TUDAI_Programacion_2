package seleccionDeFutbol;

import java.time.LocalDate;

public class Futbolista extends Integrante {
	private String posicion;
	private boolean esDiestro;
	private int cantGoles;
	
	
	public Futbolista(String nombre, String apellido, String nroPasaporte, LocalDate dob, Estado e, String posicion,
			boolean esDiestro, int cantGoles) {
		super(nombre, apellido, nroPasaporte, dob, e);
		this.posicion = posicion;
		this.esDiestro = esDiestro;
		this.cantGoles = cantGoles;
	}


	public String getPosicion() {
		return posicion;
	}


	public boolean isEsDiestro() {
		return esDiestro;
	}


	public int getCantGoles() {
		return cantGoles;
	}

	
	

}
