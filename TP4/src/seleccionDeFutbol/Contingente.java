package seleccionDeFutbol;

import java.util.ArrayList;

public class Contingente {
	private ArrayList<Integrante>  integrantes;

	public Contingente() {
		this.integrantes = new ArrayList<Integrante>();
	}

	
	//getter, adder
	public ArrayList<Integrante> getIntegrantes() {
		return integrantes;
	}
	
	public void addIntegrante(Integrante i) {
		if(!getIntegrantes().contains(i)) {
			getIntegrantes().add(i);
		}
	}

	
	//Otros métodos
	public Estado getEstadoPersona(Integrante i) {
		return i.getE();
	}
	public boolean isDisponible(Integrante i) {
		return i.isDisponible();
	}
	
}
