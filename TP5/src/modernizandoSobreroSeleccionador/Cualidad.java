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
	
	
}
