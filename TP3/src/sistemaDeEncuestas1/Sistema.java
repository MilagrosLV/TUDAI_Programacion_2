package sistemaDeEncuestas1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sistema {
	private ArrayList<Encuesta> encuestas, encuestasRealizadas;
	private Set<Empleado> empleados;
	
	public Sistema() {
		this.encuestas= new ArrayList<Encuesta>();
		this.encuestasRealizadas = new ArrayList<Encuesta>();
		this.empleados = new HashSet<Empleado>();
	}
	
	//getters
	public Set<Empleado> getEmpleados(){return Set.copyOf(empleados);}
	public List<Encuesta> getEncuestasRealizadas(){return List.copyOf(encuestasRealizadas);}
	public List<Encuesta> getEncuesta(){return List.copyOf(encuestas);}
	public int getCantEncuestasPorEmpleado(Empleado e) {return e.cantEncuestas();}
	public double getSueldoTotalEmpleado(Empleado e) { return e.getSueldoTotal();}	
	
	//adders
	public void addEmpleado(Empleado e) {empleados.add(e);}
	public void addEncuesta(Encuesta e) {
		if(encuestas.contains(e)) encuestas.add(e);
	}
	public void addEncuestaRealizada(Encuesta e) {
		if(!e.isEmpleadoNull() && !e.isPersonaNull()) {
			if(!personaRepiteEncuesta(e)) {
				this.encuestasRealizadas.add(e);
			} else {
				System.out.println(e.getPersona()+" ya realizó esta encuesta.");
			}
		}
	}
	
	
	//Metodo booleano que chequea si una persona ya respondió la misma encuesta.
	public boolean personaRepiteEncuesta(Encuesta e) {
		for(Encuesta ee : encuestasRealizadas) {
			if(ee.equals(e) && ee.getPersona().equals(e.getPersona()))
				return true;
		}
		return false;
	}
	
	//metodo de encuestar
	public void encuestar(Encuesta en, Empleado em, Persona p) {
		//Instancio una encuesta para agregar a encuestasRealizadas
		Encuesta enc = new Encuesta();
		enc.addPreguntas(en.getPreguntas());
		enc.addEmpleado(em);
		enc.addPersona(p);
		
		this.addEncuestaRealizada(enc);
		enc.getEmpleado().addEncuesta(enc);
	}
}
