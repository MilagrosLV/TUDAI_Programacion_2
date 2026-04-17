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
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Cualidad other = (Cualidad) obj;
		return cualidad != null ? cualidad.equals(other.cualidad) : other.cualidad == null;
	}

	@Override
	public int hashCode() {
		return cualidad != null ? cualidad.hashCode() : 0;
	}

	@Override
	public String toString() {
		return "Cualidad [cualidad=" + cualidad + "]";
	}
	
}
