package agendaPersonal;

import java.util.ArrayList;
import java.time.*;
import java.util.List;

public class AgendaPersonal {
	//ATRIBUTOS
	private Persona duenio;
	private List<Reunion> reuniones;
	
	//CONSTRUCTORES
	public AgendaPersonal(Persona duenio) {
		this.duenio = duenio;
		this.reuniones = new ArrayList<Reunion>();
	}

	//GETTERS y SETTERS
	public Persona getDuenio() {
		return duenio;
	}
	public void setDuenio(Persona duenio) {
		this.duenio = duenio;
	}


	
	//OTROS METODOS
	@Override
	public String toString() {
		return "AgendaPersonal [duenio=" + duenio + ", reuniones=" + reuniones + "]";
	}
	
	
	//Agregar Reunion a la lista
	public void agregarReunion(Reunion r) {
		//Detectar conflictos de horarios
		if (hayConflicto(r)) {
			System.out.println("No se puede agregar la reunion de " +  r.getTema());
		} else {
			reuniones.add(r);
		}
	}
	
	//Detectar conflictos de horarios
	public boolean hayConflicto(Reunion r){
	  for(Reunion rr: reuniones){
	    if(hayConflictoReunion(r.getFechaHora() , rr.getFechaHora(), r.getFechaHoraFin(), rr.getFechaHoraFin())){
			System.out.println(r.getTema() + " conflictua con " + rr.getTema() + ". Busque arreglar conflicto de horarios.");
	    	return true;
	    }
	  }
	  return false;
	}
	
	private boolean hayConflictoReunion(LocalDateTime fechaHorarioR, LocalDateTime fechaHorarioRR, LocalDateTime fechaHorarioFinR, LocalDateTime fechaHorarioFinRR){
		  if((fechaHorarioR.getYear() == fechaHorarioRR.getYear()) && (fechaHorarioR.getMonthValue() == fechaHorarioRR.getMonthValue()) && (fechaHorarioR.getDayOfMonth() == fechaHorarioRR.getDayOfMonth())){
			  //Coinciden fecha
			  if((fechaHorarioR.getHour() < fechaHorarioRR.getHour() && fechaHorarioFinR.getHour() <= fechaHorarioRR.getHour()) || (fechaHorarioR.getHour() >= fechaHorarioFinRR.getHour())) {
		         return false; //Coinciden las fechas y no se solapan
		       }
		       return true; //Coinciden las fechas y se solapan
		  }
		  return false; //No coinciden las fechas 
	}
	
	
}
