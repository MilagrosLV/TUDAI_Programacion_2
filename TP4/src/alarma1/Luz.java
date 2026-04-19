package alarma1;

public class Luz {
	boolean activa;
	
	public Luz() {
		this.activa=false;
	}
	
	public void encender() {
		System.out.println(">>> Luz de emergencia encendida. <<<");
		this.activa=true;
	}
	public void apagar() {
		this.activa=false;
	}
}
