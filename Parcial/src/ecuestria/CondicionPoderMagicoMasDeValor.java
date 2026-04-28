package ecuestria;

public abstract class CondicionPoderMagicoMasDeValor extends Condicion{
	private int valor;
	public CondicionPoderMagicoMasDeValor(int valor) {
		this.valor=valor;
	}
	
	public boolean cumple(Poni p) {
		return valor>p.getPoderMagico();
	}
}
