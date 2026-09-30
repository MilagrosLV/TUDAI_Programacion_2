package sueldos2;

public class EmpleadoContratado extends Empleado{
	
	public EmpleadoContratado(String nombre, double sueldoFijo) {
		super(nombre, sueldoFijo);
	}
	
	@Override
	public double getSueldoTotal() {return super.getSueldoFijo();}
}
