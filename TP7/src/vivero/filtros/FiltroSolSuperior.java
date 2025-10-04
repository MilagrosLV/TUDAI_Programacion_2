package vivero.filtros;

import vivero.Planta;

public class FiltroSolSuperior extends Filtro{
    //ATRIBUTES
    private int nroConsultado;

    //CONSTRUCTOR
    public FiltroSolSuperior(int nroConsultado){
        this.nroConsultado = nroConsultado;
    }

    //OTHER METHODS
    public boolean eval(Planta p){
        return p.getSol() > this.nroConsultado;
    }
}
