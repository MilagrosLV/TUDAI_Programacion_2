package ecuestria;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class Patrulla extends ElementoPoni {
	private ArrayList<ElementoPoni>miembros;
	
	public Patrulla() {
		this.miembros = new ArrayList<>();
	}
	
	public void addMiembro(Poni p) {
		if(p!=null && (!miembros.contains(p))) {
			miembros.add(p);
		}
	}
	

	public ArrayList<ElementoPoni> getMiembros() {
		return miembros;
	}

	public ArrayList<String> getHabilidades(){
		Set<String> aux = new LinkedHashSet<>();
		for (ElementoPoni pp: miembros) {
			aux.addAll(pp.getHabilidades());
		}
		return new ArrayList<String>(aux);
	}
	
	public int contarPonis(Condicion c) {
		int contador=0;
		for (ElementoPoni pp: miembros) {
			contador += pp.contarPonis(c);
		}
		return contador;
	}
	
	
}
