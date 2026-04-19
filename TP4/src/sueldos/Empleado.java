package sueldos;

public class Empleado {
	private String nombre;
	private double sueldoBase;
	
	//Constructor
	public Empleado(String nombre, double sueldoBase) {
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
	}
	
	//getters
	public String getNombre() {
		return nombre;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	
	//otro método
	public double calcularSueldo() {
		return getSueldoBase();
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", calcularSueldo()=" + calcularSueldo() + "]";
	}
	
	
	
}
