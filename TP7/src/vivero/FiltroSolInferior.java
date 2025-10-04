package vivero;

public class FiltroSolInferior {
    //ATRIBUTES
    private int nroConsultado;

    //CONSTRUCTOR
    public FiltroSolInferior (int nroConsultado){
        this.nroConsultado = nroConsultado;
    }

    //OTHER METHODS
    public boolean eval(Planta p){
        return p.getSol() < this.nroConsultado;
    }
}
