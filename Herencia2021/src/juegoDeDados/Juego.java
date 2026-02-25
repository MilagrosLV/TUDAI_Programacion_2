package juegoDeDados;

public class Juego {
	//Atributos
	private Jugador j1, j2;
	private Cubilete c;
	private int MIN_PUNTO = 7, CANT_TIRADAS = 10;
	
	
	//Constructor
	public Juego (Jugador j1, Jugador j2) {
		this.j1 = j1;
		this.j2 = j2;
		this.c = new Cubilete();
	}

	//GETTERS 
	public Jugador getJ1() {
		return j1;
	}
	public Jugador getJ2() {
		return j2;
	}
	public Cubilete getC() {
		return c;
	}
	public int getMIN_PUNTO() {
		return MIN_PUNTO;
	}
	public int getCANT_TIRADAS() {
		return CANT_TIRADAS;
	}

	
	//OTROS MÉTODOS
	public Jugador ganador() {
		if(j1.getPuntos()>j2.getPuntos())
			return j1;
		else if (j1.getPuntos()<j2.getPuntos())
			return j2;
		else 
			return null;
	}
	
	public void jugar() {
		for (int i=0; i<getCANT_TIRADAS(); i++) {
			int tj1, tj2;
			tj1 = j1.tirar(c);
			tj2 = j2.tirar(c);
			
			if(tj1 <= getMIN_PUNTO() && tj1>tj2)
				j1.incrementarPuntos();
			else if(tj2 <= getMIN_PUNTO() && tj1<tj2)
				j2.incrementarPuntos();
		}
		
		if (ganador() != null) {
			System.out.println("Ganadore: "+ganador().getNombre());
		}
		else {
			System.out.println("Empate");
		}
	}

	
	
}
