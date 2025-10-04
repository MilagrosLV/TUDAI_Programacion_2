package agroquimicos;

import java.util.ArrayList;
import java.util.List;

public class Enfermedad {
	//ATRIBUTOS
	private final String nombre;
	private final List<String> estadosPatologicos;
	
	//CONSTRUCTOR
	public Enfermedad(String nombre){
		this.nombre = nombre;
		estadosPatologicos = new ArrayList <>();
	}
	
	//MÉTODOS
	public void agregarEstadoPat(String e) {
		estadosPatologicos.add(e);
	}
	
	public List<String> getEstadosPatologicos (){
		return (new ArrayList<>(estadosPatologicos));
	}

	public String getNombre() {
		return nombre;
	}	
	
}
