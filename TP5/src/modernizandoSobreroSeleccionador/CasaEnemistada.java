package modernizandoSobreroSeleccionador;

import java.util.ArrayList;

public class CasaEnemistada extends Casa {
	//ATRIBUTOS
	private Casa casaEnemiga;

	//CONSTRUCTOR
	public CasaEnemistada(String nombre, int cant_max_alumnos, ArrayList<Cualidad> cualidades, Casa casaEnemiga) {
		super(nombre, cant_max_alumnos, cualidades);
		this.casaEnemiga = casaEnemiga;
	}

	//GETTERS Y SETTERS
	public Casa getCasaEnemiga() {
		Casa copiaC = casaEnemiga;
		return copiaC;
	}
	
	//OTROS MÉTODOS

	@Override
	public boolean cumpleCondiciones(Alumno a) {
		// TODO Auto-generated method stub
		return (this.cumpleCualidades(a) && !this.isLlena());
	}
	
}
