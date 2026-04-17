package contactosDeUnCelular;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Celular {
	private ArrayList<Contacto> contactos;
	
	public Celular () {
		this.contactos = new ArrayList<>();
	}
	
	//Adder
	public void agregarContacto(Contacto c) {
		contactos.add(c);
	}
	
	//getter
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}
	//otros
	public void mostrarContactos() {
		System.out.println("Lista de Contactos:");
		getContactos().forEach(System.out::println); //System.out::println es abreviatura de contacto -> System.out.println(contacto)
	}
	
	public void mostrarResumen() {
		mostrarContactos();
		System.out.println("Lista de Repetidos:");
		contactosRepetidos().forEach(System.out::println);
		System.out.println("Promedio de Edad:");
		System.out.println(promedioEdad());
	}
	
	public ArrayList<Contacto> contactosRepetidos() {
		Set<Contacto> unicos = new HashSet<>(); //En la colección HashSet no se pueden repetir objetos.
		ArrayList<Contacto> repetidos = new ArrayList<>();
		
		for(Contacto cc : contactos) {
			if(!(unicos.add(cc))) { //Si no se puede agregar a HashSet, significa que ya existe. El método add() de un Set devuelve true si el elemento se agregó correctamente.
				repetidos.add(cc);
			}
		}
		return repetidos;
	}
	
	public double promedioEdad() {
		if(contactos == null || contactos.isEmpty()) {
			return 0.0;
		}
		int suma=0;
		for(Contacto cc : contactos) {
			suma += cc.getEdad();
		}
		return (double)suma/contactos.size();
	}
	
	public ArrayList<Contacto> contactosPorTel(String tel) {
		ArrayList<Contacto> mismoTel = new ArrayList<>();
		for(Contacto cc: contactos) {
			if(cc.getNroTel().equals(tel)) {
				mismoTel.add(cc);
			}
		}
		return mismoTel;
	}
}
