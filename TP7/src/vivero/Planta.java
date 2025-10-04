package vivero;

import java.util.ArrayList;

public class Planta {

    //ATRIBUTOS
    private final String nombreCientifico, clasificacionSuperior, familia, clase;
    private final ArrayList<String> nombresVulgares;
    private final int sol, agua;
    private final boolean prosperaInterior;

    //CONSTRUCTOR
    public Planta(String nombreCientifico, String clasificacionSuperior, String familia, String clase, ArrayList<String> nombresVulgares, int sol, int agua, boolean prosperaInterior) {
        this.nombreCientifico = nombreCientifico;
        this.clasificacionSuperior = clasificacionSuperior;
        this.familia = familia;
        this.clase = clase;
        this.nombresVulgares = new ArrayList<>(nombresVulgares);
        this.sol = controlEscala(sol);
        this.agua = controlEscala(agua);
        this.prosperaInterior = prosperaInterior;
    }

    //GETTERS
    public String getNombreCientifico() {
        return nombreCientifico;
    }
    public String getClasificacionSuperior() {
        return clasificacionSuperior;
    }
    public String getFamilia() {
        return familia;
    }
    public String getClase() {
        return clase;
    }
    public ArrayList<String> getNombresVulgares() {
        ArrayList<String> copiaNombresVulgares = new ArrayList<>(this.nombresVulgares);
        return copiaNombresVulgares;
    }
    public int getSol() {
        return sol;
    }
    public int getAgua() {
        return agua;
    }
    public boolean isProsperaInterior() {
        return prosperaInterior;
    }

    //OTHER METHODS
    private int controlEscala(int nro) {
        if (nro < 1) {
            nro = 1;
        } else if (nro > 10) {
            nro = 10;
        }
        return nro;
    }


}
