package figuras;

public class MedioCirculo extends Circulo {
	//CONSTRUCTOR
	public MedioCirculo(double radio) {
		super(radio);
		this.setNombre("Medio Circulo");
	}
	
	//Métodos
	@Override
	public double getArea() {
		return super.getArea()/2;
	}
	
	@Override
	public double getPerimetro() {
		return Math.PI*this.getRadio()+this.getDiametro();
	}
}
