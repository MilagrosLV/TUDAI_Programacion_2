package sistemaControlGastosPublicos;

public class Impuesto {
	private String nombre;
	private double montoHabitante;
	
	//CONSTRUCTOR
	public Impuesto(String nombre, double montoHabitante) {
		setNombre(nombre);
		setMontoHabitante(montoHabitante);
	}

	//GETTERS AND SETTERS METHODS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getMontoHabitante() {
		return montoHabitante;
	}
	public void setMontoHabitante(double montoHabitante) {
		this.montoHabitante = montoHabitante;
	}

}
