package entregasADomicilio.filtros;

import entregasADomicilio.Compra;
public class FiltroCiudad extends Filtro{
	private String ciudad;
	
	public FiltroCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public String getLaboratorio() {return ciudad;} 
	
	@Override
	public boolean cumple(Compra m) {
		return m.getCiudad().equals(ciudad.toLowerCase());
	}
}
