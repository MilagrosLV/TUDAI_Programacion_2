package establecimientoDeportivo1;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Usuario {
	private final int MESES_SOCIO=2, MIN_TURNOS_SOCIO=4;
	private String nombre;
	private ArrayList<Turno>turnos;
	
	
	public Usuario(String nombre) {
		this.nombre = nombre;
		this.turnos = new ArrayList<>();
	}
	
	//Métodos
	public boolean isSocio() {
		LocalDateTime ahora = LocalDateTime.now();
		int contador = 0;
		for(Turno t : turnos) {
			if(t.getFechaHoraI().isAfter(ahora.minusMonths(MESES_SOCIO))) {
				contador++;
			}
		}
		return contador++ >= MIN_TURNOS_SOCIO;
	}
	
	public void addTurno(Turno t) {
		this.turnos.add(t);
	}

	
	//Getter
	public String getNombre() {
		return nombre;
	}
}
