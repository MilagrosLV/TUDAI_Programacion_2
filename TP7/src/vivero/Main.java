package vivero;

import java.util.ArrayList;

import vivero.filtros.Filtro;
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
        
        Filtro f1 = new FiltroNombreCientificoIncluye("Rosa");
        Filtro f2 = new FiltroNombreVulgarIgual("Lavanda");
        Filtro f3 = new FiltroClasificacionIgual("Magnoliophyta");
        Filtro f4 = new FiltroSolSuperior(5);
        Filtro f5 = new FiltroRiegoInferior(3);
        Filtro f6 = new FiltroSolInferior(4);
        Filtro f7 = new FiltroRiegoSuperior(4);
        Filtro f8 = new FiltroEsInterior();
        Filtro f9 = new FiltroAnd(f8, f5);

        //AGREGO PLANTAS AL VIVERO
        v.agregarPlanta(p5);v.agregarPlanta(p4); v.agregarPlanta(p3); v.agregarPlanta(p2); v.agregarPlanta(p1);

        //PRUEBAS
        System.out.println("a) Plantas cuyo nombre científico incluya la palabra “Ficus”: ");
        System.out.println("b) Plantas a las que se conozca vulgarmente como “Lavanda”: ");
        System.out.println("c) Plantas cuya clasificación sea “Crassula”: ");
        System.out.println("d) Plantas que requieran un nivel de sol superior a 5 y riego inferior a 3: ");
        System.out.println("e) Plantas que requieran un nivel de sol inferior a 4 y riego superior a 4: ");
        System.out.println("f) Plantas de interior que necesiten poco riego (inferior a 3): ");
        System.out.println("g) Cualquier combinación lógica de las formas anteriores: ");

    }


}