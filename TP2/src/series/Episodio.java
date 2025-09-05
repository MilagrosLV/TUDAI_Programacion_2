package series;

public class Episodio {
	//ATTRIBUTES
	private String titulo, descripcion;
	private boolean visto;
	private int calificacion;
	private final int MAX_CALIF=5, MIN_CALIF=0;
	
	//CONSTRUCTOR
	public Episodio(String titulo, String descripcion, boolean visto, int calificacion) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.visto = visto;
		this.calificacion = calificacion;
	}

	//GETTERS AND SETTERS
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isVisto() {
		return visto;
	}
	public void setVisto(boolean visto) {
		this.visto = visto;
	}

	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		if(isVisto()) {
			if(calificacion<=MAX_CALIF && MIN_CALIF<=calificacion)
				this.calificacion = calificacion;
			else
				System.out.println("Calificación fuera del rango");
		} else {
			this.calificacion = -1;
		}
	}
	
	//OTHER METHODS
	
}
