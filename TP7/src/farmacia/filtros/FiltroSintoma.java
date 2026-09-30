package farmacia.filtros;

import farmacia.Medicamento;

public class FiltroSintoma extends Filtro{
	private final String sintoma;
	public FiltroSintoma(String sintoma) { this.sintoma=sintoma.toLowerCase();}
	public String getSintoma() {return sintoma;}
	
	@Override
	public boolean cumple(Medicamento m) {
		return m.tieneSintoma(this.getSintoma());
	}
}
