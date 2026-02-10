package modernizandoSobreroSeleccionador;

import java.util.ArrayList;

public class CasaEnemistada extends Casa {
	//ATRIBUTOS
	private Casa casaEnemiga;

	//CONSTRUCTOR
	public CasaEnemistada(String nombre, int cant_max_alumnos, ArrayList<Cualidad> cualidades, ArrayList<Alumno> alumnos, Casa casaEnemiga) {
		super(nombre, cant_max_alumnos, cualidades, alumnos);
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
		if(casaEnemiga.cumpleCondiciones(a)) {
			//Hago que la casa enemiga est{e llena y después corrigo a su cant anterior al cambio.
			int cant_max_aux = casaEnemiga.getCant_max_alumnos();
			casaEnemiga.setCant_max_alumnos(casaEnemiga.getAlumnos().size());
		}
		return (this.cumpleCualidades(a) && !this.isLlena());
	}
	
}
