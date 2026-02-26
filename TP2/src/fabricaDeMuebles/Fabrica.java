package fabricaDeMuebles;

import java.util.ArrayList;

public class Fabrica {
	//ATRIBUTOS
	private ArrayList<Producto> stock;
	
	//CONSTRUCTOR
	public Fabrica() {
		this.stock = new ArrayList<Producto>();
	}
	
	//GETTERS 
	public ArrayList<Producto> getStock() {
		return new ArrayList<Producto>(stock);
	}
	public double getCostoFabricacionTotal() {
		double suma = 0;
		for(Producto p : stock) {
			suma += p.getCostoFabricacion();
		}
		return suma;
	}
	public double getValorVentaTotal() {
		double suma = 0;
		for(Producto p : stock) {
			suma += p.getValorVenta();
		}
		return suma;
	}
	
}
