package streaming;

import java.util.List;

public class Principal {
    public static void main(String[] args) {

        // ==============================================================
        // 1. CREACIÓN Y CONFIGURACIÓN DEL CATÁLOGO DE PELÍCULAS
        // ==============================================================
        
        Pelicula p1 = new Pelicula("Viaje a la Luna", "Aventura espacial clásica", "Georges Méliès", 1902, 13, 0);
        p1.agregarGenero("Ciencia Ficción");
        p1.agregarGenero("Aventura");
        p1.agregarActor("Georges Méliès");

        Pelicula p2 = new Pelicula("Luna de Avellaneda", "Drama sobre un club de barrio", "Juan José Campanella", 2004, 142, 13);
        p2.agregarGenero("Drama");
        p2.agregarGenero("Comedia");
        p2.agregarActor("Ricardo Darín");
        p2.agregarActor("Mercedes Morán");

        Pelicula p3 = new Pelicula("En Busca de la Felicidad", "Drama biográfico", "Gabriele Muccino", 2006, 117, 0);
        p3.agregarGenero("Drama");
        p3.agregarActor("Will Smith");
        p3.agregarActor("Jaden Smith");

        Pelicula p4 = new Pelicula("Proyecto Géminis", "Acción y ciencia ficción", "Ang Lee", 2019, 117, 13);
        p4.agregarGenero("Acción");
        p4.agregarGenero("Ciencia Ficción");
        p4.agregarActor("Will Smith");
        p4.agregarActor("Clive Owen");

        Pelicula p5 = new Pelicula("Los Infiltrados", "Thriller policíaco", "Martin Scorsese", 2006, 151, 16);
        p5.agregarGenero("Crimen");
        p5.agregarGenero("Drama");
        p5.agregarActor("Leonardo DiCaprio");
        p5.agregarActor("Matt Damon");
        p5.agregarActor("Will Smith"); // Agregado hipotéticamente para probar el filtro de exclusión de Scorsese

        Pelicula p6 = new Pelicula("El Conjuro", "Terror paranormal", "James Wan", 2013, 112, 16);
        p6.agregarGenero("Terror");
        p6.agregarActor("Vera Farmiga");
        p6.agregarActor("Patrick Wilson");

        Pelicula p7 = new Pelicula("Toy Story", "Juguetes que cobran vida", "John Lasseter", 1995, 81, 0);
        p7.agregarGenero("Infantil");
        p7.agregarGenero("Animación");
        p7.agregarGenero("Comedia");
        p7.agregarActor("Tom Hanks");

        Pelicula p8 = new Pelicula("Mi Maestro el Pulpo", "Documental de naturaleza", "Pippa Ehrlich", 2020, 85, 0);
        p8.agregarGenero("Documental");
        p8.agregarActor("Craig Foster");


        // ==============================================================
        // 2. CONFIGURACIÓN DE LA PLATAFORMA
        // ==============================================================

        // Definimos una política de rentabilidad inicial (Ej: Duración < 120 min Y NO Comedia)
        Filtro politicaInicial = new FiltroAnd(
            new FiltroDuracionMenorA(120),
            new FiltroNot(new FiltroGenero("comedia"))
        );

        Plataforma plataforma = new Plataforma(politicaInicial);

        plataforma.agregarPelicula(p1);
        plataforma.agregarPelicula(p2);
        plataforma.agregarPelicula(p3);
        plataforma.agregarPelicula(p4);
        plataforma.agregarPelicula(p5);
        plataforma.agregarPelicula(p6);
        plataforma.agregarPelicula(p7);
        plataforma.agregarPelicula(p8);


        // ==============================================================
        // 3. PRUEBAS DE BÚSQUEDA DE PELÍCULAS (buscarPeliculas)
        // ==============================================================
        
        System.out.println("==================================================");
        System.out.println("             BÚSQUEDAS EN EL CATÁLOGO             ");
        System.out.println("==================================================\n");

        // Búsqueda 1: Título contiene "luna"
        System.out.println("1. Películas que contienen 'luna' en el título:");
        Filtro fLuna = new FiltroTituloContenido("luna");
        imprimirResultados(plataforma.buscarPeliculas(fLuna));

        // Búsqueda 2: Género "terror"
        System.out.println("\n2. Películas del género 'terror':");
        Filtro fTerror = new FiltroGenero("terror");
        imprimirResultados(plataforma.buscarPeliculas(fTerror));

        // Búsqueda 3: Actuó Will Smith Y NO dirigida por Martin Scorsese
        System.out.println("\n3. Películas con Will Smith Y NO dirigidas por Martin Scorsese:");
        Filtro fWillSinScorsese = new FiltroAnd(
            new FiltroActor("Will Smith"),
            new FiltroNot(new FiltroDirector("Martin Scorsese"))
        );
        imprimirResultados(plataforma.buscarPeliculas(fWillSinScorsese));

        // Búsqueda 4: Estrenadas antes de 2015 Y duración menor a 95 minutos
        System.out.println("\n4. Películas grabadas antes de 2015 Y con duración menor a 95 min:");
        Filtro fAntiguasCortas = new FiltroAnd(
            new FiltroEstrenoAnteriorA(2015),
            new FiltroDuracionMenorA(95)
        );
        imprimirResultados(plataforma.buscarPeliculas(fAntiguasCortas));


        // ==============================================================
        // 4. PRUEBAS DE RENTABILIDAD EN TIEMPO DE EJECUCIÓN
        // ==============================================================

        System.out.println("\n==================================================");
        System.out.println("             ANÁLISIS DE RENTABILIDAD             ");
        System.out.println("==================================================\n");

        // Evaluamos la película "Toy Story" (p7) y "Proyecto Géminis" (p4) con la Política 1:
        // (Duración < 120 min Y NO es Comedia)
        System.out.println("--- POLÍTICA 1: Duración < 120 min Y NO Comedia ---");
        System.out.println("¿Es rentable 'Toy Story'?: " + plataforma.esRentable(p7));       // false (es comedia)
        System.out.println("¿Es rentable 'Proyecto Géminis'?: " + plataforma.esRentable(p4)); // true

        // Cambiamos la política en tiempo de ejecución
        // Política 2: Posteriores a 2017 O género "infantil" O género "documental"
        Filtro politicaNuevasOInfantilODoc = new FiltroOr(
            new FiltroEstrenoPosteriorA(2017),
            new FiltroOr(
                new FiltroGenero("infantil"),
                new FiltroGenero("documental")
            )
        );

        plataforma.setPoliticaRentabilidad(politicaNuevasOInfantilODoc);

        System.out.println("\n--- POLÍTICA 2: Estreno > 2017 O Infantil O Documental ---");
        System.out.println("¿Es rentable 'Toy Story'?: " + plataforma.esRentable(p7));              // true (es infantil)
        System.out.println("¿Es rentable 'Proyecto Géminis'?: " + plataforma.esRentable(p4));        // true (estrenada en 2019)
        System.out.println("¿Es rentable 'En Busca de la Felicidad'?: " + plataforma.esRentable(p3)); // false (2006 y no es infantil/doc)
    }

    // Método aux para imprimir los resultados de las búsquedas
    private static void imprimirResultados(List<Pelicula> peliculas) {
        if (peliculas.isEmpty()) {
            System.out.println("  (No se encontraron resultados)");
        } else {
            for (Pelicula p : peliculas) {
                System.out.println("  - " + p.getTitulo() + " (" + p.getAnioEstreno() + ") | Dir: " 
                        + p.getDirector() + " | Duración: " + p.getDuracionMinuto() + " min");
            }
        }
    }
}
