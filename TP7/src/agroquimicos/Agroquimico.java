package agroquimicos;
import java.util.List;
import java.util.ArrayList; 

public class Agroquimico {
	//ATRIBUTOS
	private final String nombre;
	private final List<Cultivo> cultivosDesanconsejados;
	private final List<String> estadosPatologicos;
	
	//CONSTRUCTOR
	public Agroquimico(String nombre){
		this.nombre = nombre;
		cultivosDesanconsejados = new ArrayList <>();
		estadosPatologicos = new ArrayList <>();
	}
	
	//MÉTODOS
	public void agregarCultivo(Cultivo c){
		cultivosDesanconsejados.add(c);
	}
	  
	public void agregarEstadoPat(String e){
	    estadosPatologicos.add(e);
	}
	  
	public boolean usoDesaconsejado(Cultivo c){
	    return cultivosDesanconsejados.contains(c);
	}
	  
	public boolean trataEnfermedad(Enfermedad e){
	  //A la enfermedad se le deberia hacer un metodo que devuelva una copia de su lista
	    List<String> estadosPatEnfermedad = e.getEstadosPatologicos();
	  for(String estadoEnf: estadosPatEnfermedad){
	    if(!estadosPatologicos.contains(estadoEnf)){
	        return false;
	    }
	  }
	  return true;
	}
	
	public String getNombre() {
		return nombre;
	}
	  
}
