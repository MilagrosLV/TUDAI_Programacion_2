package vivero.filtros;

import vivero.Planta;

public class FiltroClasificacionIgual extends Filtro{
    //ATRIBUTES
    private String nombreConsultado;

    //CONSTRUCTOR
    public FiltroClasificacionIgual(String nombreConsultado){
        this.nombreConsultado = nombreConsultado;
    }

    //OTHER METHODS
    public boolean eval(Planta p){
        return p.getClasificacionSuperior().equals(this.nombreConsultado);
    }
}
