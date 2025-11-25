package sitioDeVideos;

import java.util.ArrayList;

public class Video extends ElementoVideo implements Comparable<Video>{
	//Atributes
	private String titulo;
	private Usuario usuario;
	private int duracion_seg, cant_visualizaciones, cant_me_gusta, cant_no_me_gusta, anio_publicacion;
	private ArrayList <String> palabras_clave;
	
	//Constructor
	public Video(String titulo, Usuario usuario, int duracion_seg, int cant_visualizaciones, int cant_me_gusta,
			int cant_no_me_gusta, int anio_publicacion) {
		this.titulo = titulo;
		this.usuario = usuario;
		this.duracion_seg = duracion_seg;
		this.cant_visualizaciones = cant_visualizaciones;
		this.cant_me_gusta = cant_me_gusta;
		this.cant_no_me_gusta = cant_no_me_gusta;
		this.anio_publicacion = anio_publicacion;
		this.palabras_clave = new ArrayList<String>();
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracionSeg() {
		return duracion_seg;
	}
	public void setDuracionSeg(int duracion_seg) {
		this.duracion_seg = duracion_seg;
	}
	
	public int getCant_visualizaciones() {
		return cant_visualizaciones;
	}
	public void setCant_visualizaciones(int cant_visualizaciones) {
		this.cant_visualizaciones = cant_visualizaciones;
	}

	public int getCant_me_gusta() {
		return cant_me_gusta;
	}
	public void setCant_me_gusta(int cant_me_gusta) {
		this.cant_me_gusta = cant_me_gusta;
	}

	public int getCant_no_me_gusta() {
		return cant_no_me_gusta;
	}
	public void setCant_no_me_gusta(int cant_no_me_gusta) {
		this.cant_no_me_gusta = cant_no_me_gusta;
	}

	public int getAnio_publicacion() {
		return anio_publicacion;
	}
	public void setAnio_publicacion(int anio_publicacion) {
		this.anio_publicacion = anio_publicacion;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	
	public ArrayList<String> getPalabrasClave(){
		ArrayList<String> copiaPalabrasClave = new ArrayList<>(this.getPalabrasClave());
		return copiaPalabrasClave;
	}
	public void agregarPalabraClave(String pc) {
		/*if (!this.getPalabrasClave().contains(pc.toLowerCase())) {
			palabras_clave.add(pc);
		}*/
		if(!tienePalabraClave(pc)) {
			palabras_clave.add(pc);
		}
	}
	public boolean tienePalabraClave(String pc) {
		return this.getPalabrasClave().contains(pc.toLowerCase());
	}

	@Override
	public ArrayList<Video> buscar(Filtro ff) {
		ArrayList<Video> videos = new ArrayList<>();
		
		if (ff.cumple(this)) {
			videos.add(this);
		}
		
		return videos;
	}

	@Override
	public int compareTo(Video o) {	
		return usuario.compareTo(o.getUsuario());
	}

	@Override
	public int contarVideos() {
		return 1;
	}
	
	
}
