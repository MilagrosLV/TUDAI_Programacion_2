package modernizandoSobreroSeleccionador;

import java.util.ArrayList;

public class Alumno {
	//ATRIBUTOS
	private String nombre;
	private ArrayList <Cualidad> cualidades;
	private ArrayList<Alumno> familiares;
	private Casa c;
	
	//CONSTRUCTORES
	public Alumno(String nombre, ArrayList<Cualidad> cualidades, ArrayList<Alumno> familiares, Casa c) {
		setNombre(nombre);
		this.cualidades = cualidades;
		this.familiares = familiares;
		this.c = c;
	}
	public Alumno(String nombre, ArrayList<Cualidad> cualidades, Casa c) {
		setNombre(nombre);
		this.cualidades = cualidades;
		this.c = c;
	}
	public Alumno(String nombre, ArrayList<Cualidad> cualidades, ArrayList<Alumno> familiares) {
		setNombre(nombre);
		this.cualidades = cualidades;
		this.familiares = familiares;
	}
	public Alumno(String nombre, ArrayList<Cualidad> cualidades) {
		setNombre(nombre);
		this.cualidades = cualidades;
	}
	//MÉTODOS GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Cualidad> getCualidades() {
		return new ArrayList<Cualidad>(cualidades);
	}
	public ArrayList<Alumno> getFamiliares() {
		return new ArrayList<Alumno>(familiares);
		
	}
	public void actualizarFamiliares(Alumno a) {
		if(this.getFamiliares().contains(a)) {
			a.agregarFamiliar(this);
		}
	}
	public Casa getCasa() {
		Casa copiaC = c;
		return copiaC;
	}
	
	//OTROS MÉTODOS 
	public void agregarCualidad(Cualidad c) {
		boolean repetido=false;
		if(cualidades != null) {
			for(Cualidad cc : cualidades) {
				if(cc.equals(c)) {
					repetido = true;
					System.out.println("Esta cualidad se repite");
				}
			}
		}
		if (!repetido) {
			cualidades.add(c);
		}
	}

	public void agregarFamiliar(Alumno f) {
		boolean repetido=false;
		if(familiares != null) {
			for(Alumno ff : familiares) {
				if(ff.equals(f)) {
					repetido = true;
					System.out.println("Este familiar se repite");
				}
			}
		}
		if (!repetido) {
			familiares.add(f);
		}
	}
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", cualidades=" + cualidades + ", familiares=" + familiares + ", c=" + c
				+ "]";
	}
	
	
	
}
