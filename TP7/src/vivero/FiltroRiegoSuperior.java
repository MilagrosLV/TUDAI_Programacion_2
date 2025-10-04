package vivero;

public class FiltroRiegoSuperior {
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
