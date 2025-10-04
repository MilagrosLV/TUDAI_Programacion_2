package vivero.filtros;

import vivero.Planta;

public class FiltroRiegoSuperior extends Filtro{
    //ATRIBUTES
    private int nroConsultado;

    //CONSTRUCTOR
    public FiltroRiegoSuperior (int nroConsultado){
        this.nroConsultado = nroConsultado;
    }

    //OTHER METHODS
    public boolean eval(Planta p){
        return p.getAgua() > this.nroConsultado;
    }
}
