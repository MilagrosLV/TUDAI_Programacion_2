package streaming;

public class FiltroTituloContenido extends Filtro {
	private String titulo;
	  
	public FiltroTituloContenido(String titulo){
	  this.titulo = titulo;
	}
	  
	public boolean eval(Pelicula p){
	  return p.getTitulo().contains(titulo);
	}
}
