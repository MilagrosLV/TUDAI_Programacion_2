package figuras;

public class Cuadrilatero extends Figura2D {
	//ATRIBUTOS
	private double lado1, lado2;
	
	//CONSTRUCTOR
	public Cuadrilatero (double lado1, double lado2){
		super("Cuadrilatero");
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	//getters y setters
	public double getLado1() {
		return lado1;
	}

	public double getLado2() {
		return lado2;
	}



	//OTROS MÉTODOS
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return getLado1()*getLado2();
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2*(this.getLado1()+this.getLado2());
	}

}
