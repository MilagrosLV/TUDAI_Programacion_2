package vivero.filtros;

import vivero.Planta;

public class FiltroClasificacionIgual extends Filtro{
    //ATRIBUTES
    private final String nombreConsultado;

    //CONSTRUCTOR
    public FiltroClasificacionIgual(String nombreConsultado){
        this.nombreConsultado = nombreConsultado.toLowerCase();
    }

    //OTHER METHODS
    @Override
    public boolean eval(Planta p){
        return p.getClasificacionSuperior().toLowerCase().equals(this.nombreConsultado);
    }
}
