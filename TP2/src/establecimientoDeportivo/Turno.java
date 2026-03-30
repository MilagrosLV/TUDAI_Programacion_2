package establecimientoDeportivo;

import java.time.LocalDateTime;

public class Turno {
	
	private Usuario u;
	private Cancha c;
	private LocalDateTime fechaHoraI, fechaHoraF;
	private final double DESCUENTO=0.9;
	private final int DURACION=1;
	
	
	public Turno(Usuario u, Cancha c, LocalDateTime fechaHoraI) {
		this.u = u;
		this.c = c;
		this.fechaHoraI = fechaHoraI;
		setFechaHoraF(fechaHoraI);
	}
	
	
	//GETTERS Y SETTERS
	public LocalDateTime getFechaHoraF() {
		return fechaHoraF;
	}
	public void setFechaHoraF(LocalDateTime fechaHoraI) {
		this.fechaHoraF = fechaHoraI.plusHours(DURACION);
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
		if(u.isSocio()) {
			return c.getPrecio()*this.getDESCUENTO();
		}
		return c.getPrecio();
	}
	public double getDESCUENTO() {
		return DESCUENTO;
	}	
}
