package jardinPrivado;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		//Testing Iteraciones
		Jardin j = new Jardin();

		Planta p1 = new Planta("Dianthus plumarius", "Clavel", "Austria", LocalDate.of(2020, 5, 20));
		Planta p2 = new Planta("Rosa chinensis", "Rosa china", "China", LocalDate.of(2019, 3, 15));
		Planta p3 = new Planta("Lavandula angustifolia", "Lavanda", "Mediterráneo", LocalDate.of(2021, 7, 10));
		Planta p4 = new Planta("Helianthus annuus", "Girasol", "América del Norte", LocalDate.of(2020, 6, 5));
		Planta p5 = new Planta("Tulipa gesneriana", "Tulipán", "Turquía", LocalDate.of(2019, 4, 25));

		j.addPlanta(p1);j.addPlanta(p2);j.addPlanta(p3);j.addPlanta(p4);j.addPlanta(p5);
		
		System.out.println(j);	
		
	}

}
