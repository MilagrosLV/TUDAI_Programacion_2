package streaming;

public class FiltroNot extends Filtro {	  
	private Filtro f;
	  
	public FiltroNot(Filtro f){
	  this.f = f;
	}
	  
	public boolean cumple(Pelicula p){
	  return !f.cumple(p);
	}
}
