package entregasADomicilio;

public abstract class ElementoCompra {
	public abstract boolean esYaEntregado();
	public abstract String getCiudad();
	public abstract void setCiudad(String s);
	public abstract boolean tieneCiudad();
	public abstract double getTiempoEstimadoHrs();

}
