package bonos;

import java.util.ArrayList;

public class Bono extends ElementoBono {
	//Atributos
	private String descripcion;
	private int nroEmision;
	private double valorNominal;
	
	//Constructor
	public Bono(int cuit, String descripcion, int nroEmision, int valorNominal) {
		super(cuit);
		this.descripcion = descripcion;
		this.nroEmision = nroEmision;
		this.valorNominal = valorNominal;
	}
	
	

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setNroEmision(int nroEmision) {
		this.nroEmision = nroEmision;
	}
	public void setValorNominal(int valorNominal) {
		this.valorNominal = valorNominal;
	}



	@Override
	public double getValorNominal() {
		// TODO Auto-generated method stub
		return this.valorNominal;
	}

	@Override
	public int getNroEmision() {
		// TODO Auto-generated method stub
		return this.nroEmision;
	}



	@Override
	public double getRendimiento() {
		// TODO Auto-generated method stub
		return calcular(this);
	}



	@Override
	public ArrayList<Bono> buscar(Filtro ff) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
