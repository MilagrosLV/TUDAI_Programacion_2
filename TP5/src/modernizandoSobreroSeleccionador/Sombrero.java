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
		if(a.getCasa() == null) {
			for(Casa cc : casas) {
				cc.asignar(a);
			}
		} else {
			System.out.println(a.getNombre()+" ya pertenece a "+a.getCasa().getNombre());
		}
	}
	
	
}
