package registroEmpresa;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		//Iteraciones
		Empresa empresa = new Empresa();

		Empleado p1 = new Empleado("Juan", "Perez", LocalDate.of(2001, 3, 2), "Recepcionista", 35677, 50000.0);
		Jerarquico p2 = new Jerarquico ("Maria", "Gomez", LocalDate.of(1983, 7, 15), "Gerente", 87654321, 100000.0);
		Persona p3 = new UsuarioFinal("Carlos", "Lopez", LocalDate.of(1995, 11, 20), "Cliente", "calitos", "12345678");
		Empleado p4 = new Empleado("Ana", "Garcia", LocalDate.of(1990, 5, 10), "Secretaria", 12345, 60000.0);
		Jerarquico p5 = new Jerarquico ("Chichi", "Chucu", LocalDate.of(1983, 7, 15), "Gerente", 87654321, 100000.0);


		empresa.addAsociado(p1);empresa.addAsociado(p2);empresa.addAsociado(p3);empresa.addAsociado(p4);empresa.addAsociado(p5);
		p2.addEmpleadosACargo(p1);p2.addEmpleadosACargo(p5);p2.addEmpleadosACargo(p4);
		p5.addEmpleadosACargo(p4);

		//Testeo de toString()
		//System.out.println(empresa);
		//empresa.showAsociados();
		empresa.exportarListado();

	}

}
