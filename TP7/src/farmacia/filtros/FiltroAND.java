package farmacia.filtros;

import farmacia.Medicamento;

public class FiltroAND extends Filtro{
	private final Filtro filtro1, filtro2;
	public FiltroAND(Filtro filtro1, Filtro filtro2) { this.filtro1=filtro1; this.filtro2=filtro2;	}
	public Filtro getFiltro1() {return filtro1;}
	public Filtro getFiltro2() {return filtro2;}
	
	@Override
	public boolean cumple(Medicamento m) {
		return filtro1.cumple(m) && filtro2.cumple(m);
	}
	
}
