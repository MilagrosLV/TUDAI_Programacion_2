package vivero.filtros;

import vivero.Planta;

public class FiltroNombreCientificoIncluye extends Filtro{
    //ATRIBUTES
    private String nombreConsulta;

    //CONTRUCTOR
    public FiltroNombreCientificoIncluye(String nombreConsulta) {
        this.nombreConsulta = nombreConsulta;
    }

    //OTHER METHODS
    public boolean eval(Planta p){
        return p.getNombreCientifico().contains(nombreConsulta);
    }
}
