package musify;

import java.util.ArrayList;
import java.util.List;

public class PistaParaTodos extends Pista {

	public PistaParaTodos(String titulo, String artista, String tituloAlbum, String genero, int duracionSeg, int anio) {
		super(titulo, artista, tituloAlbum, genero, duracionSeg, anio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Pista> buscar(Filtro f){
		List<Pista> pista = new ArrayList<>();
		pista.add(this);
		return pista;
	}
}
