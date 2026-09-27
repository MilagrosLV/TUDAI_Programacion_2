package juegoDePersonajes3;


public class Jugador {
	private String nombre;
	private Personaje personaje=null;
	
	
	public Jugador(String nombre) {
		this.nombre = nombre;
	}

	//getters
	public String getNombre() {return nombre;}
	public Personaje getPersonaje() {return personaje;}
	public String getNombrePersonaje() {
		if(tienePersonajeJugable())
			return personaje.getNombre();
		else
			return "No tiene personaje.";
		}
	public String getNombreSuperPersonaje() {
		if(tienePersonajeJugable())
			return personaje.getNombreSuper();
		else
			return "No tiene personaje.";
		}
	
	
	//adders
	public void agregarPersonaje(Personaje p) { if(personaje == null && p!=null) this.personaje = p; }
	
	//tiene personaje
	public boolean tienePersonajeJugable() {return personaje != null;}
	
	//limpiar personaje
	public void limpiarPersonaje() {
		personaje=null;
	}
	
	
	
}
