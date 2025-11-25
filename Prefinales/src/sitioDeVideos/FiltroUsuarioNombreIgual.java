package sitioDeVideos;

public class FiltroUsuarioNombreIgual extends Filtro {
	//Atributos
		private String autor;
		
		//Constructor
		public FiltroUsuarioNombreIgual(String autor) {
			this.autor = autor;
		}

	@Override
	public boolean cumple(Video v) {
		// TODO Auto-generated method stub
		return (v.getUsuario().getNombre().toLowerCase()).equals(autor.toLowerCase());
	}

}
