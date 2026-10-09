package entregarADomicilio.estrategias;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import entregasADomicilio.Contenedor;
import entregasADomicilio.comparator.*;


public class EstrategiaRapida extends Estrategia{
	private Comparator c = new ComparadorRapida();

	@Override
	public List<Contenedor> ordenar(Contenedor cc) {
		return Collections.sort((cc.getElementos, c);;
	}
	
	
}
