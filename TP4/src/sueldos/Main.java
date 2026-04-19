package sueldos;

public class Main {

	public static void main(String[] args) {
		//Iteraciones
		Empresa em = new Empresa();
		
		Empleado e1 = new EmpleadoHrExtra("Valen", 100.0, 3.0, 10.0);
		Empleado e2 = new EmpleadoComision("Sofi", 200.0, 20, 0.1);
		Empleado e3 = new Empleado("Lau", 300.0);
		em.addEmpleado(e1);
		em.addEmpleado(e2);
		em.addEmpleado(e3);

		em.saberSueldosEmpleados();

	}

}
