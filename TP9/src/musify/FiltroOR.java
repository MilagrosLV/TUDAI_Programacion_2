package musify;


public class FiltroOR extends Filtro{
	private final Filtro filtro1, filtro2;
	public FiltroOR (Filtro filtro1, Filtro filtro2) {this.filtro1=filtro1; this.filtro2=filtro2;}
	public Filtro getFiltro1() {return filtro1;}
	public Filtro getFiltro2() {return filtro2;}
	
	@Override
	public boolean cumple(Pista m) {
		return getFiltro1().cumple(m) || getFiltro2().cumple(m);
	}
}
