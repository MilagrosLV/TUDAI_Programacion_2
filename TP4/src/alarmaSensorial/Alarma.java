package alarmaSensorial;

import java.util.ArrayList;

public abstract class Alarma {
	private ArrayList<Sensor> sensores;
	private Timbre t;
	
	public Alarma() {
		this.sensores = new ArrayList<Sensor>();
		this.t= new Timbre();
	}
	
	//getters, setters y adder
	public Timbre getT() {
		return t;
	}
	public ArrayList<Sensor> getSensores() {
		return sensores;
	}

	public void addSensor(Sensor s) {
		if(!(getSensores().contains(s))) {
			getSensores().add(s);
		}
	}

	
	//Otros métodos
	public void comprobar() {
		if(getSensores()==null || getSensores().isEmpty()) {
			System.out.println("No hay sensores instalados");
		}
		boolean activado=false;
		
		for(Sensor ss: sensores) {
			if(ss.isActivado()) {
				System.out.println("<-----"+ss.getZona()+" ACTIVIDAD----->");
				activado=true;
			}
		}
		if(activado) {
			System.out.println("Activar alarma");
			activar();
		}else {
            System.out.println("Sistema seguro: No se detectaron anomalías.");
        }
	}
	
	//Método abstracto
	public abstract void activar();
}
