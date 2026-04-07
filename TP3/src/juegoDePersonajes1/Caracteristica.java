package juegoDePersonajes1;

public class Caracteristica {
	private Cualidad c;
	private double nivel;
	
	public Caracteristica(Cualidad c, double nivel) {
		this.c = c;
		this.nivel = nivel;
	}
	
	public Cualidad getC() {
		return c;
	}
	public double getNivel() {
		return nivel;
	}

	@Override
	public String toString() {
		return "Caracteristica [c=" + c + ", nivel=" + nivel + "]";
	}
	
	
}
