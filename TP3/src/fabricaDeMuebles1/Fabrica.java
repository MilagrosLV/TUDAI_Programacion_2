package fabricaDeMuebles1;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {
	private ArrayList<Producto> stock;

	public Fabrica() {
		this.stock = new ArrayList<>();
	}

	
	
	//adder
	public void addProducto(Producto p) {
		if(!stock.contains(p)) stock.add(p);
	}
	
	//getter
	public List<Producto> getStock() {
		return List.copyOf(stock);
	}
	public double getPrecioFabricaProducto(Producto p) {
		if(isProductoDisponible(p))  return p.getCostoFabrica();
		return 0;
	}
	public double getPrecioVentaProducto(Producto p) {
		if(isProductoDisponible(p)) return p.getValorVenta();
		return 0;
	}
	public double getPrecioFabricaStock() {
		double suma=0.0;
		for(Producto pp: stock) {
			suma += pp.getCostoFabrica();
		}
		return suma;
	}
	public double getPrecioVentaStock() {
		double suma=0.0;
		for(Producto pp: stock) {
			suma += pp.getValorVenta();
		}
		return suma;
	}
	
	//Boolean Producto Disponible
	public boolean isProductoDisponible(Producto p) {
		return this.stock.contains(p);
	}
	
	

}
