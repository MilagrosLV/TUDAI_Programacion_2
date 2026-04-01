package juegoDePersonajes1;

public class Caracteristica {
	private Cualidad c;
	private int nivel;
	
	public Caracteristica(Cualidad c, int nivel) {
		this.c = c;
		this.nivel = nivel;
	}
	
	public Cualidad getC() {
		return c;
	}
	public int getNivel() {
		return nivel;
	}
	
	
}
