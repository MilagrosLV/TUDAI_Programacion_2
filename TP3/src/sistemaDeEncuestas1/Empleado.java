package sistemaDeEncuestas1;

import java.util.ArrayList;
import java.util.Objects;

public class Empleado {
	private String nombre;
	private double sueldo;
	private ArrayList<Encuesta> encuestas;
	
	public Empleado(String nombre, double sueldo) {
		this.nombre=nombre;
		this.sueldo=sueldo;
		this.encuestas= new ArrayList<Encuesta>();
	}
	
	//getters
	public String getNombre() {return this.nombre;}
	public double getSueldoBase() {return this.sueldo;}
	public double getSueldoTotal() {return getSueldoBase()+calcularPlus();}
	
	//adders
	public void addEncuesta(Encuesta e) {
		if(!encuestas.contains(e)) encuestas.add(e); //Sobreescribo equals y el hashCode en Encuesta
	}
	
	//otros métodos
	public int cantEncuestas() { return encuestas.size();}
	public double calcularPlus() {return (double)cantEncuestas()*10;}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || this.getClass()!=o.getClass()) return false;
		Empleado e = (Empleado)o;
		return Objects.equals(this.nombre,  e.nombre) && Objects.equals(this.sueldo, e.sueldo) && Objects.equals(this.encuestas,  e.encuestas);
	}

}
