package sitioDeVideos;

public class FiltroMeGustasMayorA extends Filtro {
	//Atributos
	private int meGustasMin;
	
	//Constructor
	public FiltroMeGustasMayorA(int meGustasMin) {
		this.meGustasMin = meGustasMin;
	}

	@Override
	public boolean cumple(Video v) {
		// TODO Auto-generated method stub
		return v.getCant_me_gusta() > meGustasMin;
	}

}
