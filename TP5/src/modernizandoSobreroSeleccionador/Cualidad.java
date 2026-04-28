package modernizandoSobreroSeleccionador;

public class Cualidad {
	//ATRIBUTOS
	private String cualidad;

	//CONSTRUCTOR
	public Cualidad(String cualidad) {
		setCualidad(cualidad);
	}

	//GETTERS Y SETTERS
	public String getCualidad() {
		return cualidad;
	}
	public void setCualidad(String cualidad) {
		this.cualidad = cualidad.toLowerCase();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Cualidad other = (Cualidad) obj;
		return cualidad.equals(other.cualidad);
	}
	
	@Override
	public int hashCode() {
		return cualidad.hashCode();
	}
	
	@Override
	public String toString() {
		return cualidad;
	}
	
}
