package entregasADomicilio.filtros;

import entregasADomicilio.Compra;

public class FiltroNoEntregada extends Filtro{
	
	@Override
	public boolean cumple(Compra m) {
		return !m.esYaEntregado(); 
	}
	
}
