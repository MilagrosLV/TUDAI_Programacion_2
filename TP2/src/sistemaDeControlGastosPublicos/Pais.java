package sistemaDeControlGastosPublicos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private ArrayList<Provincia> provincias;
	
	//CONSTRUCTOR
	public Pais(String nombre) {
		this.nombre = nombre;
		this.provincias = new ArrayList<Provincia>();
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Provincia> getProvincias() {
		return provincias;
	}
	public void setProvincias(ArrayList<Provincia> provincias) {
		this.provincias = provincias;
	}

	//OTROS METODOS
	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", provincias=" + provincias + "]";
	}
	
	//Agregar Provincia
	public void agregarProvincia(Provincia p) {
		provincias.add(p);
	}
	
	//Ciudades en deficit
	public void ciudadesDeficitPais() {
		for(Provincia p : provincias) {
			System.out.println(p.ciudadesEnDeficit());
		}
	}
	
	//Provincias con mayoria de las ciudades en deficit
	public void provinciasMayoriaDeficit() {
		for(Provincia p: provincias) {
			if(p.masDeLaMitadCiudadesDeficit()) {
				System.out.println(p.getNombre());
			}
		}
	}
	
	
	
	
	
	
	
	
}
