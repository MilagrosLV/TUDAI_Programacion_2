package sistemaDeEncuestas1;

import java.util.Objects;

public class Persona {
	private String nombre, dni;
	
	public Persona(String nombre, String dni) {
		this.nombre=nombre;
		this.dni=dni;
	}
	
	//getters
	public String getNombre() {return this.nombre;}
	public String getDni() {return this.dni;}
	
	@Override
	public boolean equals(Object o) {
		if(this==o) return true;
		if (this == null || this.getClass() != o.getClass()) return false;
		Persona p = (Persona)o;
		return Objects.equals(this.nombre, p.nombre) && Objects.equals(this.dni, p.dni);
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre, dni);
	}
	
}
