package fabricaDeMuebles;

public class Main {

	public static void main(String[] args) {
		Producto p1 = new Producto("silla", 50, 50000, "Roble", "Blanco");
		Producto p2 = new Producto("mesa", 40, 15000, "Cedro", "Blanco");
		Producto p3 = new Producto("banco", 30, 1000, "Acacio", "Blanco");

		Fabrica ff = new Fabrica();
		
		ff.agregarMueble(p1); ff.agregarMueble(p2); ff.agregarMueble(p3);
		
		System.out.println(ff.toString());
		

	}

}
