package streaming;

public class FiltroDirector extends Filtro {
	private final String director;
	public FiltroDirector(String director) {this.director=director.toLowerCase();}
	

	@Override
	public boolean cumple(Pelicula p) {
		return p.getDirector().equals(director);
	}
}
