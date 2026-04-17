package contactosDeUnCelular;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Contacto {
	private String nombre, apellido, nroTel, mail;
	private LocalDate dob;
	private Direccion d;
	
	public Contacto(String nombre, String apellido, String nroTel, String mail, Direccion d, LocalDate dob) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroTel = nroTel;
		this.mail = mail;
		this.d = d;
		this.dob = dob;
	}
	
	//getters
	
	public String getNombreCompleto() {
		return (nombre +", "+apellido);
	}

	public LocalDate getDob() {
		return dob;
	}
	public int getEdad() {
		LocalDate ahora = LocalDate.now();
		return Period.between(getDob(), ahora).getYears();
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNroTel() {
		return nroTel;
	}

	public String getMail() {
		return mail;
	}

	public Direccion getD() {
		return d;
	}
	public String getCiudad() {
		return d.getCiudad();
	}

	@Override
	public String toString() {
		return "Contacto [" + getNombreCompleto() + ", " + getNroTel() + ", " + getCiudad() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) { //Si referencian el mismo lugar
			return true;
		}
		if(!(obj instanceof Contacto)) { //Si no es una instancia de Contacto
			return false;
		}
		Contacto c = (Contacto) obj;//Convierto el objeto a Contacto, pues me garanticé antes de que es una instancia de Contacto, para poder aplicarle los métodos
		return this.getApellido().equals(c.getApellido()) && getNombre().equals(c.getNombre()) && getNroTel().equals(c.getNroTel());
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(apellido, nombre, nroTel);
	}
	
	
	
}
