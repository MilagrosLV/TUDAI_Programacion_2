package convertidorDeMedidas;

public class Main {

	public static void main(String[] args) {
		//iteraciones de prueba
		double valorCm = 10.0;
        double valorPulgadas = Convertidor.cmAPulg(valorCm);
        String corto = String.format("%.2f", valorPulgadas); 
        System.out.printf(valorCm+" cm equivalen a " + corto + " pulgadas.%n");

        double valorKg = 5.0;
		double valorLibras = Convertidor.kgALb(valorKg);
        String corto1 = String.format("%.2f", valorLibras); 
        System.out.printf(valorKg+" kg equivalen a " + corto1 + " libras.%n");

		double valorL = 5.0;
		double valorGalones = Convertidor.lAGal(valorL);
        String corto2 = String.format("%.2f", valorGalones); 
        System.out.printf(valorL+" L equivalen a " + corto2 + " galones.%n");
        
        // Intentar hacer esto daría error de compilación:
        // Convertidor c = new Convertidor();
		

	}

}
