package libreria;

public class CondicionGenero extends Condicion {
	private String genero;
	public CondicionGenero(String genero) {this.genero=genero.toLowerCase();}
	public String getGenero() {return genero;}
	


	@Override
	public boolean cumple(Cliente c, Producto p) {
		return c.tieneGeneroFavorito(genero) && p.tieneGenero(genero);
	}

}
