package sueldos2;

public class Main {
    public static void main(String[] args) {
        Empresa techCorp = new Empresa();

        // 1. Empleado Contratado
        EmpleadoContratado emp1 = new EmpleadoContratado("Ana López", 50000.0);

        // 2. Empleado Horas Extra ($50000 fijo + $2000 por hora extra)
        EmpleadoHorasExtra emp2 = new EmpleadoHorasExtra("Carlos Gómez", 50000.0, 2000.0);
        emp2.setHrsExtraSemana(10); // Hizo 10 hs extra -> +$20000

        // 3. Empleado Comisión ($40000 fijo + 5% de sus ventas)
        EmpleadoComision emp3 = new EmpleadoComision("María Rodríguez", 40000.0, 5.0);
        emp3.setTotalVentas(300000.0); // Vendió $300000 -> 5% es $15000

        // Cargar empleados
        techCorp.agregarEmpleado(emp1);
        techCorp.agregarEmpleado(emp2);
        techCorp.agregarEmpleado(emp3);

        // Liquidar
        techCorp.liquidarSueldos();
    }
}