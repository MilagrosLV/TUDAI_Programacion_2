package sistemaDeControlGastosPublicos;

public class Main {

	public static void main(String[] args) {
		//Crear Instancias de objetos
		Ciudad c1 = new Ciudad("Tandil", 150000, 300, 444, 333, 222, 555, 1000);
		Ciudad c2 = new Ciudad("Rauch", 100000, 300, 444, 333, 222, 555, 100000);
		Ciudad c3 = new Ciudad("Bolivar", 1500, 300, 444, 333, 222, 555, 1000);
		Ciudad c4 = new Ciudad("San Miguel", 150000, 300, 444, 333, 222, 555, 100000);
		Ciudad c5 = new Ciudad("Raco", 150000, 300, 444, 333, 222, 555, 100000);
		Ciudad c6 = new Ciudad("San Pedro", 150000, 300, 444, 333, 222, 555, 1000);

		Provincia p1 = new Provincia("Buenos Aires");
		Provincia p2 = new Provincia("Tucuman");
		
		Pais pp =  new Pais("Argentina");
		
		//Agregar Instancias ewn Listas
		pp.agregarProvincia(p1); pp.agregarProvincia(p2);
		p2.agregarCiudad(c6);p2.agregarCiudad(c5);p2.agregarCiudad(c4);
		p1.agregarCiudad(c3);p1.agregarCiudad(c2);p1.agregarCiudad(c1);
		
		//Ciudades que gastan más de lo que recaudan
		pp.ciudadesDeficitPais();
		
		//Provincias con más de la mitad de sus ciudades en condición de déficit
		pp.provinciasMayoriaDeficit();

		
		

	}

}
