package juegoDePersonajes;

public class Personaje {
	//ATRIBUTOS
	private String nombreJugador, nombrePersonaje;
	private int velocidad, fuerza, edad, visionNocturna,peso;
	
	//CONSTRUCTOR
	public Personaje(Jugador jugador, String nombrePersonaje, int visionNocturna, int velocidad, int fuerza,
			int edad, int peso) {
		this.nombreJugador = jugador.getNombre();
		this.nombrePersonaje = nombrePersonaje;
		this.visionNocturna = visionNocturna;
		this.velocidad = velocidad;
		this.fuerza = fuerza;
		this.edad = edad;
		this.peso = peso;
	}
	
	//METODOS
	public String getNombreJugador() {
		return nombreJugador;
	}
	public String getNombrePersonaje() {
		return nombrePersonaje;
	}
	public int getVisionNocturna() {
		return visionNocturna;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public int getFuerza() {
		return fuerza;
	}
	public int getEdad() {
		return edad;
	}
	public int getPeso() {
		return peso;
	}

	
	
}
