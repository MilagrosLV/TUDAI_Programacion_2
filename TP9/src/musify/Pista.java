package musify;

import java.util.ArrayList;
import java.util.List;

public class Pista extends Elemento{
	private static int id=0;
	private String titulo, artista, tituloAlbum, genero;
	private int duracionSeg, anio;
	//constructor
	public Pista(String titulo, String artista, String tituloAlbum, String genero, int duracionSeg, int anio) {
		id++;
		this.titulo = titulo;
		this.artista = artista;
		this.tituloAlbum = tituloAlbum;
		this.genero = genero;
		this.duracionSeg = duracionSeg;
		this.anio = anio;
	}
	//getters y setters
	public int getID() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getTituloAlbum() {
		return tituloAlbum;
	}
	public void setTituloAlbum(String tituloAlbum) {
		this.tituloAlbum = tituloAlbum;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	@Override
	public int getDuracionSeg() {
		return duracionSeg;
	}
	public void setDuracionSeg(int duracionSeg) {
		this.duracionSeg = duracionSeg;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	@Override
	public List<Pista> buscar(Filtro f) {
		List<Pista> pista = new ArrayList<>();
		if(f.cumple(this)) pista.add(this);
		return pista;
	}
	
	
}
