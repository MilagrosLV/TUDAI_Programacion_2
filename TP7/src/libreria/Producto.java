package libreria;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Producto {
	private String nombre, autor, resumen;
	private Calculador calculador;
	private int cantPP;
	private Set<String> generos;
	
	public Producto(String nombre, String autor, String resumen, Calculador calculador, int cantPP) {
		if(nombre == null || autor == null || resumen == null) throw new IllegalArgumentException("Nombre, autor o resumen no pueden ser nulos.");
		this.nombre=nombre.toLowerCase();
		this.autor=autor.toLowerCase();
		this.calculador=calculador;
		this.resumen=resumen;
		this.cantPP=cantPP;
		generos = new HashSet<>();
	}

	//getters
	public String getNombre() {return nombre;}
	public String getAutor() {return autor;}
	public String getResumen() {return resumen;	}
	public double getPrecio() {return calculador.getPrecio(this);	}
	public int getCantPP() {return cantPP;	}
	public int getCantGeneros(){return generos.size();}
	
	//setters
	public void setCalculador(Calculador calculador) { this.calculador=calculador;}
	
	
	//add a generos
	public void agregarGenero(String genero) {
		if(genero == null) throw new NullPointerException("No se puede agregar porque es nulo.");
		generos.add(genero.toLowerCase());
	}
	
	//remove de generos
	public void eliminarGenero(String genero) {
		if(genero==null) throw new NullPointerException("No se puede eliminar porque el genero en nulo.");
		generos.remove(genero);
	}
	
	//tienen el genero
	public boolean tieneGenero(String genero) {
		if(genero == null) throw new NullPointerException("No se puede saber si existe en la lista porque es nulo.");
		return generos.contains(genero);
	}
	
	
	@Override
	public boolean equals(Object o) {
		try {
			Producto p = (Producto)o;
			return this.getNombre().equals(p.getNombre()) && this.getAutor().equals(p.getAutor());
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre, autor);
	}
	
	
	
	
}
