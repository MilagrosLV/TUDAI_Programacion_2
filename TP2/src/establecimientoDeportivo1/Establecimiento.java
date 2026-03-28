package establecimientoDeportivo1;

import java.util.ArrayList;

public class Establecimiento {
	private ArrayList<Usuario> usuarios;
	private ArrayList<Cancha> canchas;
	private ArrayList<Turno>agenda;
	
	public Establecimiento() {
		this.usuarios = new ArrayList<Usuario>();
		this.canchas = new ArrayList<Cancha>();
		this.agenda = new ArrayList<Turno>();
	}

	
	//Getters
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	public ArrayList<Cancha> getCanchas() {
		return canchas;
	}
	public ArrayList<Turno> getAgenda() {
		return agenda;
	}
	
	//OTROS MÉTODOS
	
	
}
