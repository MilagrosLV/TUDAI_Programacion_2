package vivero.filtros;

import vivero.Planta;

public class FiltroSolInferior extends Filtro{
    //ATRIBUTES
    private int nroConsultado;

    //CONSTRUCTOR
    public FiltroSolInferior (int nroConsultado){
        this.nroConsultado = nroConsultado;
    }

    //OTHER METHODS
    public boolean eval(Planta p){
        return p.getSol() < this.nroConsultado;
    }
}
