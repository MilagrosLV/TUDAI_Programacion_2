package agendaPersonal;

import java.time.*;
import java.util.ArrayList;

public class Reunion {
	private String lugar, tema;
	private LocalTime duracion;
	private LocalDateTime fechaHoraInicio, fechaHoraFin;
	private ArrayList<Persona> participantes;
	
	
	public Reunion(String lugar, String tema, LocalTime duracion, LocalDateTime fechaHoraInicio) {
		this.lugar = lugar;
		this.tema = tema;
		this.duracion = duracion;
		this.fechaHoraInicio = fechaHoraInicio;
		this.fechaHoraFin = ;
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
	

	
	
	
}
