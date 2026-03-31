package sistemaDeEncuestas;

public class Encuesta {
	private Formulario f;
	private Persona p;
	private Empleado e;
	
	public Encuesta(Formulario f, Persona p, Empleado e) {
		this.f = f;
		this.p = p;
		this.e = e;
	}

	public Formulario getFor() {
		return f;
	}
	public Persona getPer() {
		return p;
	}
	public Empleado getEm() {
		return e;
	}
	
	public void encuestar() {
		getEm().addEncuesta(this);
	}

	@Override
	public String toString() {
		return "Encuesta [f=" + f + ", p=" + p + ", e=" + e + "]";
	}
	
	
	
	
	
	
}
