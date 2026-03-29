package establecimientoDeportivo1;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		//Iteraciones
		Establecimiento ed = new Establecimiento();

		Cancha c1 = new Cancha("Futbol 5", 2, 400); ed.addCancha(c1);
		Cancha c2 = new Cancha("Paddle", 2, 100); ed.addCancha(c2);

		Usuario u1 = new Usuario("Juan"); ed.addUsuario(u1);
		Usuario u2 = new Usuario("Maria"); ed.addUsuario(u2);
		Usuario u3 = new Usuario("Pedro"); ed.addUsuario(u3);
		Usuario u4 = new Usuario("Ana"); ed.addUsuario(u4);

		Turno t1 = new Turno(u1, c1, LocalDateTime.of(2024, 6, 1, 11,0) ); ed.addTurno(t1);
		Turno t2 = new Turno(u2, c1, LocalDateTime.of(2024, 6, 1, 11,0)); ed.addTurno(t2);
		Turno t3 = new Turno(u3, c1, LocalDateTime.of(2024, 6, 1, 12,0)); ed.addTurno(t3);
		Turno t4 = new Turno(u4, c1, LocalDateTime.of(2024, 6, 1, 13,0)); ed.addTurno(t4);
		Turno t5 = new Turno(u1, c2, LocalDateTime.of(2024, 6, 1, 10,0)); ed.addTurno(t5);

	}

}