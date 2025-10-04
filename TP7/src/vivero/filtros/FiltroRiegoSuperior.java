package vivero.filtros;

import vivero.Planta;

public class FiltroRiegoSuperior extends Filtro{
    //ATRIBUTES
    private final int nroConsultado;

    //CONSTRUCTOR
    public FiltroRiegoSuperior (int nroConsultado){
        this.nroConsultado = nroConsultado;
    }

    //OTHER METHODS
    @Override
    public boolean eval(Planta p){
        return p.getAgua() > this.nroConsultado;
    }
}
