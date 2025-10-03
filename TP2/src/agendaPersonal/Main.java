package agendaPersonal;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {	
		//Crear Instancias de Objetos
		Persona p1 = new Persona("Mili", "Lopez", "mili@gmail.com", 249465568);
		Persona p2 = new Persona("Agus", "Lopez", "agus@gmail.com", 249431190);
		Persona p3 = new Persona("Rafa", "Lopez", "rafa@gmail.com", 249445645);
		Persona p4 = new Persona("Clara", "Franco", "clara@gmail.com", 2494456);
		Persona p5 = new Persona("Flo", "Ugarte", "flo@gmail.com", 249464568);
		Persona p6 = new Persona("Rochi", "Lopez", "rochi@gmail.com", 2494546);
		Persona p7 = new Persona("Vicky", "Franceschetti", "vicky@gmail.com", 249400000);
	
		AgendaPersonal ap = new AgendaPersonal(p1);
																				//(año, mes, día, hora, minuto)
		Reunion r1 = new Reunion("Aula 4", "Cambio Climatico", 2, LocalDateTime.of(2025, 5, 5, 11, 30));
		Reunion r2 = new Reunion("Aula 2", "Computacion", 1, LocalDateTime.of(2025, 7, 30, 14, 0));
		Reunion r3 = new Reunion("Aula 4", "Web", 1, LocalDateTime.of(2025, 5, 5, 11, 0));
		
		//Agregar reuniones
		ap.agregarReunion(r1); ap.agregarReunion(r2); ap.agregarReunion(r3);
		
		//Agregar participantes a reuniones correspondientes
		r1.agregarParticipante(p7);r1.agregarParticipante(p6);r1.agregarParticipante(p1);
		r2.agregarParticipante(p1);r2.agregarParticipante(p5);r2.agregarParticipante(p4);
		r3.agregarParticipante(p2);r3.agregarParticipante(p3);r3.agregarParticipante(p1);
		
		
		
		//Chequeo
		System.out.println(ap.toString());
		//System.out.println(r1.getParticipantes());


	}

}
