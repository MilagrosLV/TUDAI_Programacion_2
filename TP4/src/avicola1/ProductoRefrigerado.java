package avicola1;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto {
	private int codigoSupervision;
	private double tempMantenimiento;
	
	
	public ProductoRefrigerado(String nombre, LocalDate fechaVencimiento, LocalDate fechaEnvasado, int lote, String granjaOrigen,
			int codigoSupervision, double tempMantenimiento) {
		super(nombre, fechaVencimiento, fechaEnvasado, lote, granjaOrigen);
		this.codigoSupervision = codigoSupervision;
		this.tempMantenimiento = tempMantenimiento;
	}


	public int getCodigoSupervision() {
		return codigoSupervision;
	}


	public double getTempMantenimiento() {
		return tempMantenimiento;
	}


	@Override
	public String toString() {
		return super.toString() + " [codigoSupervision=" + codigoSupervision + ", tempMantenimiento=" + tempMantenimiento
				+ "]";
	}
}
