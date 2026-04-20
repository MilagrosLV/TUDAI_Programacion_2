package avicola1;

import java.time.LocalDate;

public class ProductoFresco extends Producto{

	public ProductoFresco(String nombre, LocalDate fechaVencimiento, LocalDate fechaEnvasado, int lote, String granjaOrigen) {
		super(nombre, fechaVencimiento, fechaEnvasado, lote, granjaOrigen);
	}

}
