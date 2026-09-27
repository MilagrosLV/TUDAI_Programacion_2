package juegoDePersonajes3;

import java.util.EnumMap;
import java.util.Map;

public class Personaje {
	private String nombre, nombreSuper;
	private boolean esHeroe;
	private Map<Cualidad, Integer> caracteristicas;
	
	public Personaje(String nombre, String nombreSuper, boolean esHeroe) {
		this.nombre=nombre;
		this.nombreSuper=nombreSuper;
		this.esHeroe=esHeroe;
		this.caracteristicas = new EnumMap<Cualidad, Integer>(Cualidad.class);
		
		//Inicializo el Map con su cualidad pero no con sus valores asosiados, esos se agregar con un patrón Builder
		for(Cualidad c : Cualidad.values()){ //Cualidad.values() llama los valores del enum
			caracteristicas.put(c, null);
		}
	}
	
	//getters
	public String getNombre() {return nombre;}
	public String getNombreSuper() {return nombreSuper;}
	public boolean getEsHeroe() {return esHeroe;}
	public int getValorCualidad(Cualidad c) {return caracteristicas.get(c);}
	
	//asignar valores a cualidades
	public void asignarValorCualidad(Cualidad c, int valor) {
		caracteristicas.put(c, valor);
	}
	
	//Checkear si todas sus caractertisticas tienen valores
	public boolean esJugable() { return !caracteristicas.containsValue(null);}
	
	
}
