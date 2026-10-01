package musify;

public class FiltroArtista extends Filtro {
	private String artista;
	public FiltroArtista(String artista) {this.artista=artista;}
	

	@Override
	public boolean cumple(Pista e) {
		// TODO Auto-generated method stub
		return e.getArtista().equals(artista);
	}

}
