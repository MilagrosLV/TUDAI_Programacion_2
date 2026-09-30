package libreria;

public class CalculadorCantGeneros extends Calculador{
	private double precioPorGenero;
	public CalculadorCantGeneros(double precioPorGenero) {this.precioPorGenero=precioPorGenero;}
	public double getPrecioPorGenero() {return precioPorGenero;}
	
	@Override
	public double getPrecio(Producto p) {
		return p.getCantGeneros() * getPrecioPorGenero();
	}
}
