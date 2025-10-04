package vivero.filtros;

import java.util.ArrayList;

import vivero.Planta;

public class FiltroNombreVulgarIgual extends Filtro{
    //ATRIBUTES
    private String nombreConsultado;
    private ArrayList<String> nombresVulgares;

    //CONSTRUCTOR
    public FiltroNombreVulgarIgual(String nombreConsultado){
        this.nombreConsultado = nombreConsultado;
        this.nombresVulgares = new ArrayList<>();
    }

    //OTHER METHODS
    public boolean eval(Planta p){
        nombresVulgares = p.getNombresVulgares();
        for(String nv : nombresVulgares){
            if(nv.equals(this.nombreConsultado)){
                return true;
            }
        }
        return false;
    }

}
