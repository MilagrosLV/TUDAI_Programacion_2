package alarma1;

public class Principal {

	public static void main(String[] args) {
		//Iteraciones
				Alarma a1 = new AlarmaSonora();
				Alarma a2 = new AlarmaLuminosa();

				//Chequear de que no se activen
				/*a1.comprobar();
				a2.comprobar();*/

				//Cambiar valores para que se activen
				a1.setSensores(true, false, false);
				a2.setSensores(false, true, false);
				a1.comprobar();
				a2.comprobar();

	}

}
