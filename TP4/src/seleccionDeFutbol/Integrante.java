package seleccionDeFutbol;

import java.time.LocalDate;

public abstract class Integrante {
	private String nombre, apellido, nroPasaporte;
	private LocalDate dob;
	private Estado e;
	
	public Integrante(String nombre, String apellido, String nroPasaporte,LocalDate dob, Estado e) {
		this.apellido=apellido;
		this.dob=dob;
		this.nombre=nombre;
		this.nroPasaporte=nroPasaporte;
		this.e = e;
	}

	public Estado getE() {
		return e;
	}

	public void setE(Estado e) {
		this.e = e;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	public String getNombreApellido() {
		return getNombre()+" "+getApellido();
	}

	public String getNroPasaporte() {
		return nroPasaporte;
	}

	public LocalDate getDob() {
		return dob;
	}
	
	public boolean isDisponible() {
		return getE() == Estado.ORIGEN;
	}

	@Override
	public String toString() {
		return "Integrante [" + getNombreApellido() + ", " + getE() + ", "
				+ getNroPasaporte() + ", " + getDob() + "]";
	}
	
	
	
}
