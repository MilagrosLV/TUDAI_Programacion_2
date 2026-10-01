package musify;

import java.util.List;

public class PlaylistPromocionada extends Playlist{
	private Pista promocionada;

	public PlaylistPromocionada(String nombre, Pista promocionada) {
		super(nombre);
		this.promocionada=promocionada;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Pista> buscar(Filtro f){
		List<Pista> pistas = super.buscar(f);
		pistas.add(0, promocionada);
		return pistas;
	}
	
}
