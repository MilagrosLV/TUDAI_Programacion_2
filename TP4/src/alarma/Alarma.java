package alarma;

public class Alarma {
	private boolean vidrioRoto;
	private boolean abertura;
	private boolean movimientoDentro;
	
	protected Timbre t; //Protected me hacew púbhlicos los métodos y atributos a mi hijo

	//CONSTRUCTORES
	public Alarma() {
		this(false, false, false);
	}
	
	public Alarma(boolean vidrioRoto, boolean abertura, boolean movimientoDentro) {
		this.vidrioRoto = vidrioRoto;
		this.abertura = abertura;
		this.movimientoDentro = movimientoDentro;
		this.t = new Timbre();
	}
	
	//MÉTODOS
	public boolean comprobar() {	
		return (vidrioRoto || abertura || movimientoDentro);
	}
	
	public void activar() {
		if(comprobar()) {
			t.hacerSonar();
		}
	}
	
}
