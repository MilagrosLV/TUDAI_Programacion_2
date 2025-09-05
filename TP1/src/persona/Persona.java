package persona;

import java.time.LocalDate;

public class Persona {
	private String nombre, apellido, dni;
	private int edad;
	private LocalDate fechaNacimiento, fechaActual=LocalDate.now();
	private char sexo;
	private double peso, altura;
	
	//CONSTRUCTORES
	public Persona(String dni) {
		this("N", "N", dni, edad, LocalDate.of(2000, 1, 1), 'F', 1, 1);
	}
	public Persona(String nombre, String apellido, String dni) {
		this(nombre, apellido, dni, edad, LocalDate.of(2000, 1, 1), 'F', 1, 1);
	}
	public Persona(String nombre, String apellido, String dni, int edad) {
		this(nombre, apellido, dni, edad, LocalDate.of(2000, 1, 1), 'F', 1, 1);
	}
	public Persona(String nombre, String apellido, String dni, int edad, LocalDate fechaNacimiento) {
		this(nombre, apellido, dni, edad, fechaNacimiento, 'F', 1, 1);
	}	
	public Persona(String nombre, String apellido, String dni, int edad, LocalDate fechaNacimiento, char sexo) {
		this(nombre, apellido, dni, edad, fechaNacimiento, sexo, 1, 1);
	}
	public Persona(String nombre, String apellido, String dni, int edad, LocalDate fechaNacimiento, char sexo, double peso) {
		this(nombre, apellido, dni, edad, fechaNacimiento, sexo, peso, 1);
	}
	public Persona(String nombre, String apellido, String dni, int edad, LocalDate fechaNacimiento, char sexo, double peso,
			double altura) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	//GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaActual() {
		return fechaActual;
	}
	public void setFechaActual(LocalDate fechaActual) {
		this.fechaActual = fechaActual;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getDni() {
		return dni;
	}
	
	//OTHER METHODS
	public double masaCorporal() {
		return getPeso()/Math.sqrt(getAltura());
	}
	
	public boolean estaEnForma() {
		return ((18.5<masaCorporal()) && (masaCorporal()<25));
	}
	
	public boolean esSuCumpleanios() {
		return ((fechaActual.getMonthValue() == fechaNacimiento.getMonthValue()) && (fechaActual.getDayOfMonth() == fechaNacimiento.getDayOfMonth()));
	}
	
	public boolean esMayorEdad() {
		final int MIN_ADULTO=18; 
		return (getEdad()>MIN_ADULTO);
	}
	
	public boolean puedeVotar() {
		final int MIN_EDAD_VOTAR=16; 
		return (getEdad()>MIN_EDAD_VOTAR);
	}

	public boolean tieneEdadCoherente() {
		int edad = fechaActual.getYear()-fechaNacimiento.getYear();
		
		if(fechaActual.getMonthValue() < fechaNacimiento.getMonthValue()) { //Mese antes
			edad--;
			return (getEdad() == edad);
		}
		} else if (fechaActual.getMonthValue() == fechaNacimiento.getMonthValue()){
			if(fechaActual.getDayOfMonth() < fechaNacimiento.getDayOfMonth()) { //Antes del cumple
				edad--;
				return (getEdad() == edad);
			}
		} else {
			return (getEdad() == edad);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
