package juegoDePersonajes1;

import java.util.ArrayList;

public class Personaje {
	private final int CANT_CARACT = 5;
	private String nombreReal, nombreSuper;
	private ArrayList<Caracteristica> caracteristicas;
	
	public Personaje(String nombreReal, String nombreSuper) {
		this.nombreReal = nombreReal;
		this.nombreSuper = nombreSuper;
		this.caracteristicas = new ArrayList<>(getCANT_CARACT());
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

	public int getCANT_CARACT() {
		return CANT_CARACT;
	}
	
	
	//Otros métodos
	public void addCracteristica(Cualidad c, int lvl) {
		boolean repite=false;
		for(Caracteristica cc : caracteristicas) {
			if(cc.getC().equals(c)) {
				repite=true;
				System.out.println(c.getCualidad()+" ya existe en "+this.getNombreReal());
			}
		}
		if(!repite) {
			caracteristicas.add(new Caracteristica(c, lvl));
		}
	}

	@Override
	public String toString() {
		return "Personaje [nombreReal=" + nombreReal + ", nombreSuper=" + nombreSuper + ", caracteristicas="
				+ caracteristicas + "]";
	}
	
}
