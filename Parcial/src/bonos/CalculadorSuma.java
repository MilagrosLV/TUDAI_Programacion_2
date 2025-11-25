package bonos;

public class CalculadorSuma extends Calculador {
	private Calculador c1, c2;
	

	public CalculadorSuma(Calculador c1, Calculador c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}


	public Calculador getC1() {
		return c1;
	}


	public void setC1(Calculador c1) {
		this.c1 = c1;
	}


	public Calculador getC2() {
		return c2;
	}


	public void setC2(Calculador c2) {
		this.c2 = c2;
	}


	@Override
	public double calcular(Bono bb) {
		// TODO Auto-generated method stub
		return c1.calcular(bb) + c2.calcular(bb);
	}

}
