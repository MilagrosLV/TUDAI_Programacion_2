package modernizandoSobreroSeleccionador;

import java.util.ArrayList;

public class Alumno {
	//ATRIBUTOS
	private String nombre;
	private ArrayList <Cualidad> cualidades;
	private ArrayList<Alumno> familiares;
	private Casa c;
	
	//CONSTRUCTORES
	public Alumno(String nombre, ArrayList<Cualidad> cualidades) {
		setNombre(nombre);
		this.cualidades = cualidades;
		this.familiares = new ArrayList<>();
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
	public Casa getCasa() {
		return c;
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
			this.familiares.add(f);
			for(Alumno ff : f.getFamiliares()) {
				if(ff.equals(this)) {
					repetido = true;
					System.out.println("Este familiar se repite");
				}
			}
			if(!repetido) {
				f.familiares.add(this);
			}
		}
	}
	
	public void agregarCasa(Casa casa) {
		// TODO Auto-generated method stub
		this.c = casa;
	}

	}
	
	
	
	
}
