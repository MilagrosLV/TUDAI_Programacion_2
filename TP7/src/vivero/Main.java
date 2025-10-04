package vivero;

import java.util.ArrayList;

import vivero.filtros.FiltroClasificacionIgual;
import vivero.filtros.FiltroEsInterior;
import vivero.filtros.FiltroNombreCientificoIncluye;
import vivero.filtros.FiltroNombreVulgarIgual;
import vivero.filtros.FiltroRiegoInferior;
import vivero.filtros.FiltroRiegoSuperior;
import vivero.filtros.FiltroSolInferior;
import vivero.filtros.FiltroSolSuperior;
import vivero.filtros.FiltroAnd;

public class Main {
    private static ArrayList<String> ArraysList(String... items) {
        ArrayList<String> list = new ArrayList<>();
        for (String item : items) {
            list.add(item);
        }
        return list;
    }

    public static void main(String[] args) {
        //ITERACIONES
        Vivero v = new Vivero();

        Planta p1 = new Planta("Rosa rubiginosa", "Magnoliophyta", "Rosaceae", "Magnoliopsida", new ArrayList<String>(ArraysList("Escaramujo", "Rosa mosqueta")), 8, 6, false);
        Planta p2 = new Planta("Lavandula angustifolia", "Magnoliophyta", "Lamiaceae", "Magnoliopsida", new ArrayList<String>(ArraysList("Lavanda")), 7, 4, true);
        Planta p3 = new Planta("Ficus elastica", "Magnoliophyta", "Moraceae", "Magnoliopsida", new ArrayList<String>(ArraysList("Ficus de caucho", "Higuera de caucho")), 5, 5, true);
        Planta p4 = new Planta("Aloe vera", "Magnoliophyta", "Asphodelaceae", "Liliopsida", new ArrayList<String>(ArraysList("Sábila")), 9, 2, true);
        Planta p5 = new Planta("Cactus", "Magnoliophyta", "Cactaceae", "Magnoliopsida", new ArrayList<String>(ArraysList("Cactus")), 10, 1, false);
        
        FiltroNombreCientificoIncluye f1 = new FiltroNombreCientificoIncluye("Rosa");
        FiltroNombreVulgarIgual f2 = new FiltroNombreVulgarIgual("Lavanda");
        FiltroClasificacionIgual f3 = new FiltroClasificacionIgual("Magnoliophyta");
        FiltroSolSuperior f4 = new FiltroSolSuperior(5);
        FiltroRiegoInferior f5 = new FiltroRiegoInferior(3);
        FiltroSolInferior f6 = new FiltroSolInferior(4);
        FiltroRiegoSuperior f7 = new FiltroRiegoSuperior(4);
        FiltroEsInterior f8 = new FiltroEsInterior();
        FiltroAnd f9 = new FiltroAnd(f8, f5);

        v.agregarPlanta(p5);v.agregarPlanta(p4); v.agregarPlanta(p3); v.agregarPlanta(p2); v.agregarPlanta(p1);

        //PRUEBAS
        System.out.println();
    }


}