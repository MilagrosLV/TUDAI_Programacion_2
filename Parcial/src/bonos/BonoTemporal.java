package bonos;

import java.time.LocalDate;

public class BonoTemporal extends Bono {
	//Atributos
	private LocalDate inicio, fin;
	private ElementoBono contenido;
	private static double porcentaje = 0.5;
	
	
	public BonoTemporal(int cuit, String descripcion, int nroEmision, int valorNominal, LocalDate inicio, LocalDate fin,
			ElementoBono contenido) {
		super(cuit, descripcion, nroEmision, valorNominal);
		this.inicio = inicio;
		this.fin = fin;
		this.contenido = contenido;
	}


	public LocalDate getInicio() {
		return inicio;
	}
	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}
	public LocalDate getFin() {
		return fin;
	}
	public void setFin(LocalDate fin) {
		this.fin = fin;
	}
	public ElementoBono getContenido() {
		return contenido;
	}
	public void setContenido(ElementoBono contenido) {
		this.contenido = contenido;
	}
	
	//Metodo si está vigente el BONO
	public boolean estaVigente() {
		LocalDate hoy = LocalDate.now();
		return hoy.isBefore(fin) && hoy.isAfter(inicio);
	}
	
	@Override 
	public double getValorNominal() {
		if(estaVigente()) {
			return contenido.getValorNominal();
		} else {
			return contenido.getValorNominal() * (1-porcentaje);
		}
	}
	@Override 
	public double getRendimiento() {
		if(estaVigente()) {
			return contenido.getRendimiento();
		} else {
			return 0;
		}
	}



}
