package persona;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Persona("42332033"); //Edad default 30 años
		Persona p2 = new Persona("Milagros", "Lopez Vilaclara", "43512956", 24, LocalDate.of(2001, 8, 8), 'F', 74, 1.61);
		Persona p3 = new Persona("Lara", "Lester", "43867593", 23, LocalDate.of(2002, 1, 22), 'F', 67, 1.67);
		
		
		System.out.println(p1.masaCorporal());
		System.out.println(p1.estaEnForma());
		System.out.println(p1.esSuCumpleanios());
		System.out.println(p1.esMayorEdad());
		System.out.println(p1.puedeVotar());
		System.out.println(p1.tieneEdadCoherente());
		System.out.println(p1.toString());
		
		
		System.out.println(p2.masaCorporal());
		System.out.println(p2.estaEnForma());
		System.out.println(p2.esSuCumpleanios());
		System.out.println(p2.esMayorEdad());
		System.out.println(p2.puedeVotar());
		System.out.println(p2.tieneEdadCoherente());
		System.out.println(p2.toString());
		
		
		System.out.println(p3.masaCorporal());
		System.out.println(p3.estaEnForma());
		System.out.println(p3.esSuCumpleanios());
		System.out.println(p3.esMayorEdad());
		System.out.println(p3.puedeVotar());
		System.out.println(p3.tieneEdadCoherente());
		System.out.println(p3.toString());
		
		

	}

}
