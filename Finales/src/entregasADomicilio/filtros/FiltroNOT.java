package entregasADomicilio.filtros;

import entregasADomicilio.Compra;

public class FiltroNOT extends Filtro{
	private final Filtro filtro;
	public FiltroNOT(Filtro filtro) { this.filtro=filtro;}
	public Filtro getFiltro() {return filtro;}
	
	@Override
	public boolean cumple(Compra m) {
		return !filtro.cumple(m);
	}
}
