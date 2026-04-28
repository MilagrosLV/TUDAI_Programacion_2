package ecuestria;

public class CondicionNot extends Condicion{
	private Condicion c;
	public CondicionNot(Condicion c) {
		this.c=c;
	}
	
	public boolean cumple(Poni p) {
		return !c.cumple(p);
	}
}
