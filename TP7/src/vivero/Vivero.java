package vivero;

import java.util.ArrayList;

public class Vivero {
    //ATRIBUTOS
    private ArrayList<Planta> plantas;

    //CONSTRUCTOR
    public Vivero() {
        this.plantas = new ArrayList<Planta>();
    }

    //OTHER METHODS
    public ArrayList<Planta> plantasCriterio(Filtro f) {

        ArrayList<Planta> plantasFiltradas = new ArrayList<Planta>();

        for (Planta p : plantas) {
            if (f.eval(p)) {
                plantasFiltradas.add(p);
            }
        }
        return plantasFiltradas;
    }
}
