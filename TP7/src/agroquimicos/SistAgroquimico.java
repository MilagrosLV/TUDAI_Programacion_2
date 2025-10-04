package agroquimicos;

import java.util.List;
import java.util.ArrayList;

public class SistAgroquimico {
	private final List<Agroquimico> agroquimicos;
	  
	public SistAgroquimico(){
	  agroquimicos = new ArrayList<>();
	}
	  
	public void agregarAgroquimico(Agroquimico a){
	  agroquimicos.add(a);
	}
	  
	public List<Agroquimico> agroquimicosDadaEnfermedad(Enfermedad e){
	  List<Agroquimico> agroquimicosEnf = new ArrayList<>();
	  for(Agroquimico a: agroquimicos){
	    if(a.trataEnfermedad(e)){
	        agroquimicosEnf.add(a);
	    }
	  }
	  return agroquimicosEnf;
	}
	  
	public List<Agroquimico> agroquimicosTratados(Enfermedad e, Cultivo c){
	  List<Agroquimico> agroquimicosTrat = new ArrayList<>();
	  for(Agroquimico a: agroquimicos){
	    if(a.trataEnfermedad(e) && !a.usoDesaconsejado(c)){
	      agroquimicosTrat.add(a);
	    }
	  }
	  return agroquimicosTrat;
	}
}
