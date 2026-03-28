package fabricaDeMuebles;

public class Producto {
	//ATRIBUTOS
	private final double PORCENTAJE_AGREGADO_PRECIO_VENTA = 35;
	private double peso, costoFabricacion, valorVenta;
	private String madera, color, tipo;
	
	//CONSTRUCTOR
	public Producto(String tipo, double peso, double costoFabricacion, String madera, String color) {
		this.tipo = tipo;
		this.peso = peso;
		this.costoFabricacion = costoFabricacion;
		this.setValorVenta(valorVenta);
		this.madera = madera;
		this.color = color;
	}
	
	//GETTERS Y SETTERS
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getCostoFabricacion() {
		return costoFabricacion;
	}
	public void setCostoFabricacion(double costoFabricacion) {
		this.costoFabricacion = costoFabricacion;
	}
	public double getValorVenta() {
		return valorVenta;
	}
	public void setValorVenta(double valorVenta) {
		this.valorVenta = (((PORCENTAJE_AGREGADO_PRECIO_VENTA + 100)*getCostoFabricacion())/100);
	}
	public String getMadera() {
		return madera;
	}
	public void setMadera(String madera) {
		this.madera = madera;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	//OTROS METODOS
	@Override
	public String toString() {
		return "Producto [tipo= " + tipo + ", peso=" + peso + ", costoFabricacion=" + costoFabricacion + ", valorVenta="
				+ valorVenta + ", madera=" + madera + ", color=" + color + "]";
	}
	
	
}
