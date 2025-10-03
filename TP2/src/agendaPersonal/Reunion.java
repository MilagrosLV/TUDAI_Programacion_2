package agendaPersonal;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class Reunion {
	//ATRIBUTOS
	private String lugar, tema;
	private List<Persona> participantes;
	private int duracionHora;
	private LocalDateTime fechaHorario, fechaHorarioFin;
	
	
	//CONSTRUCTORES
	public Reunion(String lugar, String tema, int DuracionHora, LocalDateTime fechaHorario) {
		this.lugar = lugar;
		this.tema = tema;
		this.participantes = new ArrayList<Persona>();
		this.duracionHora = DuracionHora;
		this.setFechaHora(fechaHorario);
	}
	
	//GETTERS y SETTERS
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
	public int getDuracionHora() {
		return duracionHora;
	}
	public void setDuracionHora(int duracionHora) {
		this.duracionHora = duracionHora;
	}
	public LocalDateTime getFechaHora() {
		return fechaHorario;
	}
	public void setFechaHora(LocalDateTime fechaHorario) {
		this.fechaHorario = fechaHorario;
		fechaHorarioFin = fechaHorario.plusHours(duracionHora);
	}
	public LocalDateTime getFechaHoraFin() {
		return fechaHorarioFin;
	}


	//OTROS METODOS
	@Override
	public String toString() {
		return "Reunion [lugar=" + lugar + ", tema=" + tema + ", participantes=" + participantes + ", duracionMinutos="
				+ duracionHora + "]";
	}
	
	//Agregar participantes a la reunion
	public void agregarParticipante(Persona p) {
		participantes.add(p);
	}
	
	
	
	
	
}
