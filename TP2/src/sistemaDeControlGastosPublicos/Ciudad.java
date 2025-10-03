package sistemaDeControlGastosPublicos;

public class Ciudad {
	private final int MIN_HAB = 100000;
	private String nombre;
	private int habitantes;
	private double imp1, imp2, imp3, imp4, imp5, gastos;
	
	//CONSTRUCTOR
	public Ciudad(String nombre, int habitantes, double imp1, double imp2, double imp3, double imp4, double imp5,
			double gastos) {
		this.nombre = nombre;
		this.setHabitantes(habitantes);
		this.imp1 = imp1;
		this.imp2 = imp2;
		this.imp3 = imp3;
		this.imp4 = imp4;
		this.imp5 = imp5;
		this.gastos = gastos;
	}

	//GETTERS y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(int habitantes) {
		if(habitantes >= MIN_HAB) {
			this.habitantes = habitantes;
		}
	}

	public double getImp1() {
		return imp1;
	}

	public void setImp1(double imp1) {
		this.imp1 = imp1;
	}

	public double getImp2() {
		return imp2;
	}

	public void setImp2(double imp2) {
		this.imp2 = imp2;
	}

	public double getImp3() {
		return imp3;
	}

	public void setImp3(double imp3) {
		this.imp3 = imp3;
	}

	public double getImp4() {
		return imp4;
	}

	public void setImp4(double imp4) {
		this.imp4 = imp4;
	}

	public double getImp5() {
		return imp5;
	}

	public void setImp5(double imp5) {
		this.imp5 = imp5;
	}

	public double getGastos() {
		return gastos;
	}

	public void setGastos(double gastos) {
		this.gastos = gastos;
	}

	
	//OROS METODOS
	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + ", habitantes=" + habitantes + ", imp1=" + imp1 + ", imp2=" + imp2
				+ ", imp3=" + imp3 + ", imp4=" + imp4 + ", imp5=" + imp5 + ", gastos=" + gastos + "]";
	}
	
	//Balance de recaudacion y gasto
	public double balanceImpGasto() {
		return ((imp1+imp2+imp3+imp4+imp5)-gastos);
	}
	
	//Averiguar si está en déficit, gasta más de lo que recaudan
	public boolean isDeficit() {
		return (balanceImpGasto() < 0);
	}
	
	
	
	
}
