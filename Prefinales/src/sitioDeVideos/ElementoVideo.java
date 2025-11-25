package sitioDeVideos;

import java.util.ArrayList;

public abstract class ElementoVideo {
	private String titulo;
	
	//Metodos
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	
	public abstract ArrayList<String> getPalabrasClave();
	public abstract int contarVideos();
	public abstract int getDuracionSeg();
	
	
	//Busqueda de listas
	public abstract ArrayList<Video> buscar (Filtro ff);
	@Override
    public abstract String toString();
}
