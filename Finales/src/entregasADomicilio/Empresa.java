package entregasADomicilio;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<ElementoCompra> entregas;
	private List<Usuario> usuarios;

	public Empresa() {
		this.entregas = new ArrayList<>();
	}
	
	//metodos de control de lista entregas
	public void agregarEntrega(ElementoCompra ec) {
		if(ec == null) throw new NullPointerException();
		entregas.add(ec);
	}
	public void eliminarEntrega(ElementoCompra ec) {
		if(ec == null) throw new NullPointerException();
		else if (entregas.contains(ec)) entregas.remove(ec);
	}
	public boolean tieneEntrega(ElementoCompra ec) {
		if(ec == null) throw new NullPointerException();
		else if(entregas.contains(ec)) return true;
		return false;
	}
	
	//metodos de control de lista usuarios
	public void agregarUsuario(Usuario ec) {
		if(ec == null) throw new NullPointerException();
		usuarios.add(ec);
	}
	public void eliminarUsuario(Usuario ec) {
		if(ec == null) throw new NullPointerException();
		else if (usuarios.contains(ec)) usuarios.remove(ec);
	}
	public boolean tieneUsuario(Usuario ec) {
		if(ec == null) throw new NullPointerException();
		else if(usuarios.contains(ec)) return true;
		return false;
	}
	
}
