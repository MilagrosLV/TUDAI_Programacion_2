package elJardinPrivado;

import java.time.LocalDate;

public class Planta {
	private String nombre, paisOrigen;
	private LocalDate fechaCompra;
	private int id;
	
	private static int idIncremental = 0; //Incremental para cada Iteración

	public Planta(String nombre, String paisOrigen, LocalDate fechaCompra) {
		this.nombre = nombre;
		this.paisOrigen = paisOrigen;
		this.fechaCompra = fechaCompra;
		this.id = ++idIncremental;
	}

	//Getter and Setter Methods
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public LocalDate getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public int getId() {
		return id;
	}
	
	
	@Override
	public boolean equals(Object o) { //Con esto nos garantizanos de que el id nunca se repita
		if (this == o) return true;              // mismo objeto
		if (o == null || getClass() != o.getClass()) return false; // distinta clase
	    Planta planta = (Planta) o;
	    return id == planta.id;
	}
}
