package registroEmpresa;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Persona> asociados;

	public Empresa() {
		this.asociados = new ArrayList<>();
	}

	public ArrayList<Persona> getAsociados() {
		return asociados;
	}
	public void addAsociado(Persona p) {
		if(!(getAsociados().contains(p))) {
			getAsociados().add(p);
		}
	}

	@Override
	public String toString() {
		return "Empresa [asociados= " + asociados + "]";
	}

	public void showAsociados(){
		asociados.forEach(System.out::println);
	}

	public void exportarListado() {
		System.out.println("Cargo           | Nombre Completo           | Edad    | Legajo   | Sueldo    | Empleados a cargo | Usuario  | Password");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		asociados.forEach(System.out::println);
	}

	
	
	
	
}
