package ecuestria;

public class EquipoRespuestaRapida extends Patrulla{

	
	public EquipoRespuestaRapida() {
		super();
	}

	@Override
	public double getVelocidad() {
		// TODO Auto-generated method stub
		double max = 0.0;
		for(ElementoPoni pp: this.getMiembros()) {
			if(pp.getVelocidad()>max) {
				max=pp.getVelocidad();			}
		}
		return max;
	}

	@Override
	public int getPoderMagico() {
		int suma =0;
		for(ElementoPoni pp : this.getMiembros()) {
			suma += pp.getPoderMagico();
		}
		return suma;
	}
	
	

}
