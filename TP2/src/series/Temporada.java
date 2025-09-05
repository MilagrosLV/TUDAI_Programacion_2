package series;

import java.util.ArrayList;

public class Temporada {
	//ATTRIBUTES
	private ArrayList<Episodio> episodios;
	private int cantEpisodios = 0, cantMaxEp, cantEpVistos=0;
	
	//CONSTRUCTOR
	public Temporada(int cantMaxEp) {
		this.cantMaxEp = cantMaxEp;
		this.episodios = new ArrayList<>(this.cantMaxEp);
	}



	//OTHER METHODS
	public void agregarEpisodio(Episodio e) {
		if(cantEpisodios<cantMaxEp) {
			episodios.add(cantEpisodios, e);
			cantEpisodios++;
		} else {
			System.out.println("No se pudo agregar el Ep a la Temp");
		}
	}
	public int cantEpVistosTemp() {
		for(Episodio ee : episodios) {
			if(ee.isVisto()) {
				cantEpVistos++;
			}
		}
		return cantEpVistos;
	}
	public double promedioCalifEp(){
		double suma = 0;
		for(Episodio ee : episodios) {
			if(ee.isVisto()) {
				suma += ee.getCalificacion();			}
		}
		return suma/this.cantEpVistosTemp();
	}
	
	public boolean todosEpVistos() {
		return cantEpVistosTemp()==cantEpisodios;
	}
	
	
	
	
	
}
