package juegoDePersonajes3;

import java.util.List;

public class Ring {

	//aislo el comportamiento del enfrentamiento acá
	public Jugador enfrentar(Jugador j1, Jugador j2, List<Cualidad> criterios) {
		Personaje p1 = j1.getPersonaje();
		Personaje p2 = j2.getPersonaje();
		
;		for(Cualidad cc : criterios) {
			if(p1.getValorCualidad(cc)>p2.getValorCualidad(cc))return j1;
			if(p1.getValorCualidad(cc)<p2.getValorCualidad(cc))return j2;
		}
	
		return null;
	}
}
