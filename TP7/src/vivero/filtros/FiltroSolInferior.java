package vivero.filtros;

import vivero.Planta;

public class FiltroSolInferior extends Filtro{
    //ATRIBUTES
    private final int nroConsultado;

    //CONSTRUCTOR
    public FiltroSolInferior (int nroConsultado){
        this.nroConsultado = nroConsultado;
    }

    //OTHER METHODS
    @Override
    public boolean eval(Planta p){
        return p.getSol() < this.nroConsultado;
    }
}
