package streaming;

public class FiltroNot extends Filtro {	  
	private Filtro f;
	  
	public FiltroNot(Filtro f){
	  this.f = f;
	}
	  
	public boolean eval(Pelicula p){
	  return !f.eval(p);
	}
}
