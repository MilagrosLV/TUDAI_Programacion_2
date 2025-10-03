package streaming;

public class FiltroAnd extends Filtro {
	private Filtro f1;
	private Filtro f2;
	  
	public FiltroAnd(Filtro f1, Filtro f2){
	  this.f1 = f1;
	  this.f2 = f2;
	}
	  
	public boolean eval(Pelicula p){
	  return f1.eval(p) && f2.eval(p);
	}
}
