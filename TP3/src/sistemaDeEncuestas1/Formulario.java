package sistemaDeEncuestas1;

import java.util.ArrayList;

public class Formulario {
	private String titulo;
	private ArrayList<Pregunta>preguntas;
	
	public Formulario(String titulo) {
		this.titulo = titulo;
		this.preguntas = new ArrayList<>();
	}
	
	public String getTitulo() {
		return titulo;
	}
	public ArrayList<Pregunta> getPreguntas() {
		return preguntas;
	}
	public void addPregunta(Pregunta p) {
		if(!getPreguntas().contains(p)) {
			getPreguntas().add(p);
		} else {
			System.out.println("Pregunta repetida. No se agrega.");
		}
	}

	@Override
	public String toString() {
		return "Formulario [titulo=" + titulo + ", preguntas=" + preguntas + "]";
	}
	
	
	
	
}
