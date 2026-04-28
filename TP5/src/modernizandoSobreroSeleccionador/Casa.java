package modernizandoSobreroSeleccionador;

import java.util.ArrayList;

/**
 * Clase abstracta que representa una casa de Hogwarts.
 * Cada casa tiene un nombre, cantidad máxima de alumnos, 
 * un conjunto de cualidades requeridas y un conjunto de alumnos.
 */
public abstract class Casa {
	//ATRIBUTOS
	private String nombre;
	private int cant_max_alumnos;
	private ArrayList<Cualidad> cualidades;
	private ArrayList<Alumno> alumnos;
	
	
	//CONSTRUCTOR
	public Casa(String nombre, int cant_max_alumnos, ArrayList<Cualidad> cualidades) {
		this.nombre = nombre;
		setCant_max_alumnos(cant_max_alumnos);
		this.cualidades = cualidades;
		this.alumnos = new ArrayList<>();
	}
	//MÉTODOS getters Y setters
	public String getNombre() {
		return this.nombre;
	}
	public ArrayList<Alumno> getAlumnos() {
		return new ArrayList<Alumno>(alumnos);
	}
	public int getCant_max_alumnos() {
		return cant_max_alumnos;
	}
	public void setCant_max_alumnos(int cant_max_alumnos) {
		this.cant_max_alumnos = cant_max_alumnos;
	}
	public ArrayList<Cualidad> getCualidades() {
		return new ArrayList<Cualidad>(cualidades);
	}
	
	//OTROS MÉTODOS
	public int cantAlumnos() {
		return this.getAlumnos().size();
	}
	public boolean isLlena() {
		return (cantAlumnos()>=getCant_max_alumnos());
	}
	
	public void agregarAlumno(Alumno a) {
		boolean repetido=false;
		for(Alumno aa : getAlumnos()) {
			if(aa.equals(a)) {
				repetido = true;
				System.out.println("Este alumne ya ha sido sorteado");
			}
		}
		if (!repetido) {
			this.alumnos.add(a);
			a.agregarCasa(this);
		}
	}
	
	public boolean cumpleCualidades(Alumno a) {
		return (a.getCualidades().containsAll(this.cualidades));
	}
	
	public void asignar(Alumno a) {
		if(cumpleCondiciones(a)) {
			this.agregarAlumno(a);
			System.out.println(a.getNombre()+" "+this.getNombre()+"!!!");
		}
	}
	public abstract boolean cumpleCondiciones(Alumno a);
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Casa other = (Casa) obj;
		return nombre.equals(other.nombre);
	}
	
	@Override
	public int hashCode() {
		return nombre.hashCode();
	}
	
	@Override
	public String toString() {
		return "Casa [nombre=" + nombre + ", cant_max_alumnos=" + cant_max_alumnos + ", cualidades=" + cualidades
				+ ", alumnos=" + alumnos + "]";
	}
	
	
	
	
	
}
