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
	

	public void obtenerEtiquetaProducto(Producto p) {
		if(getProductos().contains(p)) {
			System.out.println("Etiqueta del producto: "+ p.obtenerEtiqueta());
		} else {
			System.out.println("El producto no se encuentra en la empresa.");
		}
	}
	
	public void mostrarListaProductos() {
		System.out.println("Listado de productos en la empresa:");
		for(Producto pp : productos) {
			System.out.println(pp.obtenerEtiqueta());
		}
	}
	
	
}
