package elementosGeometricos;

public class Rectangulo {
	//ATTRIBUTES
	private double base, altura;
	private PuntoGeometrico p1, p2;
	
	//CONSTRUCTORS
	public Rectangulo(PuntoGeometrico p1, PuntoGeometrico p2) {
		this.p1=p1;
		this.p2=p2;
		this.base = calcularBase(this.p1, this.p2);
		this.altura = calcularAltura(this.p1, this.p2);
	}

	//GETTERS AND SETTERS METHODS
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//OTHER METHODS
	public double calcularBase(PuntoGeometrico p1, PuntoGeometrico p2) {
		return Math.abs(p1.getX()-p2.getX());
	}
	
	public double calcularAltura(PuntoGeometrico p1, PuntoGeometrico p2) {
		return Math.abs(p1.getY()-p2.getY());
	}
	
	public void desplazarEnPlano(int x, int y) {
		this.p1.desplazarPunto(x, y);
		this.p2.desplazarPunto(x, y);
	}
	
	public double calcularArea() {
		return this.getBase()*this.getAltura();
	}
	
	public int compararRectangulos(Rectangulo rr) {
		if(this.calcularArea()>rr.calcularArea())
			return 1;
		else if (this.calcularArea() == rr.calcularArea())
			return 0;
		else
			return -1;
	}
	
	public boolean esCuadrado() {
		return this.getAltura()==this.getBase();
	}
	
	public boolean estaAcostado() {
		return this.getBase()>this.getAltura();
	}


	
	
	
	
}
