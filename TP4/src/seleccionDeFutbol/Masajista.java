package seleccionDeFutbol;

import java.time.LocalDate;
import java.time.Period;

public class Masajista extends Integrante {
	private String titulo;
	private LocalDate fechaInicioEjercicio;
	
	
	public Masajista(String nombre, String apellido, String nroPasaporte, LocalDate dob, Estado e, String titulo,
			LocalDate fechaInicioEjercicio) {
		super(nombre, apellido, nroPasaporte, dob, e);
		this.titulo = titulo;
		this.fechaInicioEjercicio = fechaInicioEjercicio;
	}
	
	//getters
	public String getTitulo() {
		return titulo;
	}
	public LocalDate getFechaInicioEjercicio() {
		return fechaInicioEjercicio;
	}
	public int getAniosExperiencia() {
		LocalDate ahora =  LocalDate.now();
		return Period.between(getFechaInicioEjercicio(), ahora).getYears();
	}
	
	
}
