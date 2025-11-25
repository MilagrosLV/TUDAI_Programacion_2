package sitioDeVideos;

public class FiltroAND extends Filtro {
	//Atributos
	Filtro f1, f2;
	
	//Constructor
	public FiltroAND(Filtro f1, Filtro f2) {
		this.f1=f1;
		this.f2=f2;
	}
	
	
	@Override
	public boolean cumple(Video v) {
		// TODO Auto-generated method stub
		return f1.cumple(v) && f2.cumple(v);
	}

}
