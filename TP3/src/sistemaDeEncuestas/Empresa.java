import java.util.ArrayList;
import java.util.List;

public class Empresa {
	  private List<Encuesta> encuestas;
	  private List<String> empleados;
	  
	  public Empresa(){
	    this.encuestas = new ArrayList<Encuesta>();
	    this.empleados = new ArrayList<String>();
	  }
	  
	  public void agregarEmpleado(String nuevoEmpleado){
	     if( !empleados.contains(nuevoEmpleado) ){
	        empleados.add(nuevoEmpleado);
	    }
	  }
	  
	  private boolean encuestaYaRespondida(int id, int documentoPersona){
	    for(Encuesta e: encuestas){
	      if(documentoPersona == e.getDocumentoPersona() && id == e.getId()){ //Doy por entendido que hay una clase Persona
	        return true;
	      }
	    }
	    return false;
	  }
	  
	  public void realizarEncuesta(int id, int documentoPersona, String empleado){
	    if(!encuestaYaRespondida(id, documentoPersona)){
	      Encuesta e = new Encuesta(id, documentoPersona, empleado);
	      encuestas.add(e);
	    }
	  }
	  
	  public void cantidadEncuestasPorEmpleado(){
	    for(String e: empleados){
	      int cantEncuestas = 0;
	      for(Encuesta en: encuestas){
	         if(e.equals(en.getEmpleado())){//Doy por entendido que hay una clase Persona
	           cantEncuestas++;
	         } 
	      }
	      System.out.println("El empleado " + e + " realizo " + cantEncuestas + " encuestas");
	    }
	  }
}
