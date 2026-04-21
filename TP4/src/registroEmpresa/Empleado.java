package registroEmpresa;

import java.time.LocalDate;

public class Empleado extends Persona {
	private int legajo;
	private double sueldo;
	
	
	public Empleado(String nombre, String apellido, LocalDate dob, String cargo, int legajo, double sueldo) {
		super(nombre, apellido, dob, cargo);
		this.legajo = legajo;
		this.sueldo = sueldo;
	}


	public int getLegajo() {
		return legajo;
	}


	public double getSueldo() {
		return sueldo;
	}


	@Override
	public String toString() {
		return super.toString()+String.format(" | %-8s | %.2f", getLegajo(), getSueldo());
	}
	
	
}
