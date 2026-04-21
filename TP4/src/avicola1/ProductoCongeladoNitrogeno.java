package avicola1;

import java.time.LocalDate;

public class ProductoCongeladoNitrogeno extends ProductoCongelado{
	private String metodoCongelacion;
	private int exposiciónSeg;
	
	
	public ProductoCongeladoNitrogeno(String nombre, LocalDate fechaVencimiento, LocalDate fechaEnvasado, int lote,
			String granjaOrigen, int codigoSupervision, double tempMantenimiento, String metodoCongelacion,
			int exposiciónSeg) {
		super(nombre, fechaVencimiento, fechaEnvasado, lote, granjaOrigen, codigoSupervision, tempMantenimiento);
		this.metodoCongelacion = metodoCongelacion;
		this.exposiciónSeg = exposiciónSeg;
	}


	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}


	public int getExposiciónSeg() {
		return exposiciónSeg;
	}


	@Override
	public String obtenerEtiqueta() {
		return super.obtenerEtiqueta() + " metodoCongelacion=" + metodoCongelacion + ", exposiciónSeg=" + exposiciónSeg;
	}
	
	
	
	
}
