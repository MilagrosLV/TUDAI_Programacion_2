package sueldos2;

import java.util.Objects;

public abstract class Empleado {
	private String nombre;
	private double sueldoFijo;
	
	public Empleado(String nombre, double sueldoFijo) {
		this.nombre=nombre;
		this.sueldoFijo=sueldoFijo;
	}

	//getters
	public String getNombre() {return nombre;}
	public double getSueldoFijo() {return sueldoFijo;}
	
	public abstract double getSueldoTotal();

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Empleado ["+nombre + ", SueldoTotal= $" + getSueldoTotal() + "]";
	}
	
	
	
}
