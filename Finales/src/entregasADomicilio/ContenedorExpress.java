package entregasADomicilio;

public class ContenedorExpress extends Contenedor{
	private final double MIN_TIEMPO = 1.0;
	private double hrsMenos;

	public ContenedorExpress(double hrsMenos) {
		super();
		this.hrsMenos=hrsMenos;
	}
	
	//ver si cumple con el tiempo
	public boolean esExpress(ElementoCompra ec) { return ec.getTiempoEstimadoHrs()-hrsMenos >= MIN_TIEMPO;}
	
	@Override
	public void agregarElementoCompra(ElementoCompra ec) {
		if(ec == null) throw new NullPointerException("Valor ElementoCompra es nulo");
		else if(!this.tieneCiudad() && ec.tieneCiudad() && esExpress(ec)) setCiudad(ec.getCiudad());
		else if(getCiudad().equals(ec.getCiudad())) compras.add(ec);
	}
	

}
