package sitioDeVideos;

import java.util.ArrayList;
import java.util.Collections;

public class Playlist extends ElementoVideo {
	private String titulo;
	protected ArrayList<ElementoVideo> elementos;
	protected int demora;
	
	
	
	
	public Playlist(String titulo, int demora) {
		super();
		this.setTitulo(titulo);
		this.demora = demora;
		this.elementos = new ArrayList<>();
	}
	//Metodos GETTERS y SETTERS
	
	public int getDemora() {
		return demora;
	}
	public void setDemora(int demora) {
		this.demora = demora;
	}
	
	public void agregarElementoVideo(ElementoVideo ee) {
		if(!elementos.contains(ee)) {
			elementos.add(ee);
		}
	}
	
	
	
	@Override
	public ArrayList<Video> buscar(Filtro ff) {
		ArrayList<Video> videos = new ArrayList<>();
		
		for(int i=0; i<elementos.size(); i++) {
			ElementoVideo ee = elementos.get(i);
			videos.addAll(ee.buscar(ff));
		}
		Collections.sort(videos);
		
		return videos;
	}
	@Override
	public ArrayList<String> getPalabrasClave() {
		ArrayList<String> pc = new ArrayList<String>();
		
		for(ElementoVideo e : elementos) {
			ArrayList<String> pcAux = e.getPalabrasClave();
			
			for(String pca : pcAux) {
				if(!pc.contains(pca.toLowerCase())) {
					pc.add(pca);
				}
			}
		}
		return pc;
	}
	@Override
	public int contarVideos() {
		int suma = 0;
		for(ElementoVideo ee : elementos) {
			suma += ee.contarVideos();
		}
		return suma;
	}
	@Override
	public int getDuracionSeg() {
		int suma = 0;
		
		for(ElementoVideo ee : elementos) {
			suma += ee.getDuracionSeg();
		}
		return suma +  this.getDemora();
	}

    @Override
    public String toString() {
        return ("Playlist: " + this.getTitulo() + ", Duración total (segundos): " + this.getDuracionSeg() + ", Cantidad de videos: " + this.contarVideos() + "\n");
    }

	
}
