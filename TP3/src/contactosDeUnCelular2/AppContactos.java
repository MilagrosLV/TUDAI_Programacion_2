package contactosDeUnCelular2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AppContactos {
	private List<Contacto> contactos;
	
	public AppContactos() {
		contactos = new ArrayList<>();
	}

	//getters
	public List<Contacto> getContactos() {
		return List.copyOf(contactos);
	}
	
	public List<Contacto> getContactosRepetidos() {
		Set<Contacto>unicos= new HashSet<>();
		Set<Contacto>duplicados = new HashSet<>();
		for(Contacto c : contactos) {
			if(!unicos.add(c)) duplicados.add(c);
		}
		
		List<Contacto> resultado = new ArrayList<>();
		for(Contacto c : contactos) {
			if(duplicados.contains(c)) resultado.add(c);
		}
		return resultado;
	}
	
	public double getEdadPromedio() {
		if(contactos.isEmpty()) return 0.0;
		double edad = 0.0;
		int cant = 0;
		for(Contacto c : contactos) {
			if(c.getEdad()!=0) {
				cant++;
				edad += c.getEdad();
			}
		}
		if(cant==0)return 0.0;
		return edad/(double)cant;
	}
	
	//getter lista de contactos con mismo nro telefonico
	public List<Contacto> getContactosNroTel(String tel){
		List<Contacto> repetidos = new ArrayList<>();
		if(tel == null) return repetidos;
		for(Contacto c : getContactos()) {
			if(tel.equals(c.getNroTel())) 	repetidos.add(c);
		}
		return repetidos;
	}
	
	//adder
	public void agregarContacto(Contacto c) {
		contactos.add(c);
	}
	
	//view
	public void resumen() {
        System.out.println("=== TOTAL DE CONTACTOS ===");
        for (Contacto c : contactos) {
            System.out.println(c);
        }

        System.out.println("\n=== CONTACTOS REPETIDOS ===");
        for (Contacto c : getContactosRepetidos()) {
            System.out.println(c);
        }

        System.out.println("\nPromedio de edad: " + getEdadPromedio());
    }
	
	
}
