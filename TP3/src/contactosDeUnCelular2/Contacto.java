package contactosDeUnCelular2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Contacto {
	private String nombre, apellido, nroTel, ciudad, direccion, mail;
	private LocalDate dob;
	
	
	public Contacto(Builder b) {
		this.nombre = b.nombre;
		this.apellido = b.apellido;
		this.nroTel = b.nroTel;
		this.ciudad = b.ciudad;
		this.direccion = b.direccion;
		this.mail = b.mail;
		this.dob = b.dob;
	}
	//PATRÓN BUILDER
	public static class Builder{
		private String nombre, apellido, nroTel, ciudad, direccion, mail;
		private LocalDate dob;
		
		public Builder(String nombre, String apellido, String nroTel) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.nroTel = nroTel;
		}

		//setters
		public Builder ciudad(String ciudad) {
			this.ciudad = ciudad;
			return this;
		}

		public Builder direccion(String direccion) {
			this.direccion = direccion;
			return this;
		}

		public Builder mail(String mail) {
			this.mail = mail;
			return this;
		}

		public Builder dob(LocalDate dob) {
			this.dob = dob;
			return this;
		}
		//Creo el constructor
		public Contacto build() {
			return new Contacto (this);
		}
		
		
		
		
	}
	
	//getters
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getNroTel() {
		return nroTel;
	}
	public String getCiudad() {
		if(ciudad!=null && !ciudad.isBlank()) return ciudad;
		return "-";
	}
	public String getDireccion() {
		return direccion;
	}
	public String getMail() {
		return mail;
	}
	public LocalDate getDob() {
		return dob;
	}
	public int getEdad() {
		if(dob == null) return 0;
		return Period.between(dob, LocalDate.now()).getYears();
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellido, nombre, nroTel);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(nroTel, other.nroTel);
	}
	@Override
    public String toString() {
        return apellido + " " + nombre + " | Edad: " + getEdad() + 
               " | Tel: " + getNroTel() + " | Ciudad: " + getCiudad();
    }
	
	
}
