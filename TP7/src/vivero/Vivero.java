package vivero;

import java.util.ArrayList;

import vivero.filtros.Filtro;

public class Vivero {
    //ATRIBUTOS
    private final ArrayList<Planta> plantas;

    //CONSTRUCTOR
    public Vivero() {
        this.plantas = new ArrayList<>();
    }

    //OTHER METHODS
    public void agregarPlanta(Planta p) {
        this.plantas.add(p);
    }
    
    public ArrayList<Planta> plantasCriterio(Filtro f) {

        ArrayList<Planta> plantasFiltradas = new ArrayList<>();

        if(!plantas.isEmpty()){
            for (Planta p : plantas) {
                if (f.eval(p)) {
                    plantasFiltradas.add(p);
                }
            }
        }
        return plantasFiltradas;
    }
    
    @Override
    public String toString() {
        String info = "Plantas en el vivero:\n";
        for (Planta p : plantas) {
            info += "- " + p.getNombreCientifico() + "\n";
        }
        return info;
    }
}
