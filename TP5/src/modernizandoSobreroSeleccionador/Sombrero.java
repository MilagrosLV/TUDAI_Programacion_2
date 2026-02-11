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
	
	public void sortear(Alumno a) {	
		if(a.getCasa() == null) {//Veo si ya tiene una casa asignada
			//Hago un formato de vetos pára lidiar con la CasaeNEMISTADA
			ArrayList<Casa> casasVetadas = new ArrayList<>();
			for(Casa cc : casas) {
				if(cc instanceof CasaEnemistada) {
					CasaEnemistada enemistada = (CasaEnemistada) cc;
					if(enemistada.cumpleCondiciones(a)) {
						//Chequear si ya fue agregadop a la Casa enemiga y sacar el estudiante??
						casasVetadas.add(enemistada.getCasaEnemiga());
						
					}
				}
			}
			
			//Después sorteo una vez que ya se han sacado las casas enemigas
			for(Casa cc : casas) {
				if(!casasVetadas.contains(cc) && a.getCasa() == null) {//Si esta casa no es vetada y el alumno no tiene casa aún
					cc.asignar(a);
					for(Casa ccc : casas) {
						for (Alumno aa : ccc.getAlumnos()) {
							a.actualizarFamiliares(aa);
						}
					}
				}
			}
		} else {
			System.out.println(a.getNombre()+" ya pertenece a "+a.getCasa().getNombre());
		}
	}
	
	
}
