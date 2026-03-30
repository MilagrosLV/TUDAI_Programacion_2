
package establecimientoDeportivo;

import java.util.ArrayList;

public class Establecimiento {
	//atributos
	private ArrayList<Usuario> usuarios;
	private ArrayList<Cancha> canchas;
	private ArrayList<Turno> turnos;
	
	//Constructor
	public Establecimiento() {
		this.usuarios = new ArrayList<Usuario>();
		this.canchas = new ArrayList<Cancha>();
		this.turnos = new ArrayList<Turno>();
	}

	
	//Getters
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	public ArrayList<Usuario> getSocios() {
		ArrayList<Usuario> socios = new ArrayList<Usuario>();
		for(Usuario u : usuarios) {
			if(u.isSocio()) {
				socios.add(u);
			}
		}
		return socios;
	}
	public ArrayList<Cancha> getCancha() {
		return canchas;
	}
	public ArrayList<Turno> getAgenda() {
		return turnos;
	}
	
	//OTROS MÉTODOS
	public void addUsuario(Usuario u) {
		if(!getUsuarios().contains(u)) {
			getUsuarios().add(u);
			//System.out.println("Usuarios:"+u.getNombre());
		} else {
			System.out.println(u.getNombre()+" ya existe en la lista");
		}
	}
	public void addCancha(Cancha u) {
		if(!getCancha().contains(u)) {
			getCancha().add(u);
			//System.out.println("Cancha:"+u.getTipo());

		} else {
			System.out.println(u.getTipo()+" ya existe en la lista");
		}
	}
	public void addTurno(Turno u) {
		if(!getAgenda().contains(u)) {
			if(!canchasOcupadas(u)) {
				getAgenda().add(u);
				u.getU().addTurno(u);
				System.out.println("Turno: "+u.getFechaHoraI()+", $"+u.getPrecio());
			}else {
	            System.out.println("No hay cancha de "+u.getC().getTipo()+" disponible para el "+u.getFechaHoraI()+" hs");
	        }
		} else {
			System.out.println("El turno ya existe en la lista");
		}
	}
	
	private boolean canchasOcupadas(Turno t) {//Chequeo la cantidad de canchas ocupasdas por su tipo
		int contador = 0;
		for(Turno tt : turnos) {
			if(t.getC().equals(tt.getC()) && overlap(t, tt)) {
				contador++;
			}
		}
		return contador >= t.getC().getCant();
	}

	private boolean overlap(Turno a, Turno b) {
		return a.getFechaHoraI().isBefore(b.getFechaHoraF()) && a.getFechaHoraF().isAfter(b.getFechaHoraI());
	}
	
	
}
