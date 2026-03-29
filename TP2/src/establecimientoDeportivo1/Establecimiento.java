
package establecimientoDeportivo1;

import java.util.ArrayList;

public class Establecimiento {
	//atributos
	private ArrayList<Usuario> usuarios;
	private ArrayList<Cancha> canchas;
	private ArrayList<Turno> turnos;
	
	//Constructor
	public Establecimiento() {
		this.usuarios = new ArrayList<Usuario>();
		this.canchas = new ArrayList<Cancha>();
		this.turnos = new ArrayList<Turno>();
	}

	
	//Getters
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	public ArrayList<Cancha> getCancha() {
		return canchas;
	}
	public ArrayList<Turno> getAgenda() {
		return turnos;
	}
	
	//OTROS MÉTODOS
	public void addUsuario(Usuario u) {
		if(!getUsuarios().contains(u)) {
			getUsuarios().add(u);
		} else {
			System.out.println(u+" ya existe en la lista");
		}
	}
	public void addCancha(Cancha u) {
		if(!getCancha().contains(u)) {
			getCancha().add(u);
		} else {
			System.out.println(u+" ya existe en la lista");
		}
	}
	public void addTurno(Turno u) {
		if(!getAgenda().contains(u)) {
			if(!canchasOcupadas(u)) {
				getAgenda().add(u);
			}else {
	            System.out.println("No hay canchas disponibles para ese horario.");
	        }
		} else {
			System.out.println(u+" ya existe en la lista");
		}
	}
	
	private boolean canchasOcupadas(Turno t) {//Chequeo la cantidad de canchas
		int contador = 0;
		for(Turno tt : turnos) {
			if(t.getC().equals(tt.getC()) && overlap(t, tt)) {
				contador++;
			}
		}
		return contador >= t.getC().getCant();
	}

	private boolean overlap(Turno a, Turno b) {
		return a.getFechaHoraI().isBefore(b.getFechaHoraF()) && a.getFechaHoraF().isAfter(b.getFechaHoraI());
	}
	
	
}
