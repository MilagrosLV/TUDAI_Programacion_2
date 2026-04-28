package ecuestria;

public class CirculoIngenioMagico extends Patrulla{
	public CirculoIngenioMagico() {
		super();
	}
	
	@Override
	public double getVelocidad() {
		return this.getMiembros().getFirst().getVelocidad();
	}
	
	@Override
	public int getPoderMagico() {
		int max = 0;
		for (ElementoPoni pp : this.getMiembros()) {
			if(pp.getPoderMagico()>max) {
				max=pp.getPoderMagico();
			}
		}
		return max;
	}
}
