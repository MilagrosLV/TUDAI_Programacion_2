package musify;

public class PlaylistDuracionLimitada extends Playlist {
	private int limite;

	public PlaylistDuracionLimitada(String nombre, int limite) {
		super(nombre);
		this.limite=limite;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void agregarElemento(Elemento e) {
		if(e == null) throw new NullPointerException("No se puede gregar elemento nulo.");
		else if(e.getDuracionSeg() + this.getDuracionSeg() > limite) throw new IllegalArgumentException ("No se puede agregar. No queda tiempo disponible");
		elementos.add(e);
	}

}
