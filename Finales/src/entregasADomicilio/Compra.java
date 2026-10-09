package entregasADomicilio;

import java.util.ArrayList;
import java.util.List;

public class Compra extends ElementoCompra{
	private List<String> idProductos;
	private Usuario destinatario;
	private boolean yaEntregado;
	private double tiempoEstimadoHrs, distanciaKm;
	
	//Construcvtor
	public Compra(Usuario destinatario, boolean yaEntregado, double tiempoEstimadoHrs, double distanciaKm) {
		this.idProductos = new ArrayList<String>();
		this.destinatario = destinatario;
		this.yaEntregado = yaEntregado;
		this.tiempoEstimadoHrs = tiempoEstimadoHrs;
		this.distanciaKm = distanciaKm;
	}

	//getters
	public List<String> getIdProductos() {
		return idProductos;
	}
	public Usuario getDestinatario() {
		return destinatario;
	}
	public double getTiempoEstimadoHrs() {
		return tiempoEstimadoHrs;
	}
	public double getDistanciaKm() {
		return distanciaKm;
	}

	//setters
	public void setYaEntregado(boolean yaEntregado) {
		this.yaEntregado = yaEntregado;
	}
	public void setTiempoEstimadoHrs(double tiempoEstimadoHrs) {
		this.tiempoEstimadoHrs = tiempoEstimadoHrs;
	}
	public void setDistanciaKm(double distanciaKm) {
		this.distanciaKm = distanciaKm;
	}
	
	
	//controladores de la lista Productos
	public void agregarIdProducto(String s) {
		if(s == null || s.isBlank()) throw new NullPointerException("Valor ID PRODUCTO es nulo");
		idProductos.add(s);
	}
	public void eliminarIdProducto(String s) {
		if(s == null || s.isBlank()) throw new NullPointerException("Valor ID PRODUCTO es nulo");
		else if (idProductos.contains(s)) idProductos.remove(s);
	}
	public boolean tieneIdProducto(String s) {
		if(s == null || s.isBlank()) throw new NullPointerException("Valor ID PRODUCTO es nulo");
		else if(idProductos.contains(s)) return true;
		return false;
	}
	//contar la cantidad de productos en la compra
	public int getCantProductos() {return idProductos.size();}

	@Override
	public String getCiudad() {
		return destinatario.getCiudad();
	}
	@Override
	public boolean esYaEntregado() {
		return yaEntregado;
	}

	@Override
	public void setCiudad(String s) {
		if(s == null || s.isBlank()) throw new NullPointerException("Valor CIUDAD es nulo");
		else destinatario.setCiudad(s);

	}

	@Override
	public boolean tieneCiudad() {
		return !getCiudad().isBlank();
	}

	
	
	
}
