package juegoDeDados;

public class Dado {
	//ATRIBUTOS
	private int cantCaras;
	
	//CONSTRUCTOR 
	public Dado () {
		this.cantCaras = 6;
	}

	//GETTERS
	public int getCantCaras() {
		return cantCaras;
	}
	
	//Otros Métodos
	public int tirar() {
		return (int) (Math.random()*this.getCantCaras())+1;
	}
	
	
}
