package juegoDePersonajes3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Juego {
	private List<Personaje> personajes;
	private Jugador j1=null, j2=null;
	private Ring ring;
	
	public Juego() {
		ring = new Ring();
		this.personajes=new ArrayList<>();
	}
	
	
	//getters
	public List<Personaje> getPersonajes(){ return List.copyOf(personajes);}
	public Jugador getJugador1() {return j1;}
	public Jugador getJugador2() {return j2;}
	
	//adders
	public void agregarPersonaje(Personaje p) {
		if(p!= null && !personajes.contains(p) && p.esJugable()) 
			personajes.add(p);
	}
	public void agregarJugador(Jugador j) {
		if(j1 == null && j2 == null) j1=j;
		else if((j1!=null && !j1.equals(j)) && j2 == null) j2=j;
	}
	
	//Randomizar personajes a enfrentar
	public void repartirPersonajes() {
		if(!personajes.isEmpty() && personajes.size()>=2) {
			Collections.shuffle(personajes);
			j1.agregarPersonaje(personajes.get(0));
			j2.agregarPersonaje(personajes.get(1));
			
		} 
	}
	
	//JUGAR
	public void jugar(List<Cualidad> ordenCualidadEnfrentamiento) {
		try {
			if(j1==null || j2==null) {
				System.out.println("No se puede jugar, no se ingresaron los jugadores");
				return;
			}
			if(personajes.size() < 2) {
				System.out.println("No hay suficientes personajes para jugar");
				return;
			}
			repartirPersonajes();
			if(j1.tienePersonajeJugable()&&j2.tienePersonajeJugable()) {
				Jugador ganador;
				
				ganador = ring.enfrentar(j1, j2, ordenCualidadEnfrentamiento);
				
				
				mostrarResultado(ganador);
				limpiarJugador(j1);limpiarJugador(j2);
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
	
	//Mostrar resultado, anunciar ganador
	public void mostrarResultado(Jugador j) {
		if(j!=null)
			System.out.println("Ganador: "+j.getNombre()+" con "+j.getNombreSuperPersonaje());
		else
			System.out.println("Empate");
	}
	
	//Liberar a los jugadores 
	public void limpiarJugador(Jugador j) {
		if(j.tienePersonajeJugable()) {
			j.limpiarPersonaje();
		}
	}
}
