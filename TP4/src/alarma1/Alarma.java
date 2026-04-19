package alarma1;

public abstract class Alarma {
	private boolean vidrioRoto, aperturaAbierta, movimiento;
	private Timbre t;
	
	public Alarma() {
		this.vidrioRoto=false;
		this.aperturaAbierta=false;
		this.movimiento=false;
		this.t= new Timbre();
	}
	
	//getters y setters
	public boolean isVidrioRoto() {
		return vidrioRoto;
	}
	public boolean isAperturaAbierta() {
		return aperturaAbierta;
	}
	public boolean isMovimiento() {
		return movimiento;
	}
	public Timbre getT() {
		return t;
	}
	public void setSensores(boolean vidrio, boolean apertura, boolean movimiento) {
        this.vidrioRoto = vidrio;
        this.aperturaAbierta = apertura;
        this.movimiento = movimiento;
    }
	
	//Otros métodos
	public void comprobar() {
		if(isVidrioRoto()||isAperturaAbierta()||isMovimiento()) {
			System.out.println("Activar alarma");
			activar();
		}else {
            System.out.println("Sistema seguro: No se detectaron anomalías.");
        }
	}
	public abstract void activar();
}
