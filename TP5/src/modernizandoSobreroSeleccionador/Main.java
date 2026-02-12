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
		
		//CASAS
		Casa casa1 = new CasaSimple("Hufflepuff", 4, new ArrayList<>(List.of(c2,c3,c6,c8,c9,c11)));
		Casa casa2 = new CasaSimple("Ravenclaw", 5, new ArrayList<>(List.of(c4,c6,c8,c11)));
		Casa casa3 = new CasaPuraSangre("Slytherin", 6, new ArrayList<>(List.of(c6,c8,c13)));
		Casa casa4 = new CasaEnemistada("Gryffindor", 5,  new ArrayList<>(List.of(c5,c7,c10,c12)), casa3);
		
		//ALUMNES sin familiares, ni casa
		Alumno a1 = new Alumno("Ana", new ArrayList<>(List.of(c2,c3,c6,c8,c9,c11)));
		Alumno a2 = new Alumno("Bruno", new ArrayList<>(List.of(c4,c5,c6,c8,c9,c11,c14)));
		Alumno a3 = new Alumno("Carla", new ArrayList<>(List.of(c1,c4,c5,c6,c8,c13)));
		Alumno a4 = new Alumno("Diego", new ArrayList<>(List.of(c2,c3,c6,c8,c10,c13)));
		Alumno a5 = new Alumno("Elena", new ArrayList<>(List.of(c5,c6,c7,c8,c10,c12,c13)));
		Alumno a6 = new Alumno("Federico", new ArrayList<>(List.of(c2,c3,c6,c8,c9,c11)));
		Alumno a7 = new Alumno("Gabriela", new ArrayList<>(List.of(c4,c6,c8,c11)));
		Alumno a8 = new Alumno("Hugo", new ArrayList<>(List.of(c3,c4,c6,c8,c11,c12)));
		Alumno a9 = new Alumno("Isabel", new ArrayList<>(List.of(c2,c3,c6,c8,c9,c11)));
		Alumno a10 = new Alumno("Jorge", new ArrayList<>(List.of(c4,c6,c8,c11)));
		Alumno a11 = new Alumno("Karen", new ArrayList<>(List.of(c1,c6,c8,c13)));
		Alumno a12 = new Alumno("Luis", new ArrayList<>(List.of(c2,c3,c5,c7,c10,c12)));
		Alumno a13 = new Alumno("María", new ArrayList<>(List.of(c2,c3,c6,c8,c9,c11)));
		Alumno a14 = new Alumno("Nicolás", new ArrayList<>(List.of(c4,c6,c8,c11)));
		Alumno a15 = new Alumno("Olivia", new ArrayList<>(List.of(c1,c2,c5,c6,c8,c13)));
		Alumno a16 = new Alumno("Pablo", new ArrayList<>(List.of(c3,c4,c5,c7,c10,c12)));
		
		//AGREGAR ALUMNO A CASA para probar CasaPuraSangre
		casa3.agregarAlumno(a3);
		
		//AGREGAR FAMILIARES
		a3.agregarFamiliar(a4);a3.agregarFamiliar(a15);a4.agregarFamiliar(a15);a11.agregarFamiliar(a3);
		
		//SOMBRERO
		Sombrero sombrero = new Sombrero(new ArrayList<>(List.of(casa1, casa2, casa3, casa4)));	

		//PRUEBAS
		sombrero.sortear(a1);sombrero.sortear(a2);sombrero.sortear(a3);sombrero.sortear(a4);
		sombrero.sortear(a5);sombrero.sortear(a6);sombrero.sortear(a7);sombrero.sortear(a8);
		sombrero.sortear(a9);sombrero.sortear(a10);sombrero.sortear(a11);sombrero.sortear(a12);
		sombrero.sortear(a13);sombrero.sortear(a14);sombrero.sortear(a15);sombrero.sortear(a16);


		//System.out.println(a3);


	}

}
