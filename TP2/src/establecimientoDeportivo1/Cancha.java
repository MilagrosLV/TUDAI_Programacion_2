package establecimientoDeportivo1;

public class Cancha {
	private String tipo;
	private int cant;
	private double precioHora;
	
	public Cancha(String tipo, int cant, double precioHora) {
		this.tipo = tipo;
		this.cant = cant;
		this.precioHora = precioHora;
	}

	//GETTERS Y SETTERS
	public String getTipo() {return tipo;}

	public int getCant() {
		return cant;
	}

	public double getPrecio() {
		return precioHora;
	}
}
