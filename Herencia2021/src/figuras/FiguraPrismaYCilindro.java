package figuras;

public class FiguraPrismaYCilindro {
	//ATRIBUTOS
	private Figura2D base;
	private double altura;
	private String nombre;
	
	//CONSTRUCTOR
	public FiguraPrismaYCilindro(Figura2D base, double altura, String nombre) {
		this.base=base;
		this.altura=altura;
		this.nombre=nombre;
	}

	//GETTERS Y SETTERS
	public Figura2D getBase() {
		return base;
	}
	public void setBase(Figura2D base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//OTROS MÉTODOS
	public double getArea() { // A = 2*Area base + Area lateral
		// A = 2* A base + Perimetro base * altura

		return(2*base.getArea())+(base.getPerimetro()*this.getAltura());
	}
	
	
	
}
