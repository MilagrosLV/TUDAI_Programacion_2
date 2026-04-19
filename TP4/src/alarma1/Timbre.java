package alarma1;

public class Timbre {
	boolean activa;
	
	public Timbre() {
		this.activa=false;
	}
	
	public void hacerSonar() {
		System.out.println("!!! ¡ALARMA SONANDO! PI-PI-PI-PI !!!");
		this.activa=true;
	}
	public void apagar() {
		this.activa=false;
	}
}
