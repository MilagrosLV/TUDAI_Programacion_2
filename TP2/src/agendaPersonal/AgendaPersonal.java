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
		if(noHayConflicto(r)) {
			reuniones.add(r);
		}
	}
	public boolean noHayConflicto(Reunion r){
		for (Reunion rr : reuniones) {
	        // Verifico si hay superposición
	        if (!(r.getFechaHoraFin().isBefore(rr.getFechaHoraInicio()) || r.getFechaHoraInicio().isAfter(rr.getFechaHoraFin()))) {
	            System.out.println("Conflicto entre: " + r.getTema() + " y " + rr.getTema());
	            return false;
	        }
	    }
	    return true; // No hay conflictos
	}
	
	

	@Override
	public String toString() {
		return "AgendaPersonal [usuario=" + usuario + ", reuniones=" + reuniones + "]";
	}
	
	
	
}
