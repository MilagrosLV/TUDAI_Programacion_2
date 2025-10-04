package vivero;

public class FiltroNombreCientificoIgual {
    //ATRIBUTES
    private String nombreConsulta;;

    //CONTRUCTOR
    public FiltroNombreCientificoIgual(String nombreConsulta){
        this.nombreConsulta = nombreConsulta;
    }

    //OTHER METHODS
    public boolean eval(Planta p){
        return p.getNombreCientifico().equals(nombreConsulta);
    }
}
