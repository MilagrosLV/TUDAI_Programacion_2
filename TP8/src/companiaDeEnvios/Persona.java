package companiaDeEnvios;

class Persona {
    private String nombre;
    private String direccion, ciudad;

    public Persona(String nombre, String direccion, String ciudad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    public String getCiudad() {
    	String lower_case_city = this.ciudad.toLowerCase();
        return lower_case_city;
    }
}
