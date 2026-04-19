package sueldos;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Empleado> empleados;
	
	public Empresa () {
		this.empleados=new ArrayList<>();
	}
	
	public void addEmpleado(Empleado e) {
		if(!empleados.contains(e)) {
			empleados.add(e);
		}
	}
	
	public void saberSueldosEmpleados() {
		for(Empleado ee:empleados) {
			System.out.println(ee);
		}
	}
	
}
