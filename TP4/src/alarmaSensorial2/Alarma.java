package alarmaSensorial2;

import java.util.ArrayList;
import java.util.List;

public class Alarma {
	private List<Sensor> sensores;
	private Timbre timbre;

	
	public Alarma() {
		sensores = new ArrayList<>();
		timbre = new Timbre();
	}

	//getters
	public List<Sensor> getSensores(){ return List.copyOf(sensores);}
	//adder
	public void agregarSensor(Sensor s) { if(s!=null && !sensores.contains(s)) sensores.add(s);}

	//otros métodos
	public void comprobar() {
		List<Sensor> alertados = new ArrayList<>();
		for(Sensor ss : sensores) {
			if(ss.isActivado()) alertados.add(ss);
		}
		
		if (!alertados.isEmpty())
			alarmar(alertados);
	}

	protected void alarmar(List<Sensor> alertados) {
		timbre.hacerSonar();
		this.mostrarZonasActivadas(alertados);
	}
	

	
	//resetear alarma
	public void resetearAlarma() {
		for (Sensor ss : sensores) {
			ss.resetSensor(false);
		}
		apagarAlarma();
	}
	public void apagarAlarma() {
		timbre.apagar();
	}
	
	//mostrar zonas activadas
	protected void mostrarZonasActivadas(List<Sensor> alertados) {
		System.out.println("ZONAS ACTIVADAS: ");
		for(Sensor ss: alertados) {
			System.out.print(ss);
		}
	}
	
}
