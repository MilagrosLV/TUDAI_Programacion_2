package juegoDePersonajes1;

import java.util.ArrayList;
import java.util.List;



public class Jugador {
	private String nombre;
	private ArrayList<Personaje>personajes;

	//CONSTRUCTOR
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.personajes = new ArrayList<>();
	}

	//GETTERS
	public ArrayList<Personaje> getPersonajes(){
		return personajes;
	}
	public String getNombre() {
		return nombre;
	}
	
	//ADDER
	public void addPersonaje(Personaje p) {
		if(!personajes.contains(p)) {
			personajes.add(p);
		}
	}
	
	//OTROS MÉTODOS

	public void enfrentamientoSolitario(Cualidad c) {
		ArrayList<Caracteristica>caracts=new ArrayList<>(2);
		for(Personaje pp : personajes) {
			for(Caracteristica cc : pp.getCaracteristicas()) {
				if(cc.getC().equals(c)) {
					caracts.add(cc);
				}
			}
		}
		
		if(caracts.getFirst().getNivel()<caracts.getLast().getNivel()) {
			System.out.println("Gana: 1)"+getNombre());
		} else if(caracts.getFirst().getNivel()>caracts.getLast().getNivel()) {
			System.out.println("Gana: 2)"+getNombre());
		} else {
			System.out.println("Empate");
			
			ArrayList<Jugador> j = new ArrayList<>(List.of(this));
			Juego j1 = new Juego(j, personajes);
			j1.enfrentar(j);
		}
		
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", personajes=" + personajes + "]";
	}

	
	
}
