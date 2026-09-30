package farmacia.filtros;

import farmacia.Medicamento;

public class FiltroNOT extends Filtro{
	private final Filtro filtro;
	public FiltroNOT(Filtro filtro) { this.filtro=filtro;}
	public Filtro getFiltro() {return filtro;}
	
	@Override
	public boolean cumple(Medicamento m) {
		return !filtro.cumple(m);
	}
}
