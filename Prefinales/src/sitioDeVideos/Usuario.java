package sitioDeVideos;


public class Usuario implements Comparable<Usuario>{
	//Atributos
	private String nombre, email;
	private int anio_registro;

	//Constructor
	public Usuario(String nombre, String email, int anio_registro) {
		this.nombre = nombre;
		this.email = email;
		this.anio_registro = anio_registro;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getAnio_registro() {
		return anio_registro;
	}
	public void setAnio_registro(int anio_registro) {
		this.anio_registro = anio_registro;
	}
	
	
	@Override
	public int compareTo(Usuario o) {
		int result = nombre.compareTo(o.getNombre());
		if(result == 0) {
			return email.compareTo(o.getEmail());
		}
		return result;
	}
	
	
}
