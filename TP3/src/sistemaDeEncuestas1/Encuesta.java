package sistemaDeEncuestas1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Encuesta {
	private Set<String> preguntas;
	private Persona p;
	private Empleado e;
	
	public Encuesta (Empleado e, Persona p) {
		this.e=e; 
		this.p=p;
		this.preguntas = new HashSet<String>();
	}
	
	public Encuesta () {
		this(null, null);
	}
	
	//getters
	public Persona getPersona() {return this.p;}
	public Empleado getEmpleado() {return this.e;}
	public Set<String> getPreguntas(){ return Set.copyOf(this.preguntas);}
	//getter de dni de Persona
	public String getDni() { return this.p.getDni();}
	
	//adders
	public void addPregunta(String pr) {
		 preguntas.add(pr);
	}
	public void addPreguntas(Set<String> pp) { 
		preguntas.addAll(pp);
	}
	public void addPersona(Persona pe) {
		if(isPersonaNull()) p=pe; 
	}
	public void addEmpleado(Empleado em) {
		if(isEmpleadoNull()) e=em;
	}
	//add encuesta a la lista de encuestas del empleado, para saber en cuantas participó y así calcular su sueldo
	public void addEncuestaAEmpleado() {
		if(!isEmpleadoNull()) this.e.addEncuesta(this);
	}
	
	
	//metodos de verificacion de persona y empleado
	public boolean isPersonaNull() {return p==null;}
	public boolean isEmpleadoNull() { return Objects.isNull(this.e);}
	
	
	@Override
	public boolean equals(Object o) {
		if(this==o)return true;
		if(o == null || this.getClass() != o.getClass()) return false;
		Encuesta e = (Encuesta)o;
		return Objects.equals(this.preguntas, e.preguntas);
	}

	@Override
	public int hashCode() {
		return Objects.hash(preguntas);
	}
	
	
}
