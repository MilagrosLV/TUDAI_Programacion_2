package sueldos2;

public class EmpleadoHorasExtra extends Empleado{
	private double sueldoPorHrExtra;
	private int hrsExtraSemana;
	
	public EmpleadoHorasExtra(String nombre, double sueldoFijo, double sueldoPorHrExtra) {
		super(nombre, sueldoFijo);
		this.sueldoPorHrExtra=sueldoPorHrExtra;
		hrsExtraSemana=0;
	}

	//getter
	public double getSueldoPorHrExtra() {return sueldoPorHrExtra;}
	public double getHrsExtraSemana() {return hrsExtraSemana;}
	
	//incrementar
	public void setHrsExtraSemana(int hrs) {if(hrs>=0)hrsExtraSemana = hrs;}
	
	//resetaear hrs extra hexhas en la semana
	public void resetHrsExtraSemana() {hrsExtraSemana=0;}
	
	@Override
	public double getSueldoTotal() {
		return getSueldoFijo() + getHrsExtraSemana()*getSueldoPorHrExtra();
	}
	
}
