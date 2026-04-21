package avicola1;

import java.time.LocalDate;

public class ProductoCongeladoAire extends ProductoCongelado{
	private double N, O, CO2, H2O;

	public ProductoCongeladoAire(String nombre, LocalDate fechaVencimiento, LocalDate fechaEnvasado, int lote, String granjaOrigen,
			int codigoSupervision, double tempMantenimiento, double n, double o, double cO2, double h2o) {
		
		super(nombre, fechaVencimiento, fechaEnvasado, lote, granjaOrigen, codigoSupervision, tempMantenimiento);
		verificarComposicion(n, o, cO2, h2o);
		N = n;
		O = o;
		CO2 = cO2;
		H2O = h2o;
	}
	
	public void verificarComposicion(double n, double o, double cO2, double h2o) {
		if(!(n+0+cO2+h2o <= 100)) {
			System.out.println("Información de la composición del aire erronea. Supera el 100%");
		}
	}

	public double getN() {
		return N;
	}

	public double getO() {
		return O;
	}

	public double getCO2() {
		return CO2;
	}

	public double getH2O() {
		return H2O;
	}

	@Override
	public String obtenerEtiqueta() {
		return super.obtenerEtiqueta() + " [N=" + N + ", O=" + O + ", CO2=" + CO2 + ", H2O=" + H2O + "]";
	}
	
	
}
