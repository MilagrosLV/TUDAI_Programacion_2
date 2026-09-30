package streaming;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public class Pelicula {
	//ATRIBUTOS;
	private final String titulo, sinopsis, director;
	private final List<String> generos; 
	private final List<String> actores;
	private final int anioEstreno, duracionMinuto, edadMinima;
	
	//CONSTRUCTOR
	public Pelicula (String titulo, String sinopsis, String director, int anioEstreno, int duracion, int edadMinima) {
	    this.titulo = titulo.toLowerCase();
	    this.sinopsis = sinopsis;
	    this.director = director.toLowerCase();
	    this.anioEstreno = anioEstreno;
	    this.duracionMinuto = duracion;
	    this.edadMinima = edadMinima;
	    generos = new ArrayList<>();
	    actores = new ArrayList<>();
	}

	//has
	public boolean tieneGenero(String g) {
		if(g==null) throw new NullPointerException("No se puede saber si tiene el genero. Es nulo.");
		return generos.contains(g.toLowerCase());
	}
	public boolean tieneActor(String g) {
		if(g==null) throw new NullPointerException("No se puede saber si tiene el Actor. Es nulo.");
		return actores.contains(g.toLowerCase());
	}
	//add
	public void agregarGenero(String g) {
		if(g==null) throw new NullPointerException("No se puede agregar genero. Es nulo.");
		if(!generos.contains(g)) generos.add(g.toLowerCase());
	}
	public void agregarActor(String g) {
		if(g==null) throw new NullPointerException("No se puede agregar Actor. Es nulo.");
		if(!actores.contains(g)) actores.add(g.toLowerCase());
	}
	//remove
	public void eliminarGenero(String g) {
		if(g==null) throw new NullPointerException("No se puede eliminar genero. Es nulo.");
		if(generos.contains(g)) generos.remove(g.toLowerCase());
	}
	public void eliminarActor(String g) {
		if(g==null) throw new NullPointerException("No se puede eliminar Actor. Es nulo.");
		if(actores.contains(g)) actores.remove(g.toLowerCase());
	}
	
	//getters
	public String getTitulo() {
		return titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public String getDirector() {
		return director;
	}

	public List<String> getGeneros() {
		return generos;
	}

	public List<String> getActores() {
		return actores;
	}

	public int getAnioEstreno() {
		return anioEstreno;
	}

	public int getDuracionMinuto() {
		return duracionMinuto;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	@Override
	public boolean equals(Object o) {
		try {
			Pelicula p=(Pelicula)o;
			return p.getTitulo().equals(this.getTitulo()) 
					&& p.getDirector().equals(this.getDirector() )
					&& p.getDuracionMinuto()==this.getDuracionMinuto()
					&& p.getAnioEstreno()==this.getAnioEstreno();
		} catch (Exception e) {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(titulo, director, duracionMinuto, anioEstreno);
	}
	
	
}
