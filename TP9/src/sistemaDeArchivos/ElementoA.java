package sistemaDeArchivos;

import java.time.LocalDate;

public abstract class ElementoA {
	//Atributos
	private String nombre;
	private LocalDate fechaCreacion;
	private double tamanio;
	
	
	public abstract String getNombre();
	public abstract LocalDate getFechaCreacion();
	
}
