package farmacia.filtros;

import farmacia.Medicamento;

public class FiltroNombreContiene extends Filtro{
	private final String nombreContiene;
	
	public FiltroNombreContiene(String nombreContiene) {
		this.nombreContiene=nombreContiene.toLowerCase();
	}
	
	public String getNombreContiene() {return nombreContiene;	}
	
	@Override
	public boolean cumple(Medicamento m) {
		return m.getNombre().contains(nombreContiene);
	}
}
