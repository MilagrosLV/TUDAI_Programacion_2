package juegoDePersonajes1;

import java.util.ArrayList;
import java.util.Objects;

public class Personaje {
	private final int CANT_CARACT = 5;
	private String nombreReal, nombreSuper;
	private double vs, f, v, p, a, e;
	private Cualidad c1 = new Cualidad("Vision Nocturna");
	private Cualidad c2 = new Cualidad("Fuerza");
	private Cualidad c3 = new Cualidad("Velocidad");
	private Cualidad c4 = new Cualidad("Peso");
	private Cualidad c5 = new Cualidad("Altura");
	private Cualidad c6 = new Cualidad("Edad");
	private ArrayList<Caracteristica> caracteristicas;
	
	public Personaje(String nombreReal, String nombreSuper, double vs, double f, double v, double p, double a, double e) {
		this.nombreReal = nombreReal;
		this.nombreSuper = nombreSuper;
		this.caracteristicas = new ArrayList<>(getCANT_CARACT());
		this.addCaracteristica(c1, vs);
		this.addCaracteristica(c2, f);
		this.addCaracteristica(c3, v);
		this.addCaracteristica(c4, p);
		this.addCaracteristica(c5, a);
		this.addCaracteristica(c6, e);
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
	public void addCaracteristica(Cualidad c, double lvl) {
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Objects.equals(nombreReal, other.nombreReal)
				&& Objects.equals(nombreSuper, other.nombreSuper);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombreReal, nombreSuper);
	}
}
