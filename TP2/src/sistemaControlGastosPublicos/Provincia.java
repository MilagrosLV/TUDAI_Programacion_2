package sistemaControlGastosPublicos;

import java.util.ArrayList;

public class Provincia {
	//Atributtes
	private String nombre;
	private ArrayList<Ciudad> ciudades;
	
	//Constructor
	public Provincia(String nombre, ArrayList<Ciudad> ciudades) {
		setNombre(nombre);
		this.ciudades = new ArrayList<>();
	}

	//Getter and Setter methods
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
