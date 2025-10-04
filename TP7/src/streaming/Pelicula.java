package streaming;

import java.util.List;
import java.util.ArrayList;

public class Pelicula {
	//ATRIBUTOS;
	private final String titulo, sinopsis, director;
	private final List<String> generos; 
	private final List<String> actores;
	private final int anioEstreno, duracion, edadMinima;
	
	//CONSTRUCTOR
	public Pelicula (String titulo, String sinopsis, String director, int anioEstreno, int duracion, int edadMinima) {
	    this.titulo = titulo;
	    this.sinopsis = sinopsis;
	    this.director = director;
	    this.anioEstreno = anioEstreno;
	    this.duracion = duracion;
	    this.edadMinima = edadMinima;
	    generos = new ArrayList<>();
	    actores = new ArrayList<>();
	}

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

	public int getDuracion() {
		return duracion;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	
	
}
