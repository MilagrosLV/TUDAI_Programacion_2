package sueldos;

public class EmpleadoHrExtra extends Empleado {

	private double hrsExtra, montoHr;

	public EmpleadoHrExtra(String nombre, double sueldoBase, double hrsExtra, double montoHr) {
		super(nombre, sueldoBase);
		this.hrsExtra = hrsExtra;
		this.montoHr = montoHr;
	}

	public double getHrsExtra() {
		return hrsExtra;
	}

	public double getMontoHr() {
		return montoHr;
	}
	
	@Override
	public double calcularSueldo() {
		return this.getSueldoBase()+(getMontoHr()*getHrsExtra());
		
	}
	
}
