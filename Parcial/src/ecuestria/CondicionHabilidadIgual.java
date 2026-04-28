package ecuestria;

public class CondicionHabilidadIgual extends Condicion{
	private String habilidad;
	public CondicionHabilidadIgual(String habilidad) {
		this.habilidad=habilidad;
	}
	
	public boolean cumple(Poni p) {
		return p.getHabilidades().contains(this.habilidad);
	}
}
