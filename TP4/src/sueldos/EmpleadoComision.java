package sueldos;

public class EmpleadoComision extends Empleado {
	private double cantVentas, porcentajeComision;//porcentaje 0.1, es el 10% de comisión

	public EmpleadoComision(String nombre, double sueldoBase, double cantVentas, double porcentajeComision) {
		super(nombre, sueldoBase);
		this.cantVentas = cantVentas;
		this.porcentajeComision = porcentajeComision;
	}

	public double getCantVentas() {
		return cantVentas;
	}

	public double getPorcentajeComision() {
		return porcentajeComision;
	}
	
	@Override
	public double calcularSueldo() {
		return this.getSueldoBase()+(getCantVentas()*getPorcentajeComision());
	}
}
