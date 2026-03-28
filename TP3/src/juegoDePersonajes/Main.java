package juegoDePersonajes;

public class Main {

	public static void main(String[] args) {
		private Jugador j1 = new Jugador("Mili"); //Solo se enfrentan dos jugadores
		private Jugador j2 = new Jugador("Clara");
		
		private Personaje p1 = new Personaje(j1, "VI", 20, 30, 18, 24, 100);
		private Personaje p2 = new Personaje(j2, "Caytlin", 10, 20, 14, 25, 80);
		
		Enfrentamiento enfrentamiento = new Enfrentamiento(p1, p2, "edad");
		
		enfrentamiento.luchar();

	}

}
