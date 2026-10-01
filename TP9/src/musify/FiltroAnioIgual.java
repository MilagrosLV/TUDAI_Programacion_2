package musify;

public class FiltroAnioIgual extends Filtro{
	private int anio;
	public FiltroAnioIgual(int anio) {this.anio=anio;}
	
	@Override
	public boolean cumple(Pista e) {
		return e.getAnio() == anio;
	}
}
