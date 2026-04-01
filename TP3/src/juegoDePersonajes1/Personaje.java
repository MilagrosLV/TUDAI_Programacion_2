package juegoDePersonajes1;

import java.util.ArrayList;

public class Personaje {
	private String nombreReal, nombreSuper;
	private ArrayList<Caracteristica> caracteristicas;
	
	public Personaje(String nombreReal, String nombreSuper) {
		this.nombreReal = nombreReal;
		this.nombreSuper = nombreSuper;
		this.caracteristicas = new ArrayList<>();
	}

	//GETTERS
	public String getNombreReal() {
		return nombreReal;
	}
	public String getNombreSuper() {
		return nombreSuper;
	}
	public ArrayList<Caracteristica> getCaracteristicas() {
		return caracteristicas;
	}
	
	
	
}
