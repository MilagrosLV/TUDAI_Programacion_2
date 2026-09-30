package sueldos2;

public class EmpleadoComision extends Empleado{
	private double porcentaje;
	private double totalVentas;
	
	public EmpleadoComision(String nombre, double sueldoFijo, double porcentaje) {
		super(nombre, sueldoFijo);
		this.porcentaje=porcentaje;
		this.totalVentas=0;
	}
	
	@Override
	public double getSueldoTotal() {
		return getSueldoFijo() + getPorcentajeVentas();
	}

	//getters
	public double getTotalVentas() {return totalVentas;}
	public void setTotalVentas(double totalVentas) {if(totalVentas>=0)this.totalVentas = totalVentas;}

	public double getPorcentaje() {return porcentaje;}
	
	private double getPorcentajeVentas() {return getTotalVentas()*getPorcentaje();}
	

}
