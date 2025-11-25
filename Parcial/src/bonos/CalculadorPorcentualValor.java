package bonos;

public class CalculadorPorcentualValor extends Calculador {
	private double porcentaje;
	
	public CalculadorPorcentualValor(double porcentaje) {
		super();
		this.porcentaje = porcentaje;
	}
	
	public double getPorcentaje() {
		return porcentaje;
	}


	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}



	@Override
	public double calcular(Bono bb) {
		// TODO Auto-generated method stub
		return bb.getValorNominal()*this.getPorcentaje();
	}

}
