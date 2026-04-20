package avicola1;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		//Iteraciones
		Empresa avicola = new Empresa();

		Producto huevos = new ProductoFresco("Huevos", LocalDate.of(2024, 7, 1), LocalDate.of(2024, 6, 1), 12345, "Granja El Sol");
		Producto pollo = new ProductoRefrigerado("Pollo", LocalDate.of(2024, 8, 1), LocalDate.of(2024, 6, 15), 54321, "Granja La Luna", 333, -18.0);
		Producto hamburguesa = new ProductoCongeladoAire("Hamburguesa", LocalDate.of(2024, 10, 3), LocalDate.of(2024, 6, 1), 235, "Granja El Sol", 77, -20, 14, 24, 2, 0.5);
		Producto nuggets = new ProductoCongeladoNitrogeno("Nuggets", LocalDate.of(2024, 9, 15), LocalDate.of(2024, 6, 10), 67890, "Granja La Luna", 555, -25, "N2", 120);
		Producto pescado = new ProductoCongeladoAgua("Pescado", LocalDate.of(2024, 11, 20), LocalDate.of(2024, 6, 5), 98765, "Granja El Sol", 999, -30, 35.0);

		avicola.addProducto(huevos);
		avicola.addProducto(pollo);
		avicola.addProducto(hamburguesa);
		avicola.addProducto(nuggets);
		avicola.addProducto(pescado);

		/*
		System.out.println("Productos en la empresa:");
		for (Producto producto : avicola.getProductos()) {
			System.out.println(producto);
		}
		*/
		//System.out.println(avicola);
		avicola.obtenerEtiquetaProducto(pescado);

	}

}
