package series;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
	private String titulo;
    private List<Episodio> episodios;
    
    //CONSTRUCTORES
    public Temporada(String titulo){
    	this.titulo = titulo;
        this.episodios = new ArrayList<Episodio>();
    }

    //GETTERS y SETTERS
	public List<Episodio> getEpisodios() {
		return episodios;
	}

	public void setEpisodios(List<Episodio> episodios) {
		this.episodios = episodios;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	//OTROS METODOS
    public void agregarEpisodio(Episodio e){
    	this.episodios.add(e);
    }

    public int cantEpisodiosVistos(){
        //Devolver la cantidad de capitulo que tiene mi temporada
    	int cantEpisodiosVistos = 0;
    	for(Episodio e : episodios) {
    		if (e.isVisto()) {
    			cantEpisodiosVistos++;
    		}
    	}
        return cantEpisodiosVistos;


    }

    public double promedioCalificacionesEpisodiosVistos(){
        //Devuelve el promedio de calificaciones de los episodios vistos de mi temporada y tiene sólo en cuenta los episodios vistos
    	int sumaCalificaciones = 0;
    	for(Episodio e : episodios) {
    		if(e.isVisto()) {
    			sumaCalificaciones += e.getCalificacion();
    		}
    	}
        return (sumaCalificaciones/episodios.size());
    }
    
    public boolean seVioTodaLaTemporada() {
    	boolean seVio = true;
	 		for(Episodio e : episodios) {
   	 			if(!e.isVisto()) {
   	 				seVio = false;
   	 			}
   	 		}
   	 	return seVio;
    }

	@Override
	public String toString() {
		return "Temporada [titulo=" + titulo + ", episodios=" + episodios + "]";
	}
    

}