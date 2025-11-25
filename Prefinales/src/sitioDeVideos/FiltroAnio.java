package sitioDeVideos;

public class FiltroAnio extends Filtro {
	//Atributos
	private int anioMin;
	
	

	public FiltroAnio(int anioMin) {
		this.anioMin = anioMin;
	}



	@Override
	public boolean cumple(Video v) {
		// TODO Auto-generated method stub
		return v.getAnio_publicacion() == anioMin;
	}

}
