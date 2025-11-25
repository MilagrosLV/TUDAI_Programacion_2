package bonos;

public class CalculadorFijo extends Calculador {
	private double montoFijo;
	

	public CalculadorFijo(double montoFijo) {
		super();
		this.montoFijo = montoFijo;
	}


	public double getMontoFijo() {
		return montoFijo;
	}


	public void setMontoFijo(double montoFijo) {
		this.montoFijo = montoFijo;
	}


	@Override
	public double calcular(Bono bb) {
		// TODO Auto-generated method stub
		return this.getMontoFijo();
	}

}
