package sistemaControlGastosPublicos;

import java.util.ArrayList;

public class SistemaDeControlDeGastosPublicos {
	//Atributtes
	ArrayList<Provincia> provincias;
	ArrayList<Ciudad> ciudadesEnDeficit;

	//Constructor
	public SistemaDeControlDeGastosPublicos() {
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

	@Override
	public String toString() {
		return "SistemaDeControlDeGastosPublicos [provincias=" + provincias + ", ciudadesEnDeficit=" + ciudadesEnDeficit
				+ "]";
	}
	
	
	
}
