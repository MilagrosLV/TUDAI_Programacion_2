package modernizandoSobreroSeleccionador;

import java.util.ArrayList;

public class CasaPuraSangre extends Casa {

	public CasaPuraSangre(String nombre, int cant_max_alumnos, ArrayList<Cualidad> cualidades, ArrayList<Alumno> alumnos, Casa casaEnemiga) {
		super(nombre, cant_max_alumnos, cualidades, alumnos);
	}

	
	//MÉTODOS
	public boolean esSangrePura(Alumno a) {
		boolean sangrePura = false;
		for(Alumno aC : this.getAlumnos()) {
			for(Alumno aF : a.getFamiliares()) {
				if(aC.equals(aF)) {
					sangrePura=true;
				}
			}
		}
		return sangrePura;
	}


	@Override
	public boolean cumpleCondiciones(Alumno a) {
		// TODO Auto-generated method stub
		return (cumpleCualidades(a) && !this.isLlena() && esSangrePura(a));
	}


}