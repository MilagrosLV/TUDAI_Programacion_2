package libreria;

public class CalculadorCantPP extends Calculador{
	private double precioPorP;
	public CalculadorCantPP(double precioPorP) {this.precioPorP=precioPorP;}
	public double getPrecioPorP() {return precioPorP;}
	
	@Override
	public double getPrecio(Producto p) {
		return getPrecioPorP()*(p.getCantPP());
	}
}
