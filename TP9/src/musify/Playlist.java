package musify;

import java.util.ArrayList;
import java.util.List;

public class Playlist extends Elemento{
	private String nombre;
	protected List<Elemento> elementos;
	
	public Playlist (String nombre) {
		this.nombre=nombre;
		this.elementos = new ArrayList<>();
	}
	
	//getters Compuestos
	@Override
	public int getDuracionSeg() {
		int duracionTotal = 0;
		for(Elemento ee : elementos) {
			duracionTotal += ee.getDuracionSeg();
		}
		return duracionTotal;
	}
	//buscador de pistas
	@Override
	public List<Pista> buscar(Filtro f){
		List<Pista> pistas = new ArrayList<>();
		for(Elemento ee: elementos) {
			pistas.addAll(ee.buscar(f));
		}
		return pistas;
	}

	
	//adder
	public void agregarElemento(Elemento e) {
		if(e == null) throw new NullPointerException("No se puede gregar elemento nulo.");
		elementos.add(e);
	}
	

	//getter
	public String getNombre() {
		return nombre;
	}
	

}