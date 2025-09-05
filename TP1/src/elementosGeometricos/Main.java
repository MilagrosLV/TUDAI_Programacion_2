package elementosGeometricos;

public class Main {

	public static void main(String[] args) {
		PuntoGeometrico p1 = new PuntoGeometrico(2,10);
		PuntoGeometrico p2 = new PuntoGeometrico(5,5);
		PuntoGeometrico p3 = new PuntoGeometrico(1,1);
		PuntoGeometrico p4 = new PuntoGeometrico(2,3);
		
		Rectangulo r1 = new Rectangulo(p1, p2);
		Rectangulo r2 = new Rectangulo(p3, p4);
		
		
		//p1 testing
		p1.desplazarPunto(3, -4);
			System.out.println("("+p1.getX()+", "+p1.getY()+")");
			
		//p2 testing
		p2.desplazarPunto(2, -2);
			System.out.println("("+p2.getX()+", "+p2.getY()+")");
			
		//Distancia Euclidea entre p1 y p2		
		System.out.println("Distancia Euclidea: "+p1.calcularDistanciaEuclidea(p2));
			
		//r1 testing
		System.out.println("Area: "+r1.calcularArea()+", Comparar rectangulo: "+r1.compararRectangulos(r2)+
				", Es cuadrado: "+r1.esCuadrado()+", Está acostado: "+r1.estaAcostado());
	}
	
}
