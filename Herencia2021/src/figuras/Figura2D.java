package figuras;

public abstract class Figura2D {
	private String nombre;
	
	//CONSTRUCTOR
	public Figura2D (String nombre){
		this.nombre = nombre;
	}
	
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Otros métodos
	public abstract double getArea();
	public abstract double getPerimetro();
}
