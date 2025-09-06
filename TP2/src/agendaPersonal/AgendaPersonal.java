package agendaPersonal;

import java.util.ArrayList;

public class AgendaPersonal {
	private Persona usuario;
	private ArrayList<Reunion> reuniones;
	
	
	public AgendaPersonal(Persona usuario) {
		this.usuario = usuario;
		this.reuniones = new ArrayList<>();
	}

	//GETTERS AND SETTERS METHODS
	public Persona getUsuario() {
		return usuario;
	}
	public void setUsuario(Persona usuario) {
		this.usuario = usuario;
	}
	public ArrayList<Reunion> getReuniones() {
		return reuniones;
	}
	
	//OTHER METHODS
	public void agregarReunion(Reunion r) {
		if(!hayConflicto(r)) {
			reuniones.add(r);
		} else {
			System.out.println(r.getTema()+" se superpone con otro evento. No puede agregarse a la agenda");
		}
	}
	public boolean hayConflicto(Reunion r){
		for(Reunion rr : reuniones) {
			if(seSuperpone()) {
				
			}
		}
	}
	public boolean seSuperpone() {
		
	}
	
	
	
}
