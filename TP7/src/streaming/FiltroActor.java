package streaming;

public class FiltroActor extends Filtro {
	private final String actor;
	public FiltroActor(String actor) {this.actor=actor.toLowerCase();}
	

	@Override
	public boolean cumple(Pelicula p) {
		return p.tieneActor(actor);
	}

}
