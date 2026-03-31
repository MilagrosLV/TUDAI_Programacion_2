package fabricaDeMuebles;

public class Producto {
	//ATRIBUTOS
	private double peso, costoFabricacion, valorVenta, margenVenta;
	private String madera, color, tipo;
	
	//CONSTRUCTOR
	public Producto(String tipo, double peso, double costoFabricacion, double margenVenta, String madera, String color) {
		this.tipo = tipo;
		this.peso = peso;
		this.costoFabricacion = costoFabricacion;
		this.margenVenta = margenVenta;
		this.setValorVenta(valorVenta);
		this.madera = madera;
		this.color = color;
	}
	
	//GETTERS 
	public String getTipo() {
		return tipo;
	}
	public double getPeso() {
		return peso;
	}
	public double getCostoFabricacion() {
		return costoFabricacion;
	}
	public double getValorVenta() {
		return valorVenta;
	}
	public void setValorVenta(double valorVenta) {
		this.valorVenta = (getCostoFabricacion()*margenVenta);
	}
	public String getMadera() {
		return madera;
	}
	public String getColor() {
		return color;
	}

	
	
	//OTROS METODOS
	@Override
	public String toString() {
		return "Producto [tipo= " + tipo + ", peso=" + peso + ", costoFabricacion=" + costoFabricacion + ", valorVenta="
				+ valorVenta + ", madera=" + madera + ", color=" + color + "]";
	}
	
	
}
