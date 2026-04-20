package seleccionDeFutbol;

public enum Estado {
	VIAJANDO("Viajando"),
    CONCENTRANDO("En concentración"),
    ORIGEN("En país de origen");

    private final String descripcion;

    private Estado(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
