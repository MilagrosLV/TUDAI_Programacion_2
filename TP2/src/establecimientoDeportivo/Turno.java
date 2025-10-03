package establecimientoDeportivo;


import java.time.*;
import java.util.ArrayList;

public class Turno {
	//ATRIBUTOS
	private LocalDateTime fechaHorarioInicio, fechaHorarioFin, fechaHoraActual = LocalDateTime.now();
	private int duracionHora;
	private String tipo, usuario;
	private boolean hayDisponibiliada;
	private ArrayList<Cancha> canchas = new ArrayList<Cancha>();

	//CONSTRUCTORES
	public Turno(LocalDateTime fechaHorarioInicio, int duracionHora, String tipo, String usuario) {
		this.duracionHora = duracionHora;
		this.setFechaHorarioInicio(fechaHorarioInicio);
		this.setTipo(tipo);
		this.usuario = usuario;

	}

	//GETTERS y SETTERS
	public LocalDateTime getFechaHorarioInicio() { //fechaHorarioInicio
		return fechaHorarioInicio;
	}
	public void setFechaHorarioInicio(LocalDateTime fechaHorarioInicio) {
		this.fechaHorarioInicio = fechaHorarioInicio;
		fechaHorarioFin = fechaHorarioInicio.plusHours(duracionHora);
	}

	public int getDuracionHora() { //duracionHora
		return duracionHora;
	}
	public void setDuracionHora(int duracionHora) {
		this.duracionHora = duracionHora;
	}

	public LocalDateTime getFechaHorarioFin() { //fechaHorarioFin
		return fechaHorarioFin;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		//chequear correctamente el tipo de cancha
		for(Cancha c : canchas) {
			if((c.getTipo()).equalsIgnoreCase(tipo)) {
				this.tipo = tipo;
			}
		}
	}
	public Cancha getTipoCancha() {
		//convocar cancha
		for(Cancha c : canchas) {
			if((c.getTipo()).equalsIgnoreCase(tipo)) {
				return c;
			}
		}
		return null;
	}

	public String getUsuario() { //USUARIO
		return usuario;
	}
	public void setUsuario(String usuario) {
		if()
		this.usuario = usuario;
	}
	
	
	public boolean hayDisponibilidad() {
		if((getTipoCancha()).getDisponibilidad() >= 1) {
			return true;
		}
		return false;
	}
	public void setDisponibiliada(boolean hayDisponibiliada) {
		if(hayDisponibilidad()) {
			(getTipoCancha()).setDisponibilidad((getTipoCancha()).getDisponibilidad() - 1);
		}
		this.hayDisponibiliada = hayDisponibiliada;
	}

	//OTROS METODOS
	public void agregarCancha(Cancha c) {
		canchas.add(c);
	}
	
	//Precio del turno
	public double getPrecioTurno(Turno r) {
		
	}
	
	//Disponibilidad de cancha
	public int getDisponibilidad() {
		return (getTipoCancha()).getDisponibilidad();
	}
	

	
}
