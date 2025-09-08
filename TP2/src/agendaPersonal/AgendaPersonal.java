package agendaPersonal;

import java.util.ArrayList;

public class AgendaPersonal {
	private Persona usuario;
	private int cantReuniones = 0;
	private ArrayList<Reunion> reuniones;
	
	
	public AgendaPersonal(Persona usuario) {
		this.usuario = usuario;
		this.reuniones = new ArrayList<>(10);
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
			reuniones.add(cantReuniones, r);
			this.cantReuniones++;
		} else {
			System.out.println(r.getTema()+" no se puede agregarse a la agenda");
		}
	}
	public boolean noHayConflicto(Reunion r){
		for(Reunion rr : reuniones) {
			System.out.println("Recorro Lista");
			if (r.getFechaHoraInicio().isAfter(rr.getFechaHoraFin()) || r.getFechaHoraFin().isBefore(rr.getFechaHoraInicio())) {
				System.out.println("Recorro Lista NO HAY CONFLICTO");
				return true;
			}
			/*if(r.getFechaHoraInicio().getYear() == rr.getFechaHoraInicio().getYear() && r.getFechaHoraInicio().getMonthValue() == rr.getFechaHoraInicio().getMonthValue() && r.getFechaHoraInicio().getDayOfMonth() == rr.getFechaHoraInicio().getDayOfMonth()) {
				//Misma fecha --> comparo año, mes y día
				if(noSeSuperponeHorario(r, rr)) { //Si no hay conflicto de hora en el mismo día
					return false;
				}
			}*/
		}
		System.out.println("No Recorro Lista");

		return false;
	}
	/*public boolean noSeSuperponeHorario(Reunion r, Reunion rr) {
		return (r.getFechaHoraInicio().isAfter(rr.getFechaHoraFin()) || r.getFechaHoraFin().isBefore(rr.getFechaHoraInicio()));
	}*/
	
	
	
}
