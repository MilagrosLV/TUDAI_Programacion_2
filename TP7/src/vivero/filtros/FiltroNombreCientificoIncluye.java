package vivero.filtros;

import vivero.Planta;

public class FiltroNombreCientificoIncluye extends Filtro{
    //ATRIBUTES
    private final String nombreConsulta;

    //CONTRUCTOR
    public FiltroNombreCientificoIncluye(String nombreConsulta) {
        this.nombreConsulta = nombreConsulta.toLowerCase();
    }

    //OTHER METHODS
    @Override
    public boolean eval(Planta p){
        return p.getNombreCientifico().toLowerCase().contains(nombreConsulta);
    }
}
