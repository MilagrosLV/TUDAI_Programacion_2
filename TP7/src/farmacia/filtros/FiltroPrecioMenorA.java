package farmacia.filtros;

import farmacia.Medicamento;

public class FiltroPrecioMenorA extends Filtro{
	private final double precioMenorA;
	public FiltroPrecioMenorA(double precioMenorA) {
		this.precioMenorA=precioMenorA;
	}
	public double getPrecioMenorA() {return precioMenorA;}
	
	@Override
	public boolean cumple(Medicamento m) {
		return m.getPrecio()<this.getPrecioMenorA(); 
	}
	
}
