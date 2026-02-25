package juegoDeDados;

public class Main {
	/*
	 * Reglas del Juego:
		■ Cada jugador tira dos dados diez veces.
		■ El jugador que obtiene la mayor cantidad de tiradas sumando
		siete o más es el ganador.
	*/

	public static void main(String[] args) {
		//ITERACIONES
		Jugador j1 = new Jugador("Valen"); Jugador j2 = new Jugador("Mili");
		Juego jj = new Juego(j1,j2);

		//Prueba
		jj.jugar();
	}

}
