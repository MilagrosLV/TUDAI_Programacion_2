package fabricaDeMuebles;

import java.util.ArrayList;

public class Fabrica {
	private ArrayList<Producto> muebles;

	//CONSTRUCTOR
	public Fabrica() {
		this.muebles = new ArrayList<Producto>();
	}
	
	//GETTERS 
	public ArrayList<Producto> getMuebles() {
		return muebles;
	}
	
	//OTROS METODOS
	@Override
	public String toString() {
		return "Fabrica [muebles= " + muebles + "]";
	}
	
	//Agregar mueble
	public void agregarMueble(Producto p) {
		muebles.add(p);
	}

	//Mostrar costo de productos en stock
	public void  mostrarCostoStockDisponible(){
		for (Producto m : muebles) {
			System.out.print(m.getTipo() + ": fabricación" + m.getCostoFabricacion() + ", venta " + m.getValorVenta());
		}
	}
}
