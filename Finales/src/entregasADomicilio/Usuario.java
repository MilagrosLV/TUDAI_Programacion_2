package entregasADomicilio;

import java.util.Objects;

public class Usuario {
	private String nombre, apellido, direccion, ciudad;
	
	public Usuario(String nombre, String apellido, String direccion, String ciudad) {
		this.nombre=nombre.toLowerCase();
		this.apellido=apellido.toLowerCase();
		this.direccion=direccion.toLowerCase();
		this.ciudad=ciudad.toLowerCase();
	}
	
	public Usuario(String nombre, String apellido, String direccion) {
		this(nombre, apellido, direccion, "");
	}

	//getters y setter de ciudad
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad.toLowerCase();
	}

	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	
	//otros metodos
	public boolean tieneCiudad() {
		return !getCiudad().isBlank();
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Usuario u = (Usuario)o;
			return nombre.equals(u.nombre) && apellido.equals(u.apellido) 
					&& direccion.equals(u.direccion);
		} catch (Exception e) {
			return false;
		}
	}
	@Override
	public int hashCode() {return Objects.hash(nombre, apellido, direccion);}
}
