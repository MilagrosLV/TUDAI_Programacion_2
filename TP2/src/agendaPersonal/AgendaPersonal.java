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
		if(!hayConflictoFecha(r)) {
			reuniones.add(r);
		} else {
			System.out.println(r.getTema()+" se superpone con otro evento. No puede agregarse a la agenda");
		}
	}
	public boolean hayConflictoFecha(Reunion r){
		for(Reunion rr : reuniones) {
			if(r.getFechaHoraInicio().getYear() == rr.getFechaHoraInicio().getYear() && r.getFechaHoraInicio().getMonthValue() == rr.getFechaHoraInicio().getMonthValue() && r.getFechaHoraInicio().getDayOfMonth() == rr.getFechaHoraInicio().getDayOfMonth()) {
				//Misma fecha --> comparo año, mes y día
				if(!seSuperponeHorario(r, rr)) { //Conflicto de hora en el mismo día
					return true;
				}
			}
		}
		return false;
	}
	public boolean seSuperponeHorario(Reunion r, Reunion rr) {
		return (r.getFechaHoraInicio().isAfter(rr.getFechaHoraFin()) || r.getFechaHoraFin().isBefore(rr.getFechaHoraInicio()));
	}
	
	
	
}
