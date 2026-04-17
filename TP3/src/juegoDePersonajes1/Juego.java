package juegoDePersonajes1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Juego {
	private ArrayList<Jugador> jugadores;
	private ArrayList<Personaje> personajes;
	private int MIN_JUGADORES = 1, MIN_PERSONAJES=2, MAX_JUGADORES=2;
	
	public Juego() {
		this.jugadores = new ArrayList<>(MAX_JUGADORES);
		this.personajes = new ArrayList<>();
	}
	
	
	public Juego(ArrayList<Jugador> jugadores, ArrayList<Personaje> personajes) {
		this.jugadores = jugadores;
		this.personajes = personajes;
	}


	//ADDERS
	public void addJugador(Jugador j) {
		if(!jugadores.contains(j)&&jugadores.size()<MAX_JUGADORES) {
			jugadores.add(j);
		} else {
			System.out.println(j.getNombre()+" ya participa");
		}
	}
	public void addPersonaje(Personaje p) {
		if(!personajes.contains(p)) {
			personajes.add(p);
		} else {
			System.out.println(p.getNombreSuper()+" ya participa");
		}
	}

	//GETERS
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	public ArrayList<Personaje> getPersonajes() {
		return personajes;
	}
	
	//MECANISMO DEL JUEGO
	public void jugar() {
		// Me aseguro que hay jugadores, que haya al menos la misma cantidad de personajes únicos que jugadores, y que haya como mínimo 2 personajes
		if(!jugadores.isEmpty() && contarPersonajesUnicos() >= jugadores.size() && personajes.size() >= MIN_PERSONAJES) {
			mezclarMazo();
			repartirMazo();
			enfrentar(jugadores);
		} else {
			System.out.println("No se puede jugar");
		}
	}
	
	
	

	private void repartirMazo() {
		int index = 0;
		if(isJuegoSolitario()) {
			int asignados = 0;
			while(index < personajes.size() && asignados < 2) {
				Personaje personaje = personajes.get(index);
				if(!personajeAsignado(personaje)) {
					jugadores.get(0).addPersonaje(personaje);
					asignados++;
				}
				index++;
			}
			if(asignados < 2) {
				System.out.println("No hay suficientes personajes únicos para el juego solitario");
			}
		} else {
			for(Jugador jj: jugadores) {
				while(index < personajes.size() && personajeAsignado(personajes.get(index))) {
					index++;
				}
				if(index >= personajes.size()) {
					System.out.println("No hay suficientes personajes únicos para el reparto");
					return;
				}
				jj.addPersonaje(personajes.get(index));
				index++;
			}
		}
	}
	public void mezclarMazo(){
		Collections.shuffle(personajes);
	}
	public boolean isJuegoSolitario() {
		return jugadores.size() == MIN_JUGADORES;
	}
	public Cualidad getCualidadRandom(Jugador jj) {
		Random rand = new Random();
		int i = 0;
		return jj.getPersonajes().get(i).getCaracteristicas().get(rand.nextInt(jj.getPersonajes().get(i).getCaracteristicas().size())).getC();
	}

	public Cualidad getCualidadRandom(Jugador jj, Set<Cualidad> excluidos) {
		ArrayList<Cualidad> disponibles = new ArrayList<>();
		for (Caracteristica cc : jj.getPersonajes().get(0).getCaracteristicas()) {
			if (!excluidos.contains(cc.getC())) {
				disponibles.add(cc.getC());
			}
		}
		if (disponibles.isEmpty()) {
			return null;
		}
		Random rand = new Random();
		return disponibles.get(rand.nextInt(disponibles.size()));
	}

	public Caracteristica getCaracteristicaPersonaje(Jugador j, Cualidad c) {
		for(Personaje pp : j.getPersonajes()) {
			for(Caracteristica cc : pp.getCaracteristicas()) {
				if(cc.getC().equals(c)) {
					return cc;
				}
			}
		}
		return null;
	}

	private boolean personajeAsignado(Personaje p) {
		for(Jugador j : jugadores) {
			if(j.getPersonajes().contains(p)) {
				return true;
			}
		}
		return false;
	}

	private int contarPersonajesUnicos() {
		Set<Personaje> unicos = new HashSet<>(personajes);
		return unicos.size();
	}

	public void enfrentar(ArrayList<Jugador> jj) {
		int ij = 0;
		//Cualidad de enfrentamiento random
		Cualidad c;
	
		if(isJuegoSolitario()) {
			c = getCualidadRandom(jj.get(0));
			jj.get(0).enfrentamientoSolitario(c);
	
		} 
		else {
			Set<Cualidad> cualidadesProbadas = new HashSet<>();
			int totalCualidades = jj.get(0).getPersonajes().get(0).getCaracteristicas().size();
			boolean hayGanador = false;
			while(!hayGanador) {
				if (cualidadesProbadas.size() >= totalCualidades) {
					System.out.println("Empate definitivo. No se puede definir un ganador.");
					break;
				}
				c = getCualidadRandom(jj.get(0), cualidadesProbadas);
				if (c == null) {
					System.out.println("No hay cualidad disponible para desempate.");
					break;
				}
				cualidadesProbadas.add(c);
				Caracteristica ca = getCaracteristicaPersonaje(jj.get(0), c);
				Caracteristica cb = getCaracteristicaPersonaje(jj.get(ij+1), c);
				if (ca == null || cb == null) {
					System.out.println("Característica no encontrada para el enfrentamiento: " + c);
					return;
				}
				if(ca.getNivel() < cb.getNivel()) {
					hayGanador = true;
					System.out.println("Gana: " + jj.get(ij+1).getNombre());
				} else if(ca.getNivel() > cb.getNivel()) {
					hayGanador = true;
					System.out.println("Gana: " + jj.get(ij).getNombre());
				} else {
					System.out.println("Empate en " + c.getCualidad() + ", eligiendo otra cualidad...");
				}
			}
		}
	}
	
}

