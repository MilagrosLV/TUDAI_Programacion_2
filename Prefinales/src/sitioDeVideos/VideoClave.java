package sitioDeVideos;

public class VideoClave extends Video {
	
	//Constructor
	public VideoClave(String titulo, Usuario usuario, int duracion_seg, int cant_visualizaciones, int cant_me_gusta,
			int cant_no_me_gusta, int anio_publicacion) {
		super(titulo, usuario, duracion_seg, cant_visualizaciones, cant_me_gusta, cant_no_me_gusta, anio_publicacion);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public boolean tienePalabraClave(String ss) {
		return true;
	}
}
