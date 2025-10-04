package vivero;

import java.util.ArrayList;
import java.util.Arrays;

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
        list.addAll(Arrays.asList(items));
        return list;
    }

    public static String imprimir(ArrayList<Planta> plantasFiltradas) {
        String info = "\n";
        for (Planta p : plantasFiltradas) {
            info += " - " + p.getNombreCientifico();
        }
        return info;
    }

    public static void main(String[] args) {
        //ITERACIONES
        Vivero v = new Vivero();

        Planta p1 = new Planta("Rosa rubiginosa", "Magnoliophyta", "Rosaceae", "Magnoliopsida", new ArrayList<>(ArraysList("Escaramujo", "Rosa mosqueta")), 8, 6, false);
        Planta p2 = new Planta("Lavandula angustifolia", "Magnoliophyta", "Lamiaceae", "Magnoliopsida", new ArrayList<>(ArraysList("Lavanda")), 7, 4, true);
        Planta p3 = new Planta("Ficus elastica", "Magnoliophyta", "Moraceae", "Magnoliopsida", new ArrayList<>(ArraysList("Ficus de caucho", "Higuera de caucho")), 5, 5, true);
        Planta p4 = new Planta("Aloe vera", "Magnoliophyta", "Asphodelaceae", "Liliopsida", new ArrayList<>(ArraysList("Sábila")), 9, 2, true);
        Planta p5 = new Planta("Cactus", "Magnoliophyta", "Cactaceae", "Magnoliopsida", new ArrayList<>(ArraysList("Cactus")), 10, 1, false);
        
        //Incluye palabra
            Filtro f1 = new FiltroNombreCientificoIncluye("Ficus");
        //palabra igual
            Filtro f2 = new FiltroNombreVulgarIgual("Lavanda");
            Filtro f3 = new FiltroClasificacionIgual("Magnoliophyta");
        //niveles de sol superior y riego inferior
            Filtro f4 = new FiltroSolSuperior(5);
            Filtro f5 = new FiltroRiegoInferior(3);
                //combinacion logica
                Filtro f45 = new FiltroAnd(f4, f5);
        //niveles de sol inferior y riego superior
            Filtro f6 = new FiltroSolInferior(4);
            Filtro f7 = new FiltroRiegoSuperior(4);
                //combinacion logica    
                Filtro f67 = new FiltroAnd(f6, f7);
        //planta de interior
            Filtro f8 = new FiltroEsInterior();
        //combinacion logica
            Filtro f85 = new FiltroAnd(f8, f5);

        //AGREGO PLANTAS AL VIVERO
        v.agregarPlanta(p5);v.agregarPlanta(p4); v.agregarPlanta(p3); v.agregarPlanta(p2); v.agregarPlanta(p1);

        //PRUEBAS
        System.out.println("a) Plantas cuyo nombre científico incluya la palabra 'Ficus': " + imprimir(v.plantasCriterio(f1)));
        System.out.println("b) Plantas a las que se conozca vulgarmente como 'Lavanda': " + imprimir(v.plantasCriterio(f2)));
        System.out.println("c) Plantas cuya clasificación sea 'Crassula': " + imprimir(v.plantasCriterio(f3)));
        System.out.println("d) Plantas que requieran un nivel de sol superior a 5 y riego inferior a 3: " + imprimir(v.plantasCriterio(f45)));
        System.out.println("e) Plantas que requieran un nivel de sol inferior a 4 y riego superior a 4: " + imprimir(v.plantasCriterio(f67)));
        System.out.println("f) Plantas de interior que necesiten poco riego (inferior a 3): " + imprimir(v.plantasCriterio(f85)));
        System.out.println("g) Cualquier combinación lógica de las formas anteriores: ");

    }


}