package registroEmpresa;

public abstract class Persona {
	private String nombre, apellido, edad, cargo;

	public Persona(String nombre, String apellido, String edad, String cargo) {
		this.apellido = apellido;
		this.edad = edad;
		this.cargo = cargo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getEdad() {
		return edad;
	}

	public String getCargo() {
		return cargo;
	}
	
}
