package musify;

public class FiltroDuracionMayorA extends Filtro{
	private int duracion;
	public FiltroDuracionMayorA(int duracion) {this.duracion=duracion;}
	
	@Override
	public boolean cumple(Pista e) {
		return e.getDuracionSeg() > duracion;
	}
}
