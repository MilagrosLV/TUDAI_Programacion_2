package vivero;

public class FiltroSolSuperior {
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
