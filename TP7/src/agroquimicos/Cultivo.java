package agroquimicos;

import java.util.ArrayList;
import java.util.List;

public class Cultivo {
	//ATRIBUTOS
	private final String nombre;
	private final List<Enfermedad> enfermedades;
	
	//CONSTRUCTOR
	public Cultivo(String nombre){
		this.nombre = nombre;
		enfermedades = new ArrayList <>();
	}
	
	//MÉTODOS
	public String getNombre(){
		return nombre;
	}
		  
	public void agregarEnfermedad(Enfermedad e){
		enfermedades.add(e);
	}
		  
	public boolean esUtil(Agroquimico a){
		 for(Enfermedad e: enfermedades){
		    if(a.trataEnfermedad(e) && !a.usoDesaconsejado(this)){
		        return true;
		      }
		 }
		return false;
	}
		  
	@Override
	public boolean equals(Object o){
		if(o == null){
		    return false;
		}
		Cultivo c = (Cultivo) o;
		return this.nombre.equals(c.getNombre());  
	}
}
