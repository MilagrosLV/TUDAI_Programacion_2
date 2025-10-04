package vivero.filtros;

import vivero.Planta;

public class FiltroEsInterior extends Filtro{
    //CONSTRUCTOR
    public FiltroEsInterior() {
    }
    
    //OTHER METHODS
    public boolean eval(Planta p){
        return p.isProsperaInterior();
    }
}
