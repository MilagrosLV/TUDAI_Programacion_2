package agendaPersonal;

public class Persona {
	private String nombre, apellido, mail;
	private long telefono;
	
	
	//CONSTRUCTORES
	public Persona(String nombre, String apellido, String mail, long telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.telefono = telefono;
	}

	
	//GETTERS y SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	//OTROS METODOS
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", telefono=" + telefono
				+ "]";
	}
	
	
	
	
}
