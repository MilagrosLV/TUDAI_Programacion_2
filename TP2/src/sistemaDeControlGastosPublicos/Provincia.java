package sistemaDeControlGastosPublicos;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
	private String nombre;
	private ArrayList<Ciudad> ciudades;
	
	//CONSTRUCTOR
	public Provincia(String nombre) {
		super();
		this.nombre = nombre;
		this.ciudades = new ArrayList<Ciudad>();
	}

	
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Ciudad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(ArrayList<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}

	
	//OTROS METODOS
	@Override
	public String toString() {
		return "Provincia [nombre=" + nombre + ", ciudades=" + ciudades + "]";
	}
	
	//Agregar Ciudad
	public void agregarCiudad(Ciudad c) {
		ciudades.add(c);
	}
	
	//Ciudades en deficit
	public List<Ciudad> ciudadesEnDeficit() {
		List<Ciudad> ciudadesDeficit = new ArrayList<Ciudad>();
		for(Ciudad c : ciudades) {
			if(c.isDeficit()) {
				ciudadesDeficit.add(c);
			}
		}
		return ciudadesDeficit;
	}
	
	//Más de la mitad de ñas ciidades en deficit
	public boolean masDeLaMitadCiudadesDeficit() {
		return ((ciudades.size()/2) < (ciudadesEnDeficit()).size());
	}

	
	
	
	
	
	
	
}
