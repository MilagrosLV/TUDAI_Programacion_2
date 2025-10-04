package vivero.filtros;

import vivero.Planta;

public class FiltroSolSuperior extends Filtro{
    //ATRIBUTES
    private final int nroConsultado;

    //CONSTRUCTOR
    public FiltroSolSuperior(int nroConsultado){
        this.nroConsultado = nroConsultado;
    }

    //OTHER METHODS
    @Override
    public boolean eval(Planta p){
        return p.getSol() > this.nroConsultado;
    }
}
