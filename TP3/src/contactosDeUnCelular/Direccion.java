package contactosDeUnCelular;

public class Direccion {
	private String ciudad, calle, nro, piso;

	public Direccion(String ciudad, String calle, String nro, String piso) {
		this.ciudad = ciudad;
		this.calle = calle;
		this.nro = nro;
		this.piso = piso;
	}
	public Direccion(String ciudad, String calle, String nro) {
		this(ciudad, calle, nro, "-");
	}
	public String getCiudad() {
		return ciudad;
	}
	public String getCalle() {
		return calle;
	}
	public String getNro() {
		return nro;
	}
	public String getPiso() {
		return piso;
	}
	
}
