package establecimientoDeportivo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EstablecimientoDeportivo {
	//ATRIBUTOS
	private List<Turno> turnos;
	
	//CONSTRUCTOR
	public EstablecimientoDeportivo() {
		this.turnos = new ArrayList<Turno>();
	}
	
	//METODOS
	public void agregarTurno(Turno t) {
		//Chequear conflicto
		
		turnos.add(t);
	}

	@Override
	public String toString() {
		return "EstablecimientoDeportivo [turnos=" + turnos + "]";
	}
	
	//Conflicto de turnos
	public boolean hayConflicto(Turno t) {
		for(Turno tt : turnos) {
			if(hayConflictoTurno(t.getFechaHorarioInicio(), t.getFechaHorarioFin(), tt.getFechaHorarioInicio(), tt.getFechaHorarioFin(), tt.getDisponibilidad()))        {
				return true;
			}
		}
		return false;
	}
	
	private boolean hayConflictoTurno(LocalDateTime fechaHorarioR, LocalDateTime fechaHorarioRR, LocalDateTime fechaHorarioFinR, LocalDateTime fechaHorarioFinRR, int disponibilidad){
		  if((fechaHorarioR.getYear() == fechaHorarioRR.getYear()) && (fechaHorarioR.getMonthValue() == fechaHorarioRR.getMonthValue()) && (fechaHorarioR.getDayOfMonth() == fechaHorarioRR.getDayOfMonth())){
			  //Coinciden fecha
			  if((fechaHorarioR.getHour() < fechaHorarioRR.getHour() && fechaHorarioFinR.getHour() <= fechaHorarioRR.getHour()) || (fechaHorarioR.getHour() >= fechaHorarioFinRR.getHour()) && (disponibilidad > 0)) {
		         return false; //Coinciden las fechas y hora, y hay disponibilidad
		       }
		       return true; //Coinciden las fechas y se solapan y no hay disponibilidad
		  }
		  return false; //No coinciden las fechas 
	}
	
}
