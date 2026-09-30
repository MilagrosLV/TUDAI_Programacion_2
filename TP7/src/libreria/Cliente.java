package libreria;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Cliente {
	private String nombre, dni, direccion;
	private double descuento;
	private List<String> autoresFavoritos;
	private Set<String> generosFavoritos;
	private List<Producto> historialCompras;
	
	public Cliente(String nombre, String dni, String direccion, double descuento) {
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.descuento=descuento;
		autoresFavoritos= new ArrayList<String>();
		generosFavoritos= new HashSet<>();
		historialCompras= new ArrayList<>();
	}

	//getters y setters
	public String getNombre() {		return nombre;	}
	public void setNombre(String nombre) {		this.nombre = nombre;	}
	public String getDni() {		return dni;	}
	public void setDni(String dni) {		this.dni = dni;	}
	public String getDireccion() {		return direccion;	}
	public void setDireccion(String direccion) {		this.direccion = direccion;	}
	public double getDescuento() {		return descuento;	}
	public void setDescuento(double descuento) {		this.descuento = descuento;	}
	
	
	//adders
	public void addAutorFavorito(String autor) {
		if(autor == null) throw new NullPointerException("No se puede agregar autor a favoritos, porque es nulo.");
		if(!autoresFavoritos.contains(autor.toLowerCase())) autoresFavoritos.add(autor.toLowerCase());
	}	
	public void addGeneroFavorito(String genero) {
		if(genero == null) throw new NullPointerException("No se puede agregar genero a favoritos, porque es nulo.");
		generosFavoritos.add(genero.toLowerCase());
	}	
	public void addCompra(Producto producto) {
		if(producto == null) throw new NullPointerException("No se puede agregar producto a historial, porque es nulo..");
		if(!historialCompras.contains(producto)) historialCompras.add(producto);
	}
	
	//removers
	public void removeAutorFavorito(String autor) {
		if(autor == null) throw new NullPointerException("No se puede eliminar autor a favoritos, porque es nulo.");
		if(autoresFavoritos.contains(autor.toLowerCase())) autoresFavoritos.remove(autor.toLowerCase());
	}	
	public void removeGeneroFavorito(String genero) {
		if(genero == null) throw new NullPointerException("No se puede eliminar genero a favoritos, porque es nulo.");
		generosFavoritos.remove(genero.toLowerCase());
	}	
	public void removeCompra(Producto producto) {
		if(producto == null) throw new NullPointerException("No se puede eliminar producto a historial, porque es nulo..");
		if(historialCompras.contains(producto)) historialCompras.remove(producto);
	}
	
	//boolean tiene
	public boolean tieneAutorFavorito(String autor) {
		if(autor == null) throw new NullPointerException("No se puede eliminar autor a favoritos, porque es nulo.");
		return this.autoresFavoritos.contains(autor.toLowerCase());
	}	
	public boolean tieneGeneroFavorito(String genero) {
		if(genero == null) throw new NullPointerException("No se puede eliminar genero a favoritos, porque es nulo.");
		return generosFavoritos.contains(genero.toLowerCase());
	}	
	public boolean tieneCompra(Producto producto) {
		if(producto == null) throw new NullPointerException("No se puede eliminar producto a historial, porque es nulo..");
		return historialCompras.contains(producto);
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Cliente p = (Cliente)o;
			return this.getNombre().equals(p.getNombre()) && this.getDni().equals(p.getDni());
		} catch (Exception e) {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre, dni);
	}
	
	
}
