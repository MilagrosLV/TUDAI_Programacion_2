package registroEmpresa;

import java.time.LocalDate;
import java.util.ArrayList;

public class Jerarquico extends Empleado {
	private ArrayList<Empleado> empleadosACargo;

	public Jerarquico(String nombre, String apellido, LocalDate dob, String cargo, int legajo, double sueldo) {
		super(nombre, apellido, dob, cargo, legajo, sueldo);
		this.empleadosACargo = new ArrayList<>();
	}

	//getter y adder

	public void addEmpleadosACargo(Empleado e) {
		if(!(this.empleadosACargo.contains(e))) {
			this.empleadosACargo.add(e);
		}
	}

	@Override
	public String toString() {
		return super.toString() +String.format(" | %8d ", empleadosACargo.size())+"\t |";
	}
	
	
	
	
}
