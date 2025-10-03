import java.util.ArrayList;
import java.util.List;


public class Encuesta {
	private int id;
	
	private List<String> preguntas;
	private int dniEmpleado;
	private String nombreEmpleado;
	
	public Encuesta (int id, int dniEmpleado, String nombreEmpleado) {
		this.preguntas = new ArrayList<String>();
		this.id = id;
		this.dniEmpleado = dniEmpleado;
		this.nombreEmpleado = nombreEmpleado;
	}
	
	public void agregarPregunta(String nuevaPregunta) {

	}
}
