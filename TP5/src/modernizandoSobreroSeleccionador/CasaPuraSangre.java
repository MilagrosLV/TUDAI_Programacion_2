package modernizandoSobreroSeleccionador;

import java.util.ArrayList;

/**
 * Casa que requiere que el alumno posea todas las cualidades,
 * haya espacio disponible Y tenga un familiar que ya pertenezca a esta casa
 * (conservar el linaje de sangre pura).
 */
public class CasaPuraSangre extends Casa {

	public CasaPuraSangre(String nombre, int cant_max_alumnos, ArrayList<Cualidad> cualidades) {
		super(nombre, cant_max_alumnos, cualidades);
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