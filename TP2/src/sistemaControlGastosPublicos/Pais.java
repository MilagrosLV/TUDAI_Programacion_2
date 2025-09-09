package sistemaControlGastosPublicos;

import java.util.ArrayList;

public class Pais {
	//Atributtes
	private String nombre;
	private ArrayList<Provincia> provincias;
	private ArrayList<Ciudad> ciudadesEnDeficit;
	
	//Constructor
	public Pais(String nombre) {
		this.nombre = nombre;
		this.provincias = new ArrayList<>();
	}
	
	//Other methods
	public void agregarProvincia(Provincia p) {
		boolean seRepite = false;
		for(Provincia pp : provincias) {
			if(p.equals(pp)) {
				seRepite = true;
			}
		}
		if(!seRepite) {
			provincias.add(p);
		}
	}
	
	public void ciudadesEnDeficit() {
		for(Provincia pp : provincias) {
			if(pp.ciudadesEnDeficit() != null) {
				ciudadesEnDeficit.addAll(pp.ciudadesEnDeficit());
			}
		}
	}
}
