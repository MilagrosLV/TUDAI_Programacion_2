package registroEmpresa;

import java.time.LocalDate;

public class UsuarioFinal extends Persona{
	private String user, password;

	public UsuarioFinal(String nombre, String apellido, LocalDate dob, String cargo, String user, String password) {
		super(nombre, apellido, dob, cargo);
		this.user = user;
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return super.toString()+" |\t\t\t\t\t\t "+String.format("| %-8s | %s", getUser(), getPassword());
	}
	
	
}
