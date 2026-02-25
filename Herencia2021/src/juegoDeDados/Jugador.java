package juegoDeDados;

public class Jugador {
	//ATRIBUTOS
	private String nombre;
	private int puntos = 0;
	
	//CONSTRUCTOR
	public Jugador(String nombre) {
		this.nombre = nombre;
	}

	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	
	//OTROS MÉTODOS
	public void incrementarPuntos() {
		this.puntos++;
	}
	public int tirar(Cubilete c) {
		return c.tirar();
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", puntos=" + puntos + "]";
	}
	
	


	
	
	
	
	
}
