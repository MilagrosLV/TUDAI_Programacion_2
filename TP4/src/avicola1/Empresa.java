package avicola1;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Producto> productos;
	
	public Empresa() {
		this.productos = new ArrayList<>();
	}

	//getter y adder
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void addProducto(Producto p) {
		if(!getProductos().contains(p)) {
			getProductos().add(p);
		}
	}
	
	@Override
	public String toString() {
		return "Empresa [productos=" + productos + "]";
	}

	public void obtenerEtiquetaProducto(Producto p) {
		if(getProductos().contains(p)) {
			System.out.println("Etiqueta del producto: "+ p.toString());
		} else {
			System.out.println("El producto no se encuentra en la empresa.");
		}
	}
	
	
}
