package alarmaSensorial2;

public class SensorDisturbio extends Sensor {
	private boolean hayDisturbio;
	
 	public SensorDisturbio(String zona) {
		super(zona);
		hayDisturbio = false;
	}
	
 	
 	//getter
	@Override
	public boolean isActivado() {
		return hayDisturbio;
	}
	
	
	//setter
	public void resetSensor(boolean b) {
		hayDisturbio=b;
	}
	public void dispararDisturbio() {
		hayDisturbio=true;
	}
}
