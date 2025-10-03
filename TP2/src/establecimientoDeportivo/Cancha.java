package establecimientoDeportivo;

public class Cancha {
	//ATRIBUTOS
	private String tipo;
	private int disponibilidad;
	private double precio;
	
	//CONSTRUCTOR
	public Cancha(String tipo, int disponibilidad, double precio) {
		this.tipo = tipo;
		this.disponibilidad = disponibilidad;
		this.setPrecio(precio);
	}

	//GETTERS y SETTERS
	public String getTipo() { //TIPO
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDisponibilidad() { //DISPONIBILIDAD
		return disponibilidad;
	}
	public void setDisponibilidad(int disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public double getPrecio() { //PRECIO
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
		
	
}
