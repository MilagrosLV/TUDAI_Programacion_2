package bonos;

import java.util.ArrayList;

public abstract class ElementoBono {
	//Atributos
	private int cuit;

	public ElementoBono(int cuit) {
		super();
		this.cuit = cuit;
	}

	//Metodos getters y setters
	public int getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	
	//Metodos Abs
	public abstract double getValorNominal();
	public abstract int getNroEmision();
	
	public abstract double getRendimiento();
	public abstract ArrayList<Bono> buscar(Filtro ff);
	
}
