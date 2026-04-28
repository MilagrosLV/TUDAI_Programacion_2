package ecuestria;

public class CondicionVelocidadIgual extends Condicion{
	private double valor;
	public CondicionVelocidadIgual(double valor) {
		this.valor=valor;
	}
	
	public boolean cumple(Poni p) {
		return valor == p.getVelocidad();
	}
	
	
}
