package farmacia;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Medicamento {
	private String nombre, laboratorio;
	private double precio;
	private Set<String> trataSintomas;
	
	public Medicamento(String nombre, String laboratorio) {
		this.nombre=nombre; this.laboratorio=laboratorio;
		trataSintomas=new HashSet<>();
	}
	
	//getters
	public String getNombre() { return nombre.toLowerCase();}
	public String getLaboratorio() { return laboratorio.toLowerCase();}
	public double getPrecio() {return precio;}
	
	//adder Sintoma
	public void agregarSintoma(String s) {
		if(s==null) throw new NullPointerException("No se puede agregar - Sintoma nulo.");
		trataSintomas.add(s);
	}
	
	//boolean en vez de getter
	public boolean tieneSintoma(String s) {
		if(s==null) throw new NullPointerException("No se puede saber si trata el sintoma - Sintoma nulo.");
		return trataSintomas.contains(s);
	}
	
	//remove eliminar Sintoma que trata el medicamento
	public void removeSintoma(String s) {
		if(s==null) throw new NullPointerException("No se puede eliminar sintoma - Sintoma nulo.");
		if(tieneSintoma(s)) trataSintomas.remove(s);
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o) return true;
		if(o==null || this.getClass()!=o.getClass()) return false;
		Medicamento m = (Medicamento)o;
		return Objects.equals(this.nombre, m.nombre) && Objects.equals(this.laboratorio, m.laboratorio) && Double.compare(m.precio, precio) == 0;
	}
	
	@Override
	public int hashCode() { return Objects.hash(nombre, laboratorio, precio);}

	

}