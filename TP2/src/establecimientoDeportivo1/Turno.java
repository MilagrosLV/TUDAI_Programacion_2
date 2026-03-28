package establecimientoDeportivo1;

import java.time.LocalDateTime;

public class Turno {
	
	private Usuario u;
	private Cancha c;
	private LocalDateTime fechaHoraI, fechaHoraF;
	private double precio;
	private final double DESCUENTO=0.9, DURACION=1;
	
	
	public Turno(Usuario u, Cancha c, LocalDateTime fechaHoraI, double precio) {
		this.u = u;
		this.c = c;
		this.fechaHoraI = fechaHoraI;
		setFechaHoraF(fechaHoraI);
		this.precio = precio;
	}
	
	//GETTERS Y SETTERS
	public LocalDateTime getFechaHoraF() {
		return fechaHoraF;
	}
	public void setFechaHoraF(LocalDateTime fechaHoraI) {
		this.fechaHoraF = fechaHoraI.plusHours((long) DURACION);
	}
	public Usuario getU() {
		return u;
	}
	public Cancha getC() {
		return c;
	}
	public LocalDateTime getFechaHoraI() {
		return fechaHoraI;
	}
	public double getPrecio() {
		return precio;
	}
	public double getDESCUENTO() {
		return DESCUENTO;
	}
	public String getNombre() {
		return u.getNombre();
	}
	
	//OTROS MÉTODOS
	
	
	
}
