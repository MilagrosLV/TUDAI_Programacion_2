package vivero.filtros;

import vivero.Planta;

public class FiltroRiegoInferior extends Filtro{
    //ATRIBUTES
    private int nroConsultado;

    //CONSTRUCTOR
    public FiltroRiegoInferior(int nroConsultado){
        this.nroConsultado = nroConsultado;
    }

    //OTHER METHODS
    public boolean eval(Planta p){
        return p.getAgua() < this.nroConsultado;
    }
}
