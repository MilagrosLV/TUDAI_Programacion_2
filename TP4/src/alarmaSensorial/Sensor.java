package alarmaSensorial;

public class Sensor {
	private String zona;
	private boolean activado;
	
	public Sensor(String zona) {
		this.zona=zona;
		this.activado=false;
	}

	public boolean isActivado() {
		return activado;
	}

	public void setActivado(boolean activado) {
		this.activado = activado;
	}

	public String getZona() {
		return zona;
	}
	
}
