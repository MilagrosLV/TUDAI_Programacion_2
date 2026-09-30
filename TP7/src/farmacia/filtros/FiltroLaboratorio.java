package farmacia.filtros;

import farmacia.Medicamento;

public class FiltroLaboratorio extends Filtro{
	private String laboratorio;
	
	public FiltroLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	
	public String getLaboratorio() {return laboratorio;} 
	
	@Override
	public boolean cumple(Medicamento m) {
		return m.getLaboratorio().equals(laboratorio.toLowerCase());
	}
}
