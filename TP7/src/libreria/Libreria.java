package libreria;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Libreria {
	private String nombre;
	private Set<Cliente> clientes;
	private List<Producto> productos;
	
	public Libreria(String nombre) {
		if(nombre == null) throw new IllegalArgumentException("No se puede crear la libreria. Nombre nulo.");
		this.nombre=nombre;
		clientes= new HashSet <>();
		productos = new ArrayList<>();
	}
	
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre= nombre;}
	
	//adders
	public void agregarCliente(Cliente c) {
		if(c == null) throw new NullPointerException("No se puede agregar cliente. Es nulo");
		clientes.add(c);
	}
	public void agregarProducto(Producto p) {
		if(p == null) throw new NullPointerException("No se puede agregar producto. Es nulo.");
		if(!tieneProducto(p)) productos.add(p);
	}
	//remover
	public void eliminarCliente(Cliente c) {
		if(c == null) throw new NullPointerException("No se puede eliminar cliente. Es nulo");
		clientes.remove(c);
	}
	public void eliminarProducto(Producto p) {
		if(p == null) throw new NullPointerException("No se puede eliminar producto. Es nulo.");
		if(tieneProducto(p)) productos.remove(p);
	}
	//tiene boolean
	public boolean tieneCliente(Cliente c) {
		if(c == null) throw new NullPointerException("No se puede saber si tiene cliente. Es nulo");
		return clientes.contains(c);
	}
	public boolean tieneProducto(Producto c) {
		if(c == null) throw new NullPointerException("No se puede saber si tiene producto. Es nulo");
		return productos.contains(c);
	}
	
	
	//1.
	public double calcularPrecioProducto(Cliente c, Producto p) {
		return p.getPrecio() * (1.0-(c.getDescuento()/100));
	}
	
	//2.
	public boolean yaTieneProducto(Cliente c, Producto p) {
		return c.tieneCompra(p);
	}
	
	//3.
	public boolean leGustaProducto(Cliente c, Producto p, Condicion con) {
		return con.cumple(c, p);
	}
	
	//4.
	public List<Cliente> lesGustaProducto(Producto p, Condicion con){
		List<Cliente> resultado = new ArrayList<>();
		for(Cliente cc : clientes) {
			if(con.cumple(cc, p)) resultado.add(cc);
		}
		return resultado;
	}
	
}
