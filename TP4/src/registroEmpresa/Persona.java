package registroEmpresa;

import java.time.LocalDate;
import java.time.Period;

public abstract class Persona {
	private String nombre, apellido, cargo;
	private LocalDate dob;

	public Persona(String nombre, String apellido, LocalDate dob, String cargo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dob = dob;
		this.cargo = cargo;
	}

	//getters
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	
	public String getNombreApellido() {
		return getNombre()+" "+getApellido();
	}

	public int getEdad() {
		LocalDate ahora = LocalDate.now();
		return Period.between(dob, ahora).getYears();
	}

	public String getCargo() {
		return cargo;
	}

	@Override
	public String toString() {
		// %-15s: Reserva 15 espacios para el texto, alineado a la izquierda
		// %-20s: Reserva 20 espacios para el nombre completo
		return String.format("%-15s | %-25s | %d años", 
							getCargo(), getNombreApellido(), getEdad());
	}
	
	
}
