package avicola1;

import java.time.LocalDate;

public class ProductoCongeladoAgua extends ProductoCongelado{
	private double grSalPorLitro;

	public ProductoCongeladoAgua(String nombre, LocalDate fechaVencimiento, LocalDate fechaEnvasado, int lote, String granjaOrigen,
			int codigoSupervision, double tempMantenimiento, double grSalPorLitro) {
		super(nombre, fechaVencimiento, fechaEnvasado, lote, granjaOrigen, codigoSupervision, tempMantenimiento);
		this.grSalPorLitro = grSalPorLitro;
	}

	public double getGrSalPorLitro() {
		return grSalPorLitro;
	}

	@Override
	public String toString() {
		return super.toString() + "  [grSal/Litro=" + grSalPorLitro + "]";
	}
	
	
}
