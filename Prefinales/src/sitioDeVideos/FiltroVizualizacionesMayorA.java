package sitioDeVideos;

public class FiltroVizualizacionesMayorA extends Filtro {
	//Atributos
	private int vizualizacionesMin;
	
	//Constructor
	public FiltroVizualizacionesMayorA(int vizualizacionesMin) {
		this.vizualizacionesMin = vizualizacionesMin;
	}

	@Override
	public boolean cumple(Video v) {
		// TODO Auto-generated method stub
		return v.getCant_visualizaciones() > this.vizualizacionesMin;
	}

}
