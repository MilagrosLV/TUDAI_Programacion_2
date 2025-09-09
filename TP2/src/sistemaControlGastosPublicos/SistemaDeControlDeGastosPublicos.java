package sistemaControlGastosPublicos;

import java.util.ArrayList;

public class SistemaDeControlDeGastosPublicos {
	//Atributtes
	private Pais pais;
	private ArrayList<Double> impuestos;
	
	//Constructor
	public SistemaDeControlDeGastosPublicos(Pais pais) {
		setPais(pais);
		this.impuestos = new ArrayList<>();
	}

	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public ArrayList<Double> getImpuestos() {
		ArrayList<Double> copiaImpuestos = new ArrayList<>();
		copiaImpuestos = this.impuestos;		
		return copiaImpuestos;
	}
	
	//Other methods
	public void agregarImpuesto(Double i) {
		boolean seRepite = false;
		for(Double ii : impuestos) {
			if(i.equals(ii)) {
				seRepite = true;
			}
		}
		if(!seRepite) {
			impuestos.add(i);
		}
	}




	
	
	
}
