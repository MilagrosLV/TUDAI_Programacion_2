package sistemaDeEncuestas1;

public class Pregunta {
	private String preg;

	public Pregunta(String preg) {
		this.preg = preg;
	}

	public String getPreg() {
		return preg;
	}

	@Override
	public String toString() {
		return "Pregunta [preg=" + preg + "]";
	}
	
	
	
}
