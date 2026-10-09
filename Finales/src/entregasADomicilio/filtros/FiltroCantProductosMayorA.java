package entregasADomicilio.filtros;

import entregasADomicilio.Compra;

public class FiltroCantProductosMayorA extends Filtro{
	private int cant;
	
	public FiltroCantProductosMayorA(int cant) {
		this.cant=cant;
	}
	
	public int getCant() {return cant;	}
	
	@Override
	public boolean cumple(Compra m) {
		return m.getCantProductos()<this.getCant();
	}
}
