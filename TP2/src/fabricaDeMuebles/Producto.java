package fabricaDeMuebles;

public class Producto {
	//ATRIBUTOS
	private double peso, costoFabricacion, porcentajeVenta;
	private String tipoMadera, color, nombre;
	
	//CONSTRUCTOR
	public Producto(double peso, double costoFabricacion, double porcentajeVenta, String tipoMadera, String color,
			String nombre) {
		this.peso = peso;
		this.costoFabricacion = costoFabricacion;
		this.setPorcentajeVenta(porcentajeVenta);
		this.tipoMadera = tipoMadera;
		this.color = color;
		this.nombre = nombre;
	}

	//GETTERS
	public double getPeso() {
		return peso;
	}

	public double getCostoFabricacion() {
		return costoFabricacion;
	}

	public double getValorVenta() {		
		return (getPorcentajeVenta()*getCostoFabricacion())+getCostoFabricacion();
	}

	public String getTipoMadera() {
		return tipoMadera;
	}

	public String getColor() {
		return color;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPorcentajeVenta() {
		return porcentajeVenta;
	}

	public void setPorcentajeVenta(double pv) {
		if(pv<=1 && pv<=0) {
			this.porcentajeVenta = pv;
		}else {
			this.porcentajeVenta = 0;
		}
	}
	
	
	
	
}
