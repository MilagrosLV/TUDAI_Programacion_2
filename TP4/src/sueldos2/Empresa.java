package sueldos2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Empleado> empleados;
	
	public Empresa () {
		empleados = new ArrayList<>();
	}

	//getter
	public List<Empleado> getEmpleados() {return List.copyOf(empleados);}
	//adder
	public void agregarEmpleado(Empleado e) {
		if(e!=null&&!empleados.contains(e)) empleados.add(e);
	}
	
	//quiero saber cuánto le debe pagar por empleado al fonalizar la semana
	public double getSueldoEmpleado(Empleado e) {
		if(e!=null && empleados.contains(e))return e.getSueldoTotal();
		return 0.0;
	}
	// Calcula el gasto total semanal de salarios
    public double calcularSueldosTotales() {
        double total = 0.0;
        for (Empleado e : empleados) {
            total += e.getSueldoTotal();
        }
        return total;
    }

    public void liquidarSueldos() {
        System.out.println("=== LIQUIDACIÓN SEMANAL DE SUELDOS ===");
        for (Empleado e : empleados) {
            System.out.println(e);
        }
        System.out.println("--------------------------------------");
        System.out.println("Monto total a pagar por la empresa: $" + calcularSueldosTotales());
    }
	
	
}
