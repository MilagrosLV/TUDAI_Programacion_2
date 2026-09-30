package streaming;

public class FiltroDuracionMenorA extends Filtro {
	private final int duracionMinuto;
	public FiltroDuracionMenorA(int duracionMinuto) { this.duracionMinuto=duracionMinuto;}

	@Override
	public boolean cumple(Pelicula p) {
		return p.getDuracionMinuto()<duracionMinuto;
	}

}
