package juegoDePersonajes1;

public class Cualidad {
	private String cualidad;

	public Cualidad(String cualidad) {
		this.cualidad = cualidad;
	}
	
	public String getCualidad() {
		return cualidad;
	}

	@Override
	public String toString() {
		return "Cualidad [cualidad=" + cualidad + "]";
	}
	
}
