package electrodomesticos;

public class Main {

	public static void main(String[] args) {
		Electrodomestico e1 = new Electrodomestico("Lavarropas");
		Electrodomestico e2 = new Electrodomestico("Heladera", "Plateado", 5000);
		Electrodomestico e3 = new Electrodomestico("Microondas", "Blanco", 200, 70, 5);
		
		//e1
		System.out.println(e1.getNombre() + ": " + e1.esBajoConsumo() + ", " + e1.balanceCostoPeso() + ", " + e1.esAltaGama());
		
		//e2
		System.out.println(e2.getNombre() + ": " + e2.esBajoConsumo() + ", " + e2.balanceCostoPeso() + ", " + e2.esAltaGama());
		
		//e3
		System.out.println(e3.getNombre() + ": " + e3.esBajoConsumo() + ", " + e3.balanceCostoPeso() + ", " + e3.esAltaGama());
		
		
	}

}
