package streaming;

public class Principal {
    public static void main(String[] args) {

        // 1. Películas que en el título contengan "luna"
        Filtro f1 = new FiltroTituloContenido("luna");

        // 2. Películas de género "terror"
        Filtro f2 = new FiltroGenero("terror");

        // 3. Actuó Will Smith Y NO dirigida por Martin Scorsese
        Filtro f3 = new FiltroAnd(
            new FiltroActor("Will Smith"),
            new FiltroNot(new FiltroDirector("Martin Scorsese"))
        );

        // 4. Grabadas antes de 2015 Y duración menor a 95 minutos
        Filtro f4 = new FiltroAnd(
            new FiltroEstrenoAnteriorA(2015),
            new FiltroDuracionMenorA(95)
        );

        // ==============================================================
        // POLÍTICAS DE RENTABILIDAD DEL CEO
        // ==============================================================

        // Política A: Duración menor a 120 min Y NO sea comedia
        Filtro politicaA = new FiltroAnd(
            new FiltroDuracionMenorA(120),
            new FiltroNot(new FiltroGenero("comedia"))
        );

        // Política B: Posteriores al 2017 O género "infantil" O género "documental"
        Filtro politicaB = new FiltroOr(
            new FiltroEstrenoPosteriorA(2017),
            new FiltroOr(
                new FiltroGenero("infantil"),
                new FiltroGenero("documental")
            )
        );

        // Instanciar Plataforma con Política A
        Plataforma Netflix = new Plataforma(politicaA);

        Pelicula p1 = new Pelicula("Proyecto Géminis", "Sinopsis", "Ang Lee", 2019, 117, 13);
        p1.agregarActor("Will Smith");
        p1.agregarGenero("Acción");

        System.out.println("¿Es rentable con Política A?: " + Netflix.esRentable(p1));

        // Cambiar política en tiempo de ejecución
        Netflix.setPoliticaRentabilidad(politicaB);
        System.out.println("¿Es rentable con Política B?: " + Netflix.esRentable(p1));
    }
}
