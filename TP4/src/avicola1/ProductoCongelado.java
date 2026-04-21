package avicola1;

import java.time.LocalDate;

public abstract class ProductoCongelado extends Producto {
	private int codigoSupervision;
	private double tempMantenimiento;
	
	
	public ProductoCongelado(String nombre, LocalDate fechaVencimiento, LocalDate fechaEnvasado, int lote, String granjaOrigen,
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
	public String obtenerEtiqueta() {
		return super.obtenerEtiqueta() + " codigoSupervision=" + codigoSupervision + ", tempMantenimiento=" + tempMantenimiento
				+ ",";
	}
	
	

}
