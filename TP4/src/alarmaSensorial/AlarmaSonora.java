package alarmaSensorial;

public class AlarmaSonora extends Alarma{
	public AlarmaSonora() {
		super();
	}
	
	public void activar() {
		getT().hacerSonar();
	}
}
