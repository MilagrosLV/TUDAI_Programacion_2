package alarmaSensorial2;

import java.util.List;

public class AlarmaLuminosa extends Alarma {
	Luz l;
	
	public AlarmaLuminosa() {
		super();
		l = new Luz();
	}


	@Override
	public void alarmar(List<Sensor> alertados) {
		// TODO Auto-generated method stub
		super.alarmar(alertados);
		l.encender();
	}

	@Override
	public void apagarAlarma() {
		// TODO Auto-generated method stub
		super.apagarAlarma();
		l.apagar();
	}
	
	
}
