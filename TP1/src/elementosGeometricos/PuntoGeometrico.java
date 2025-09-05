package elementosGeometricos;

public class PuntoGeometrico {
	private int x, y;

	//CONSTRUCTORS
	public PuntoGeometrico(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public PuntoGeometrico() {
		this(0, 0);
	}
	
	//GETTERS AND SETTERS METHODS
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//OTHER METHODS
	public void desplazarPunto(int incrementarX, int incrementarY) {
		//Cambiar valor X
			incrementarX += this.getX();
			this.setX(incrementarX);
		//Cambiar valor Y
			incrementarY += this.getY();
			this.setY(incrementarY);
	}
	
	public double calcularDistanciaEuclidea(PuntoGeometrico pp) {
		return Math.sqrt(Math.pow((this.getX()-pp.getX()), 2)+Math.pow((this.getY()-pp.getY()), 2));
	}
	
	
	
	
	
}
