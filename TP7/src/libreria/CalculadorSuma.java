package libreria;

public class CalculadorSuma extends Calculador {
	private Calculador c1, c2;
	public CalculadorSuma(Calculador c1, Calculador c2) {this.c1=c1;this.c2=c2;}
	

	@Override
	public double getPrecio(Producto p) {
		return c1.getPrecio(p) + c2.getPrecio(p);
	}

}
