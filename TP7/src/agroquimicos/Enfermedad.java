package agroquimicos;

import java.util.ArrayList;
import java.util.List;

public class Enfermedad {
	//ATRIBUTOS
	private String nombre;
	private List<String> estadosPatologicos;
	
	//CONSTRUCTOR
	public Enfermedad(String nombre){
		this.nombre = nombre;
		estadosPatologicos = new ArrayList <String>();
	}
	
	//MÉTODOS
	public void agregarEstadoPat(String e) {
		estadosPatologicos.add(e);
	}
	
	public List<String> getEstadosPatologicos (){
		return (new ArrayList<String>(estadosPatologicos));
	}

	public String getNombre() {
		return nombre;
	}	
	
}
