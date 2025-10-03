package series;

/*
1 Series
Una Serie está formada por un conjunto de temporadas, cada una de las cuales tiene una cantidad de episodios. 
Cada episodio posee un título, una descripción, un flag indicando si ya se vio el episodio y una calificación dada (con valores de 1 a 5). 
Si no se vio un episodio particular, la calificación dada será un valor negativo.
Las series poseen como atributos (además de los episodios correspondientes) un título, una descripción, un creador y un género.
Implementar en Java las clases involucradas, determinar qué clase es responsable de responder los siguientes servicios e implementar en Java.
	● Ingresar la calificación de un episodio. Si el valor ingresado como calificación no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior.
	● Obtener el total episodios vistos de una temporada particular.
	● Obtener el total de episodios vistos de una serie.
	● Obtener el promedio de las calificaciones dadas para una temporada particular.
	● Obtener el promedio de las calificaciones dadas para una serie.
	● Determinar si se vio todos los episodios de la serie.
		Nota. Para calcular los promedios, tener sólo en cuenta los episodios vistos
	 */

public class Main {

	public static void main(String[] args) {
		//Crear Instancias de objetos
		Serie ss = new Serie ("Casa", "Familia que vivía en paz, ya no tanto.", "Mili", "Horror");
		Temporada t1 = new Temporada("Temp 1");
		Temporada t2 = new Temporada("Temp 2");
		Episodio e1 = new Episodio("Ep 1", "1er ep", true, 2);
		Episodio e2 = new Episodio("Ep 2", "2do ep", false);
		Episodio e11 = new Episodio("Ep 1", "1er ep", false, 4);
		Episodio e12 = new Episodio("Ep 2", "2do ep", true, 33);
		Episodio e13 = new Episodio("Ep 3", "3er ep", true, 5);

		//Posicionar objetos
		ss.agregarTemporada(t1);
		ss.agregarTemporada(t2);
		t1.agregarEpisodio(e1);
		t1.agregarEpisodio(e2);
		t2.agregarEpisodio(e11);
		t2.agregarEpisodio(e12);
		t2.agregarEpisodio(e13);
		
		//● Ingresar la calificación de un episodio.
		e1.setCalificacion(5);
		
		//● Obtener el total episodios vistos de una temporada particular.
		System.out.println(t1.cantEpisodiosVistos());
		
		//● Obtener el total de episodios vistos de una serie.
		System.out.println(ss.cantVistos());
		
		//● Obtener el promedio de las calificaciones dadas para una temporada particular.
		System.out.println(t1.promedioCalificacionesEpisodiosVistos());
		
		//● Obtener el promedio de las calificaciones dadas para una serie.
		System.out.println(ss.promedioCalifSerie());
		
		//● Determinar si se vio todos los episodios de la serie.
		System.out.println(ss.seVioTodaLaSerie());


		
		System.out.println(ss.toString());
		

		 

	}

}
