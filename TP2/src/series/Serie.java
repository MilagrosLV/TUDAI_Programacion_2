package series;

import java.util.ArrayList;

public class Serie {
	//ATTRIBUTES
	private String titulo, descripcion, creador, genero;
	private int cantEpVistos=0, cantMaxTemp, cantTemp = 0;
	private ArrayList<Temporada> temporadas;
	
	//CONSTRUCTOR
	public Serie(String titulo, String descripcion, String creador, String genero, int cantMaxTemp) {
		this.cantMaxTemp = cantMaxTemp;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
		this.temporadas = new ArrayList<>(this.cantMaxTemp);
	}

	//GETTERS AND SETTERS METHODS
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}


	//OTHER METHODS
	public void agregarTemporada(Temporada e) {
		if(cantTemp<cantMaxTemp) {
			temporadas.add(cantTemp, e);
			this.cantTemp++;
		} else {
			System.out.println("No se pudo agregar la Temp a la Serie");
		}
	}
	
	public int cantEpVistosSerie() {
		for(Temporada tt : temporadas) {
			cantEpVistos += tt.cantEpVistosTemp();
		}
		return cantEpVistos;
	}
	
	public double promedioCalifTemp(){
		double sumaEp = 0;
		for(Temporada tt : temporadas) {
			sumaEp += (tt.cantEpVistosTemp()*tt.promedioCalifEp());
		}
		return sumaEp/this.cantEpVistosSerie();
	}
	
	public boolean seVieronTodosEp() {
		int tempVista = 0;
		for(Temporada tt : temporadas) {
			if(tt.todosEpVistos())
				tempVista++;
		}
		return tempVista==cantTemp;
	}
	
}
