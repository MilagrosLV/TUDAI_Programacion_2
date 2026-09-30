package streaming;

public class FiltroTituloContenido extends Filtro {
	private final String titulo;
	  
	public FiltroTituloContenido(String titulo){
	  this.titulo = titulo.toLowerCase();
	}
	  
	@Override
	public boolean cumple(Pelicula p){
	  return p.getTitulo().contains(titulo);
	}
}
