package juegoDeDados;

import java.util.ArrayList;

public class Cubilete {
	//ATRIBUTOS
	private Dado d1 = new Dado();
	private Dado d2 = new Dado();
	private ArrayList<Dado>dados;
	
	//Constructor

	public Cubilete() {
		this.dados= new ArrayList<>();
		agregarDado(d1); agregarDado(d2);
	}

	//GETTERS
	public ArrayList<Dado> getDados() {
		return dados;
	}

	public int getCantDados() {
		return this.getDados().size();
	}
	
	//OTROS MÉTODOS
	public void agregarDado(Dado d) {
		this.dados.add(d);	
	}
	
	public int tirar() { 
		int suma = 0;
		for(Dado dd : this.dados) {
			suma += dd.tirar();
		}
		return suma; //Devuelve lista de los resultados de cada dado
	}
	
}
