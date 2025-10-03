package series;

import java.util.ArrayList;
import java.util.List;

public class Serie {

    private String titulo;
    private String descripcion;
    private String autor;
    private String genero;
    private List<Temporada> temporadas;

    public Serie(String titulo, String descripcion, String autor, String genero){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.autor = autor;
        this.genero = genero;
        this.temporadas = new ArrayList<Temporada>();
    }

     
    //GETTERS Y SETTERS
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

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<Temporada> getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(List<Temporada> temporadas) {
		this.temporadas = temporadas;
	}

     //OTROS METODOS
     public int cantVistosTemporada(int numTemporada){
         //Devolver la cantidad de episodios vistos para un numero de temporada
         return temporadas.get(numTemporada).cantEpisodiosVistos();
     }

      public int cantVistos(){
         int cantEpisodios = 0;
         for (Temporada t : temporadas) {//Para cada Temporada t, que esta en this.temporadas
                 cantEpisodios += t.cantEpisodiosVistos();
         }
         return cantEpisodios;
     }
  	public double promedioCalifTemporada( int numTemporada){
        //Devolver el promedio de calificaciones para una temporada
        return temporadas.get(numTemporada).promedioCalificacionesEpisodiosVistos();
    }

     public double promedioCalifSerie(){
        //Devolver el promedio de calificaciones de toda la serie
    	double sumaCalificacionesTemp = 0;
    	for(Temporada t : temporadas) {
    		sumaCalificacionesTemp += t.promedioCalificacionesEpisodiosVistos();
    	}
        return (sumaCalificacionesTemp/temporadas.size());
     }
     
     public boolean seVioTodaLaSerie() {
    	 boolean seVio = true;
    	 for(Temporada t : temporadas) {
    		 if(!t.seVioTodaLaTemporada()) {
    				 seVio = false;
    		 }
    	 }
    	 return seVio;
     }
     
     
     
     public void agregarTemporada(Temporada t) {
    	 //Agregar Temporada
    	 temporadas.add(t);
     }

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", descripcion=" + descripcion + ", autor=" + autor + ", genero=" + genero
				+ ", temporadas=" + temporadas + "]";
	}
     



}