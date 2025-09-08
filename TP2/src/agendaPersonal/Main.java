package agendaPersonal;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		//Instanciar Objetos
		Persona p1 = new Persona("Mili", "lopez@gmail", "2494655689");
		Persona p2 = new Persona("Lara", "lester@gmail", "2494123456");
		Persona p3 = new Persona("Vicky", "franceschetti@gmail", "249478912");
		Persona p4 = new Persona("Agus", "diaz@gmail", "2494345678");
				
		AgendaPersonal aa = new AgendaPersonal(p1);
		
		Reunion r1 = new Reunion("Aula 1", "Web", LocalTime.of(1, 0), LocalDateTime.of(2025, 9, 8, 15, 0));
		Reunion r2 = new Reunion("Aula 2", "Clima", LocalTime.of(3, 0), LocalDateTime.of(2025, 9, 8, 18, 0));
		Reunion r3 = new Reunion("Aula 3", "Interfaces", LocalTime.of(1, 30), LocalDateTime.of(2025, 9, 8, 15, 0));
		
		//Agregar Participantes a las Reuniones
		r1.agregarPersona(p1);r1.agregarPersona(p2);r1.agregarPersona(p3);
		r2.agregarPersona(p4);r2.agregarPersona(p2);r2.agregarPersona(p3);
		r3.agregarPersona(p1);r3.agregarPersona(p2);r3.agregarPersona(p3);
		
		//Agregar Reuniones a la AgendaPersonal
		aa.agregarReunion(r1);aa.agregarReunion(r2);aa.agregarReunion(r3);
		
		/*DEBUG
		System.out.println(r1.getFechaHoraInicio());
		System.out.println(r1.getFechaHoraFin());
		System.out.println(r1.getDuracion());

		System.out.println(r2.getFechaHoraInicio());
		System.out.println(r2.getFechaHoraFin());
		System.out.println(r2.getDuracion());
		
		System.out.println(r3.getFechaHoraInicio());
		System.out.println(r3.getFechaHoraFin());
		System.out.println(r3.getDuracion());*/
		
	}

}
