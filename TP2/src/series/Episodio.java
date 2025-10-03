package series;

public class Episodio {
	
	private final int MAX_CALIF = 5, MIN_CALIF = 1; 
    private String titulo;
    private String descripcion;
    private boolean visto;
    private int calificacion = 0;;
    
    //CONSTRUCTORES
    public Episodio(String titulo, String descripcion, boolean visto){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.setVisto(visto);
    }
    public Episodio(String titulo, String descripcion, boolean visto, int calificacion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.setVisto(visto);
        this.setCalificacion(calificacion);
    }

    //GETTERS y SETTERS
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
    	if(!visto) {
    		this.setCalificacion(-1);
    	} 
        this.visto = visto;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        //Chequear rango
    	if(!visto) {
    		this.calificacion = -1;
    	} else {
        	if((MIN_CALIF <= calificacion) && (calificacion <= MAX_CALIF)) {
                this.calificacion = calificacion;
        	} else {
        		System.out.println("Calificación:" + calificacion + ", está fuera del rango. Vuelva a intentarlo.");
        	}
    	}
    }

	@Override
	public String toString() {
		return "Episodio [titulo=" + titulo + ", descripcion=" + descripcion + ", visto=" + visto + ", calificacion="
				+ calificacion + "]";
	}
    
    
}