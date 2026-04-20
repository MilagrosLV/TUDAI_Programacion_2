package avicola1;

import java.time.LocalDate;

public abstract class Producto {
	private LocalDate fechaVencimiento, fechaEnvasado;
	private int lote;
	private String granjaOrigen;
	private String nombre;
	
	
	public Producto(String nombre, LocalDate fechaVencimiento, LocalDate fechaEnvasado, int lote, String granjaOrigen) {
		this.nombre = nombre;
		this.fechaVencimiento = fechaVencimiento;
		this.fechaEnvasado = fechaEnvasado;
		this.lote = lote;
		this.granjaOrigen = granjaOrigen;
	}
	
	
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}
	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}
	public int getLote() {
		return lote;
	}
	public String getGranjaOrigen() {
		return granjaOrigen;
	}


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", fechaVencimiento=" + fechaVencimiento + ", fechaEnvasado=" + fechaEnvasado + ", lote=" + lote
				+ ", granjaOrigen=" + granjaOrigen + "]";
	}
	
	
	
}
