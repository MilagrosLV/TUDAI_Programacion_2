package jardinPrivado;

import java.util.ArrayList;
import java.util.List;

public class Jardin {
	private List<Planta> plantas;
	
	public Jardin() {
		this.plantas = new ArrayList<Planta>();
	}
	
	//adder
	public void addPlanta(Planta p) {
		if (p == null) {
	        System.err.println("Error: No se puede agregar una planta nula.");
	        return; // Early return para evitar anidación
	    }
	    
	    if (plantas.contains(p)) {
	        System.out.println("La planta " + p.getNombreComun() + " ya está en el jardín.");
	    } else {
	        plantas.add(p);
	    }
	}

	@Override
	public String toString() {
		return "Jardin [plantas=" + plantas + "]";
	}

	

}
