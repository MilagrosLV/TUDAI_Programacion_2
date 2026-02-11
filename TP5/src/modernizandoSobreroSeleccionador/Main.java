package modernizandoSobreroSeleccionador;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//CUAÑLIDADES
		Cualidad c1 = new Cualidad("Empatía");Cualidad c2 = new Cualidad("Honestidad");
		Cualidad c3 = new Cualidad("Responsabilidad");Cualidad c4 = new Cualidad("Liderazgo");
		Cualidad c5 = new Cualidad("Valentía");Cualidad c6 = new Cualidad("Astucia");
		Cualidad c7 = new Cualidad("Lealtad");Cualidad c8 = new Cualidad("Inteligencia");
		Cualidad c9 = new Cualidad("Creatividad");Cualidad c10 = new Cualidad("Determinación");
		Cualidad c11 = new Cualidad("Curiosidad");Cualidad c12 = new Cualidad("Amigable");
		Cualidad c13 = new Cualidad("Adaptabilidad"); Cualidad c14 = new Cualidad("Paciencia");		

		//ALUMNES sin familiares, ni casa
		Alumno a1 = new Alumno("Ana", new ArrayList<>(List.of(c1,c2,c3,c7,c10,c12)));
		Alumno a2 = new Alumno("Bruno", new ArrayList<>(List.of(c4,c5,c6,c8,c9,c11)));
		Alumno a3 = new Alumno("Carla", new ArrayList<>(List.of(c1,c4,c5,c7,c9,c13)));
		Alumno a4 = new Alumno("Diego", new ArrayList<>(List.of(c2,c3,c6,c8,c10,c14)));
		//ALUMNES con familiares, sin casa
		Alumno a5 = new Alumno("Elena", new ArrayList<>(List.of(c1,c3,c4,c6,c9,c12)), new ArrayList<>(List.of(a4)));
		Alumno a6 = new Alumno("Federico", new ArrayList<>(List.of(c2,c5,c7,c8,c11,c13)), new ArrayList<>(List.of(a4)));
		Alumno a7 = new Alumno("Gabriela", new ArrayList<>(List.of(c1,c2,c5,c7,c10,c14)), new ArrayList<>(List.of(a3)));
		Alumno a8 = new Alumno("Hugo", new ArrayList<>(List.of(c3,c4,c6,c8,c9,c12)), new ArrayList<>(List.of(a4, a5, a6)));
		//ALUMNES con casa, sin familiares
		

	}

}
