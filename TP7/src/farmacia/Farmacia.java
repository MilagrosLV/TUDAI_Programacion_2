package farmacia;

import farmacia.filtros.*;
import java.util.HashSet;
import java.util.Set;

public class Farmacia {
	private Set<Medicamento> medicamentos;
	
	public Farmacia() {
		medicamentos = new HashSet<>();
	}
	
	//adder medicamento
	public void agregarMedicamento(Medicamento m) {
		if(m==null) throw new NullPointerException("No se puede agregar - Medicamento nulo");
		medicamentos.add(m);
	}
	
	//boolean de si tiene el medicamento, en vez de hacer un getter(puede romper encapsulamiento)
	public boolean tieneMedicamento(Medicamento m) { return medicamentos.contains(m);}
	
	//eliminar medicamento de la lista
	public void removeMedicamento(Medicamento m)  {
		if(m==null) throw new NullPointerException("No se puede eliminar - Medicamento nulo");
		if(medicamentos.contains(m)) medicamentos.remove(m);
	}
	
	//BUSCADOR
	public Set<Medicamento> buscarMedicamentos(Filtro f){
		Set<Medicamento> resultados = new HashSet<>();
		for(Medicamento mm : medicamentos) {
			if(f.cumple(mm)) resultados.add(mm);
		}
		return resultados;
	}
}
