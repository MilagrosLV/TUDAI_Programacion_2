package streaming;

public class FiltroEstrenoAnteriorA extends Filtro {
	private final int anioEstreno;
	public FiltroEstrenoAnteriorA(int anioEstreno) { this.anioEstreno=anioEstreno;}

	@Override
	public boolean cumple(Pelicula p) {
		return p.getAnioEstreno()<anioEstreno;
	}

}
