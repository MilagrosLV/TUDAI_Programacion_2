package sistemaControlGastosPublicos;

import java.util.ArrayList;

public class Provincia {
	//Atributtes
	private String nombre;
	private ArrayList<Ciudad> ciudades;
	
	//Constructor
	public Provincia(String nombre) {
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
	
	//Other methods
	public void agregarCiudad(Ciudad c) {
		boolean seRepite = false;
		for(Ciudad cc : ciudades) {
			if(c.equals(cc)) {
				seRepite = true;
			}
		}
		if(!seRepite) {
			ciudades.add(c);
		}
	}
	
	public boolean masDeLaMitadCiudadesEnDeficit() {
		int cantCiudadEnDeficit = 0;
		for(Ciudad cc : ciudades) {
			if(cc.estaEnDeficit()) {
				cantCiudadEnDeficit++;
			}
		}
		return cantCiudadEnDeficit>(ciudades.size()/2);
	}
	
	public ArrayList<Ciudad> ciudadesEnDeficit() {
		ArrayList<Ciudad> ciudadesEnDeficit = new ArrayList<>();
		for(Ciudad cc : ciudades) {
			if(cc.estaEnDeficit()) {
				ciudadesEnDeficit.add(cc);
			}
		}
		return ciudadesEnDeficit;
	}

	@Override
	public String toString() {
		return "Provincia [nombre=" + nombre + ", ciudades=" + ciudades + "]";
	}
	
	
	
}
