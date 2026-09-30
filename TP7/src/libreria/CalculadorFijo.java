package libreria;

public class CalculadorFijo extends Calculador{
	@Override
	public double getPrecio(Producto p) { return p.getPrecio();}
}
