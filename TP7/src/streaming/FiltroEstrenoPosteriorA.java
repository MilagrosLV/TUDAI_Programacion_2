package streaming;

public class FiltroEstrenoPosteriorA extends Filtro{
	private final int anioEstreno;
	public FiltroEstrenoPosteriorA (int anioEstreno) {this.anioEstreno=anioEstreno;}
	
	@Override
	public boolean cumple(Pelicula p) {
		return p.getAnioEstreno()>anioEstreno;
	}
}
