package vivero.filtros;

import java.util.ArrayList;

import vivero.Planta;

public class FiltroNombreVulgarIgual extends Filtro{
    //ATRIBUTES
    private final String nombreConsultado;
    private ArrayList<String> nombresVulgares;

    //CONSTRUCTOR
    public FiltroNombreVulgarIgual(String nombreConsultado){
        this.nombreConsultado = nombreConsultado.toLowerCase();
        this.nombresVulgares = new ArrayList<>();
    }

    //OTHER METHODS
    @Override
    public boolean eval(Planta p){
        nombresVulgares = p.getNombresVulgares();
        for(String nv : nombresVulgares){
            if(nv.toLowerCase().equals(this.nombreConsultado)){
                return true;
            }
        }
        return false;
    }

}
