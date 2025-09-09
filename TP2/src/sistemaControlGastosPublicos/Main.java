package sistemaControlGastosPublicos;

public class Main {

	public static void main(String[] args) {
		//Iterations
		Pais pp = new Pais("Argentina");
		
		Impuesto imp1 = new Impuesto("Imp1", 60);
		Impuesto imp2 = new Impuesto("Imp2", 20);
		Impuesto imp3 = new Impuesto("Imp3", 35);
		Impuesto imp4 = new Impuesto("Imp4", 65);
		Impuesto imp5 = new Impuesto("Imp5", 12);
		
		Gasto g1 = new Gasto("Carreteras", 70000000);
		Gasto g2 = new Gasto("Educacion Publica", 200000);
		Gasto g3 = new Gasto("Fontanería", 11000000);

		Provincia p1 = new Provincia("Buenos Aires"); 
		Provincia p2 = new Provincia("La Pampa");
		
		Ciudad c1 = new Ciudad("Tandil", 150000);
		Ciudad c2 = new Ciudad("La Plata", 768000);
		Ciudad c3 = new Ciudad("Mar Del Plata", 682000);
		Ciudad c4 = new Ciudad("Santa Rosa", 116000);
		Ciudad c5 = new Ciudad("Macachín", 5686 );
		Ciudad c6 = new Ciudad("Bernasconi", 1780);
		
		SistemaDeControlDeGastosPublicos ss = new SistemaDeControlDeGastosPublicos(pp);


	}

}
