package alarma1;

public class AlarmaLuminosa extends Alarma{
	private Luz l;
	public AlarmaLuminosa () {
		super();
		this.l=new Luz();
	}
	
	//getter
	public Luz getL() {
		return this.l;
	}
	
	//Heredado
	public void activar() {
		getT().hacerSonar();
		getL().encender();
	}
}
