package agroquimicos;

import java.util.List;
import java.util.ArrayList;

public class SistAgroquimico {
	private List<Agroquimico> agroquimicos;
	  
	public SistAgroquimico(){
	  agroquimicos = new ArrayList<Agroquimico>();
	}
	  
	public void agregarAgroquimico(Agroquimico a){
	  agroquimicos.add(a);
	}
	  
	public List<Agroquimico> agroquimicosDadaEnfermedad(Enfermedad e){
	  List<Agroquimico> agroquimicosEnf = new ArrayList<Agroquimico>();
	  for(Agroquimico a: agroquimicos){
	    if(a.trataEnfermedad(e)){
	        agroquimicosEnf.add(a);
	    }
	  }
	  return agroquimicosEnf;
	}
	  
	public List<Agroquimico> agroquimicosTratados(Enfermedad e, Cultivo c){
	  List<Agroquimico> agroquimicosTrat = new ArrayList<Agroquimico>();
	  for(Agroquimico a: agroquimicos){
	    if(a.trataEnfermedad(e) && !a.usoDesaconsejado(c)){
	      agroquimicosTrat.add(a);
	    }
	  }
	  return agroquimicosTrat;
	}
}
