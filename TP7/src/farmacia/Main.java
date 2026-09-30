package farmacia;

import farmacia.filtros.*;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Farmacia farmacia = new Farmacia();

        // 1. Crear Medicamentos
        Medicamento m1 = new Medicamento("Aspirina", "Bayer", 500.0);
        m1.agregarSintoma("Dolor de cabeza");
        m1.agregarSintoma("Fiebre");

        Medicamento m2 = new Medicamento("Actron", "Bayer", 1200.0);
        m2.agregarSintoma("Dolor muscular");
        m2.agregarSintoma("Fiebre");

        Medicamento m3 = new Medicamento("Apracur", "Raffo", 350.0);
        m3.agregarSintoma("Congestión Nasal");
        m3.agregarSintoma("Fiebre");

        Medicamento m4 = new Medicamento("Tafirol", "Genomma", 800.0);
        m4.agregarSintoma("Dolor de cabeza");

        farmacia.agregarMedicamento(m1);
        farmacia.agregarMedicamento(m2);
        farmacia.agregarMedicamento(m3);
        farmacia.agregarMedicamento(m4);

        // 2. Búsqueda simple: Laboratorio Bayer
        System.out.println("=== MEDICAMENTOS BAYER ===");
        Filtro fBayer = new FiltroLaboratorio("Bayer");
        imprimirResultados(farmacia.buscarMedicamentos(fBayer));

        // 3. Búsqueda simple: Nombre contiene "ina"
        System.out.println("\n=== NOMBRE CONTIENE 'ina' ===");
        Filtro fIna = new FiltroNombreContiene("ina");
        imprimirResultados(farmacia.buscarMedicamentos(fIna));

        // 4. Búsqueda combinada: Bayer Y que contenga "ina"
        System.out.println("\n=== BAYER Y NOMBRE CONTIENE 'ina' ===");
        Filtro fBayerYIna = new FiltroAND(fBayer, fIna);
        imprimirResultados(farmacia.buscarMedicamentos(fBayerYIna));

        // 5. Búsqueda combinada: Tratan "Congestión Nasal" O cuesten menos de 400
        System.out.println("\n=== CONGESTIÓN NASAL O PRECIO MENOR A 400 ===");
        Filtro fCongestion = new FiltroSintoma("Congestión Nasal");
        Filtro fBarato = new FiltroPrecioMenorA(400.0);
        Filtro fCombinado = new FiltroOR(fCongestion, fBarato);
        imprimirResultados(farmacia.buscarMedicamentos(fCombinado));
    }

    private static void imprimirResultados(Set<Medicamento> resultados) {
        for (Medicamento m : resultados) {
            System.out.println("- " + m);
        }
    }
}
