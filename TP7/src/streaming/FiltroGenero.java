package streaming;

public class FiltroGenero extends Filtro {
	private final String genero;
	public FiltroGenero(String genero) {this.genero=genero.toLowerCase();}
	

	@Override
	public boolean cumple(Pelicula p) {
		return p.tieneGenero(genero);
	}

}
