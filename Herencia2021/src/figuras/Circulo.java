package figuras;

public class Circulo extends Figura2D {
	//ATRIBUTOS
	private double radio;
	
	//CONSTRUCTOR
	public Circulo (double radio) {
		super("Circulo");
		this.radio=radio;
	}
	
	//GETTERS Y SETTERS
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	//Otrosz métodos
	public double getDiametro() {
		return this.getRadio()*this.getRadio(); //d = 2r
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*(Math.pow(this.getRadio(), 2)); // A = π*r^2
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return Math.PI*(this.getDiametro()); // p = π*d
	}

}
