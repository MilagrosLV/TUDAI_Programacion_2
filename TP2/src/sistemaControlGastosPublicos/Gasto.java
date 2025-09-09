package sistemaControlGastosPublicos;

public class Gasto {
	private String nombre;
	private double precioGasto;
	
	//CONSTRUCTOR
	public Gasto(String nombre, double precioGasto) {
		setNombre(nombre);
		setPrecioGasto(precioGasto);
	}
	
	//getters and setters methods
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioGasto() {
		return precioGasto;
	}
	public void setPrecioGasto(double precioGasto) {
		this.precioGasto = precioGasto;
	}
	
	
	
	
	
	
	
	
	
	
}
