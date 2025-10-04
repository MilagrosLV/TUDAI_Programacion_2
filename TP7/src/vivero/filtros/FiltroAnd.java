package vivero.filtros;

import vivero.Planta;

public class FiltroAnd extends Filtro{
    //ATRIBUTOS
    private final Filtro f1;
    private final Filtro f2;

    //CONSTRUCTOR
    public FiltroAnd(Filtro f1, Filtro f2){
        this.f1 = f1;
        this.f2 = f2;
    }

    //OTHER METHODS
    @Override
    public boolean eval(Planta p){
        return f1.eval(p) && f2.eval(p);
    }
}
