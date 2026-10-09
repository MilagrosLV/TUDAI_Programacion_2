package entregasADomicilio;

import java.util.ArrayList;
import java.util.List;

public class Contenedor extends ElementoCompra {
	protected List<ElementoCompra> compras;
	
	public Contenedor() {this.compras=new ArrayList<>();}
	
	//controladores de la lista Productos MEJORAR
	public void agregarElementoCompra(ElementoCompra ec) {
		if(ec == null) throw new NullPointerException("Valor ElementoCompra es nulo");
		else if(!this.tieneCiudad() && ec.tieneCiudad()) setCiudad(ec.getCiudad());
		else if(getCiudad().equals(ec.getCiudad())) compras.add(ec);
	}
	public void eliminarElementoCompra(ElementoCompra s) {
		if(s == null) throw new NullPointerException("Valor ElementoCompra es nulo");
		else if (compras.contains(s)) compras.remove(s);
	}
	public boolean tieneElementoCompra(ElementoCompra s) {
		if(s == null) throw new NullPointerException("Valor ElementoCompra es nulo");
		else if(compras.contains(s)) return true;
		return false;
	}

	
	//Metodos heredados
	@Override
	public String getCiudad() {
		if(compras.isEmpty()) return "";
		return compras.getFirst().getCiudad();
	}

	@Override
	public boolean esYaEntregado() {
		for(ElementoCompra ec : compras) {
			if(!ec.esYaEntregado()) return false;
		}
		return true;
	}

	@Override
	public void setCiudad(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getTiempoEstimadoHrs() {
		double tiempoMax=0.0;
		for(ElementoCompra ec:compras) {
			if(tiempoMax < ec.getTiempoEstimadoHrs())
				tiempoMax = ec.getTiempoEstimadoHrs();
		}
		return tiempoMax;
	}

	@Override
	public boolean tieneCiudad() {
		return !getCiudad().isBlank();
	}
	
}
