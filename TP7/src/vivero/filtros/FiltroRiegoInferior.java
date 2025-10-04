package vivero.filtros;

import vivero.Planta;

public class FiltroRiegoInferior extends Filtro{
    //ATRIBUTES
    private final int nroConsultado;

    //CONSTRUCTOR
    public FiltroRiegoInferior(int nroConsultado){
        this.nroConsultado = nroConsultado;
    }

    //OTHER METHODS
    @Override
    public boolean eval(Planta p){
        return p.getAgua() < this.nroConsultado;
    }
}
