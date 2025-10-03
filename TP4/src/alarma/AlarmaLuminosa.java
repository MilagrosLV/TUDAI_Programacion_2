package alarma;

public class AlarmaLuminosa extends Alarma {
	//ATRIBUTOS
	private Luz l;
	
	
	//CONSTRUCTOR --> los contructores no se heredan, hay que pasar todo.
	public AlarmaLuminosa() {
		super(); //Llamo al contructor del padre y tiene que ir al principio.
		this.l = new Luz();
	}
	
	public void activar() {
		//super.activar(); //Hago uso del super para llamer el método activar() del padre eliminando la ambiguedad.
		if(comprobar()) {
			t.hacerSonar();
			l.encender();
		}
	}
}
