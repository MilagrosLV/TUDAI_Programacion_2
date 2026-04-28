package jardinPrivado;

import java.time.LocalDate;

public class Planta {
	private String nombreCientifico, nombreComun, paisOrigen;
	private LocalDate fechaCompra;
	private final int id;
	private static int contadorId = 0; //Lo declaro acá. Al ser static, es de la clase, no de la Instancia
	
	public Planta (String nombreCientifico, String nombreComun, String paisOrigen, LocalDate fechaCompra) {
		this.nombreCientifico = nombreCientifico;
		this.nombreComun = nombreComun;
		this.paisOrigen = paisOrigen;
		this.fechaCompra = fechaCompra;
		this.id = ++contadorId;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public String getNombreComun() {
		return nombreComun;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public LocalDate getFechaCompra() {
		return fechaCompra;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "\n Planta [id=" + id+ ", nombreCientifico=" + nombreCientifico + ", nombreComun=" + nombreComun + ", paisOrigen="
				+ paisOrigen + ", fechaCompra=" + fechaCompra +"]";
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(id); // compara solo el id
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planta other = (Planta) obj;
		return  id == other.id; // Son iguales si tienen el mismo ID.
	}
	
	
	
	
}
