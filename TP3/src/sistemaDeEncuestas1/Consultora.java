package sistemaDeEncuestas1;

import java.util.ArrayList;

public class Consultora {
	private ArrayList<Encuesta> encuestas, encuestasRealizadas;
	private ArrayList<Empleado> empleados;

	public Consultora() {
		this.encuestas = new ArrayList<>();
		this.encuestasRealizadas = new ArrayList<>();
		this.empleados = new ArrayList<>();
	}

	public ArrayList<Encuesta> getEncuestas() {
		return encuestas;
	}
	public ArrayList<Encuesta> getEncuestasRealizadas() {
		return encuestasRealizadas;
	}
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	
	public void addEncuesta(Encuesta e) {
		if(getEncuestas().contains(e))
		getEncuestas().add(e);
	}
	public void addEncuestaRealizada(Encuesta e) {
		if(getEncuestasRealizadas().contains(e))
		getEncuestasRealizadas().add(e);
	}
	public void addEmpleados(Empleado e) {
		if(getEmpleados().contains(e))
		getEmpleados().add(e);
	}
	
	//Otros métodos
	public void encuestar(Encuesta e) {
		if(!encuestada(e)) {
			addEncuestaRealizada(e);
			e.getEm().addEncuesta(e);
		} else {
			System.out.println(e.getPer()+" ya respondió la encuesta de "+e.getFor().getTitulo());
		}
	}

	private boolean encuestada(Encuesta e) {
		for(Encuesta ee : encuestasRealizadas ) {
			if(e.getFor().equals(ee.getFor()) && e.getPer().getDni().equals(ee.getPer().getDni())) {
				return true;
			}		
		}
		return false;
	}
	
	
}
