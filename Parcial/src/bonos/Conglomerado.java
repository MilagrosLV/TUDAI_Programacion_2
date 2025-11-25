package bonos;

import java.util.ArrayList;

public class Conglomerado extends ElementoBono {
	private ArrayList<ElementoBono> elementos;

	public Conglomerado(int cuit) {
		super(cuit);
		elementos = new ArrayList<>();
	}

	
	//Metodos
	public void agregarElemento(ElementoBono ee) {
		if(!elementos.contains(ee)) {
			elementos.add(ee);
		}
	}
	
	
	
	@Override
	public double getValorNominal() {
		int suma = 0;
		for(ElementoBono ee : elementos) {
			suma += ee.getValorNominal();
		}
		return suma;
	}

	@Override
	public int getNroEmision() {
		int max =-1;//Representa null
		
		for(ElementoBono ee : elementos) {
			int aux = ee.getNroEmision();
			if (aux > max) {
				max = aux;
			}
		}
		
		return max;
	}
	
	@Override
	public double getRendimiento() {
		int suma = 0;
		for(ElementoBono ee : elementos) {
			suma += ee.getRendimiento();
		}
		return suma;
	}

}
