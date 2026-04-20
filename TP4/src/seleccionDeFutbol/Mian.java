package seleccionDeFutbol;

import java.time.LocalDate;

public class Mian {

	public static void main(String[] args) {
		//Iteraciones
		Contingente c = new Contingente();
		Integrante i1 = new Futbolista("Lionel", "Messi", "12345678", LocalDate.of(1987, 6, 24), Estado.VIAJANDO, "Delantero", true, 700);
		Integrante i2 = new Futbolista("Cristiano", "Ronaldo", "87654321", LocalDate.of(1985, 2, 5), Estado.CONCENTRANDO, "Delantero", false, 0);
		Integrante i3 = new Entrenador("Diego", "Maradona", "11223344", LocalDate.of(1960, 10, 30), Estado.ORIGEN, "ARG123");
		Integrante i4 = new Masajista("Valen", "Montiquin", "66666666", LocalDate.of(2003, 4, 2), Estado.ORIGEN, "Kinesiologa", LocalDate.of(2008, 8, 8));

		c.addIntegrante(i1);
		c.addIntegrante(i2);
		c.addIntegrante(i3);
		c.addIntegrante(i4);

		for(Integrante i : c.getIntegrantes()) {
			System.out.println(i);
			System.out.println("Estado: " + c.getEstadoPersona(i));
			System.out.println("Disponible: " + c.isDisponible(i));
			System.out.println();
		}

	}

}
