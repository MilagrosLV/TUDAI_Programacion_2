package modernizandoSobreroSeleccionador;

import java.util.ArrayList;

public class Sombrero {
	//ATRIBUTOS
	private ArrayList<Casa>casas;

	//CONSTRUCTORES
	public Sombrero(ArrayList<Casa> casas) {
		this.casas = casas;
	}
	public Sombrero() {
		this.casas = new ArrayList<>();
	}
	
	//GETTERS Y SETTERS
	public ArrayList<Casa> getCasas() {
		return new ArrayList<Casa>(casas);
	}
	//MÉTODOS
	public void addCasa(Casa c) {
		boolean repetido=false;
		for(Casa cc : casas) {
			if(cc.equals(c)) {
				repetido = true;
				System.out.println("Esta casa ya existe");
			}
		}
		if (!repetido) {
			casas.add(c);
		}
	}
	
	/**
	 * Realiza el sorteo de un alumno a una casa.
	 * Verifica si el alumno ya tiene casa asignada.
	 * Maneja las enemistades entre casas: si una casa enemistada acepta al alumno,
	 * la casa enemiga es vetada para este alumno.
	 * El alumno se asigna a la primera casa (en orden) que cumple las condiciones.
	 */
	public void sortear(Alumno a) {	
		if(a.getCasa() == null) {//Veo si ya tiene una casa asignada
			//Hago un formato de vetos pára lidiar con la CasaeNEMISTADA
			ArrayList<Casa> casasVetadas = new ArrayList<>();
			for(Casa cc : casas) {
				if(cc instanceof CasaEnemistada) {
					CasaEnemistada enemistada = (CasaEnemistada) cc;
					if(enemistada.cumpleCondiciones(a)) {
						//Si el alumno cumple condiciones para una casa enemistada,
						// vetamos la casa enemiga
						casasVetadas.add(enemistada.getCasaEnemiga());
						
					}
				}
			}
			
			//Después sorteo una vez que ya se han sacado las casas enemigas
			for(Casa cc : casas) {
				if(!casasVetadas.contains(cc) && a.getCasa() == null) {//Si esta casa no es vetada y el alumno no tiene casa aún
					cc.asignar(a);
				}
			}
			if (!(a.getCasa() instanceof Casa)) {
				System.out.println("No se pudo asignar una casa a "+a.getNombre());
			}
		} else {
			System.out.println(a.getNombre()+" ya pertenece a "+a.getCasa().getNombre());
		}
	}
	
	
}
