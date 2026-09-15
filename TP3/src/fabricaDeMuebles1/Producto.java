package fabricaDeMuebles1;

import java.util.Objects;

public class Producto {
	private double peso, costoFabrica;
	private int porcentajeGanancia;
	private String nombre, color, tipoMadera;
	
	
	public Producto(String nombre, double peso, double costoFabrica, int porcentajeGanancia, String color,
			String tipoMadera) {
		this.peso = peso;
		this.costoFabrica = costoFabrica;
		this.porcentajeGanancia = porcentajeGanancia;
		this.nombre = nombre;
		this.color = color;
		this.tipoMadera = tipoMadera;
	}
	public Producto(String nombre, double peso, double costoFabrica, String color,	String tipoMadera) {
		this(nombre, peso, costoFabrica, 35, color, tipoMadera);
	}
	
	
	//getters
	public double getPeso() {
		return peso;
	}
	public double getCostoFabrica() {
		return costoFabrica;
	}
	//calcular Valor de Venta

	public double getValorVenta() {
		return (((double)getPorcentajeGanancia()/100)+1)*getCostoFabrica();
	}
	public int getPorcentajeGanancia() {
		return porcentajeGanancia;
	}
	public String getNombre() {
		return nombre;
	}
	public String getColor() {
		return color;
	}
	public String getTipoMadera() {
		return tipoMadera;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(color, costoFabrica, nombre, peso, porcentajeGanancia, tipoMadera);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(color, other.color)
				&& Double.compare(costoFabrica, other.costoFabrica) == 0
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso)
				&& porcentajeGanancia == other.porcentajeGanancia 
				&& Objects.equals(tipoMadera, other.tipoMadera);
	}
	
	
}
