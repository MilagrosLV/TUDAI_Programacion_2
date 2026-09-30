package libreria;

public class CondicionAutorFavorito extends Condicion {
	private String autor;
	public CondicionAutorFavorito(String autor) {this.autor=autor.toLowerCase();}
	public String getAutor() {return autor;}


	@Override
	public boolean cumple(Cliente c, Producto p) {
		return c.tieneAutorFavorito(this.getAutor()) && p.getAutor().equals(this.getAutor());
	}

}
