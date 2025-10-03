package elJardinPrivado;

import java.util.ArrayList;

public class SistemaDeGestion {
	//Atributos
	private ArrayList<Planta> plantas;

	//Constructor
	public SistemaDeGestion() {
		this.plantas = new ArrayList<>();
	}

	
	//Getters y Setters
	public ArrayList<Planta> getPlantas() {
		ArrayList<Planta> copiaPlantas = new ArrayList<>();
		copiaPlantas = plantas;
		return copiaPlantas;
	}
	
	//Otros Metodos
	public void agregarPlanta(Planta p) {
		if(!plantas.contains(p)) {
			plantas.add(p);
		} else {
			System.out.println(p.getNombre() + " ya exite");
		}
	}

}
