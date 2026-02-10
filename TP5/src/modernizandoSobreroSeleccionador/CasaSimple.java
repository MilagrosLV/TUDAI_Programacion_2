package modernizandoSobreroSeleccionador;

import java.util.ArrayList;

public class CasaSimple extends Casa {

	public CasaSimple(String nombre, int cant_max_alumnos, ArrayList<Cualidad> cualidades, ArrayList<Alumno> alumnos) {
		super(nombre, cant_max_alumnos, cualidades, alumnos);

	}

	@Override
	public boolean cumpleCondiciones(Alumno a) {
		// TODO Auto-generated method stub
		return (this.cumpleCualidades(a) && !this.isLlena());
	}

}
