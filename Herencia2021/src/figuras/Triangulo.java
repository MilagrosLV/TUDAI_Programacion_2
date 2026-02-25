package figuras;

public class Triangulo extends Figura2D {
	//ATRIBUTOS
	private double lado1, lado2, lado3;
	
	//CONSTRUCTOR
	public Triangulo (double lado1, double lado2, double lado3) {
		super("Triangulo");
		this.lado1=lado1;
		this.lado2=lado2;
		this.lado3=lado3;
	}
	
	//GETTERS Y SETTERS
	public double getLado1() {
		return lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public double getLado3() {
		return lado3;
	}


	@Override
	public double getArea() {
		double s = (getLado1()+getLado2()+getLado3())/2; //Semiperímetro
		return Math.sqrt((s*(s-getLado1())*(s-getLado2())*(s-getLado3())));//Formula de Herón
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return this.getLado1()+this.getLado2()+this.getLado3();
	}

}
