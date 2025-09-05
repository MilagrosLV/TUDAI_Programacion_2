package electrodomesticos;

public class Electrodomestico {
	private String nombre, color;
	private double precioBase, consumoEnergetico, peso;
	
	//CONSTRUCTORS
	public Electrodomestico(String nombre, String color, double precioBase, double consumoEnergetico, double peso) {
		this.nombre = nombre;
		this.color = color;
		this.precioBase = precioBase;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}
	public Electrodomestico(String nombre, String color, double precioBase, double consumoEnergetico) {
		this(nombre, color, precioBase, consumoEnergetico, 2);
	}
	public Electrodomestico(String nombre, String color, double precioBase) {
		this(nombre, color, precioBase, 10, 2);
	}
	public Electrodomestico(String nombre, String color) {
		this(nombre, color, 100, 10, 2);
	}
	public Electrodomestico(String nombre) {
		this(nombre, "Gris Plata", 100, 10, 2);
	}
	
	//GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public double getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public void setConsumoEnergetico(double consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	//OTHER METHODS
	public boolean esBajoConsumo() {
		return getConsumoEnergetico()<45;
	}
	public double balanceCostoPeso() {
		return getPrecioBase()/getPeso();
	}
	public boolean esAltaGama() {
		return balanceCostoPeso()>3;
	}
	
	
	
}
