package juegoDePersonajes1;

public class Main {

	public static void main(String[] args) {
		//ITERACIONES
		Personaje p1 = new Personaje ("Lara", "Moxxie", 18, 50, 50, 74, 1.65, 24);
		Personaje p2 = new Personaje ("Clark Kent", "Superman", 100, 100, 100, 90, 1.90, 35);
		Personaje p3 = new Personaje ("Bruce Wayne", "Batman", 50, 80, 70, 85, 1.85, 40);
		
		Jugador j1 = new Jugador("Juan");
		Jugador j2 = new Jugador("Pedro");
		Jugador j3 = new Jugador("Maria");

		Juego jj = new Juego();
		jj.addPersonaje(p3);jj.addPersonaje(p2);jj.addPersonaje(p1);
		jj.addJugador(j1);
		jj.jugar();


	}

}
