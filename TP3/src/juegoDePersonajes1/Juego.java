package juegoDePersonajes1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

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
		//Me aceguro que hay jugadores, que hayan más o la misma cantidad de personajes que jugadores, y que haya como minimo 2 personajes
		if(!jugadores.isEmpty() && personajes.size()>=jugadores.size() && personajes.size()>=MIN_PERSONAJES) {
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
			jugadores.get(index).addPersonaje(personajes.get(index));
			jugadores.get(index).addPersonaje(personajes.get(++index));
		} else {
			for(Jugador jj: jugadores) {
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
	public Caracteristica getCaracteristicaPersonaje(Jugador j, Cualidad c) {
		for(Caracteristica cc : j.getPersonajes().getFirst().getCaracteristicas()) {
			if(cc.getC().equals(c)) {
				return cc;
			}
		}
		return null;
	}

	public void enfrentar(ArrayList<Jugador> jj) {
		int ij = 0;
		//Cualidad de enfrentamiento random
		Cualidad c=getCualidadRandom(jj.get(ij));
	
		if(isJuegoSolitario()) {
			jj.get(ij).enfrentamientoSolitario(c);
	
		} 
		else {
			boolean hayGanador=false;
			while(!hayGanador) {
				if(getCaracteristicaPersonaje(jj.get(ij), c).getNivel()<getCaracteristicaPersonaje(jj.get(ij+1), c).getNivel()) {
					hayGanador=true;
					System.out.println("Gana: "+jj.get(ij+1).getNombre());
				}else if(getCaracteristicaPersonaje(jj.get(ij), c).getNivel()>getCaracteristicaPersonaje(jj.get(ij+1), c).getNivel()) {
					hayGanador=true;
					System.out.println("Gana: "+jj.get(ij).getNombre());
				} else {
					System.out.println("Empate");
					c=getCualidadRandom(jj.get(ij));
				}
			}
		}
	}
	
}

