package sitioDeVideos;

public class FiltroPalabraClave extends Filtro {
	//Atributo
	private String palabra;
	
	//Constructor
	public FiltroPalabraClave(String palabra) {
		this.palabra = palabra;
	}
	

	@Override
	public boolean cumple(Video v) {
		// TODO Auto-generated method stub
		return v.tienePalabraClave(palabra);
	}

}
