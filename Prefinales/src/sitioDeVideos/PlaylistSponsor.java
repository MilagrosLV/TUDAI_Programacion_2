package sitioDeVideos;

import java.util.ArrayList;

public class PlaylistSponsor extends Playlist {
	//Atributos
	private Video pago;

	//Constructor
	public PlaylistSponsor(String titulo, int demora, Video pago) {
		super(titulo, demora);
		this.setPago(pago);
		// TODO Auto-generated constructor stub
	}

	//GETTERS ySETTERS
	public Video getPago() {
		return pago;
	}
	public void setPago(Video pago) {
		this.pago = pago;
	}
	
	public ArrayList<Video> buscar(Filtro ff) {
		ArrayList<Video> videos = super.buscar(ff);
		videos.addFirst(pago);
		return videos;
	}

}
