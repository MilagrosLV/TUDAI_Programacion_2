package sistemaDeEncuestas1;

import java.util.ArrayList;

public class Empleado extends Persona {
	private double sueldo;
	private ArrayList<Encuesta> encuestas;
	
	public Empleado(String nombre, String dni, double sueldo) {
		super(nombre, dni);
		this.sueldo = sueldo;
		this.encuestas = new ArrayList<>();
	}

	public double getSueldo() {
		return sueldo+getCantEn();
	}
	public ArrayList<Encuesta> getEncuestas() {
		return encuestas;
	}
	public int getCantEn() {
		return getEncuestas().size();
	}
	
	public void addEncuesta(Encuesta e) {
			getEncuestas().add(e);
	}

	@Override
	public String toString() {
		return "Empleado [getNombre()="+getNombre()+", getDni()="+getDni()+", getSueldo()="+getSueldo()+", getCantEn()=" +getCantEn()+"]";
	}
	
	
	

}
