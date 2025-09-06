package agendaPersonal;

import java.time.*;
import java.util.ArrayList;

public class Reunion {
	private String lugar, tema;
	private LocalTime duracion;
	private LocalDateTime fechaHoraInicio, fechaHoraFin;
	private ArrayList<Persona> participantes;
	
	
	public Reunion(String lugar, String tema, LocalTime duracion, LocalDateTime fechaHoraInicio) {
		setLugar(lugar);
		setTema(tema);
		setDuracion(duracion);
		setFechaHoraInicio(fechaHoraInicio);
		this.fechaHoraFin = crearFechaHoraFin(duracion, fechaHoraInicio);
		this.participantes = new ArrayList<>();
	}

	//GETTERS AND SETTERS METHODS
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public LocalTime getDuracion() {
		return duracion;
	}
	public void setDuracion(LocalTime duracion) {
		this.duracion = duracion;
	}
	public LocalDateTime getFechaHoraInicio() {
		return fechaHoraInicio;
	}
	public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
		this.fechaHoraInicio = fechaHoraInicio;
	}
	public LocalDateTime getFechaHoraFin() {
		return fechaHoraFin;
	}

	
	//OTHER METHODS
	public LocalDateTime crearFechaHoraFin(LocalTime duracion, LocalDateTime fechaHoraInicio) {
		return fechaHoraInicio.plusHours(duracion.getHour()).plusMinutes(duracion.getMinute());
	}
	public void agregarPersona(Persona p) {
		int cantPersonaRepetida = 0;
		for(Persona pp : participantes) {
			if(p.equals(pp)) {
				System.out.println("Este participante ya se anotó");
				cantPersonaRepetida++;
			}
		}
		if(cantPersonaRepetida < 0) {
			System.out.println("No se pudo agregar al participante");
		} else {
			participantes.add(p);
		}
	}

	@Override
	public String toString() {
		return "Reunion [lugar=" + lugar + ", tema=" + tema + ", duracion=" + duracion + ", fechaHoraInicio="
				+ fechaHoraInicio + ", fechaHoraFin=" + fechaHoraFin + ", participantes=" + participantes + "]";
	}

	
	
	
}
