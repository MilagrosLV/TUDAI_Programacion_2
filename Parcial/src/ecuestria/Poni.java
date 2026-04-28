package ecuestria;

import java.util.ArrayList;

public class Poni extends ElementoPoni{
	private String nombre;
	private int poderMagico;
	private double velocidad;
	private ArrayList<String>habilidades;
	
	public Poni(String nombre, int poderMagico, double velocidad) {
		this.nombre=nombre;
		this.poderMagico=poderMagico;
		this.velocidad=velocidad;
		this.habilidades= new ArrayList<>();
	}

	//getters
	public String getNombre() {
		return nombre;
	}
	public int getPoderMagico() {
		return poderMagico;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public ArrayList<String> getHabilidades() {
		return habilidades;
	}
	public int contarPonis(Condicion c) {
		int nro=0;
		if(c.cumple(this)) {
			nro=1;
		}
		return nro;
	}

	
	
}
