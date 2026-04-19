package alarmaSensorial;

public class Principal {

	public static void main(String[] args) {
		//Iteraciones
				Alarma a1 = new AlarmaSonora();
				Alarma a2 = new AlarmaLuminosa();
				
				Sensor s1 = new Sensor("Cocina");
				Sensor s2 = new Sensor("Jardin");
				Sensor s3 = new Sensor("Cuarto");
				Sensor s4 = new Sensor("Living");
				
				
				//agregar
				a1.addSensor(s1);a1.addSensor(s3);a1.addSensor(s4);
				a2.addSensor(s2);

				
				//Cambiar valores para que se activen
				s2.setActivado(true);
				
				//Chequear
				a1.comprobar();
				a2.comprobar();



	}

}
