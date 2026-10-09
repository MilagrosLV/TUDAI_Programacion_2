package entregarADomicilio.estrategias;

import java.util.List;

import entregasADomicilio.Contenedor;

public abstract class Estrategia {
	public abstract List<Contenedor> ordenar(Contenedor c);
}
