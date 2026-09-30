package alarma2;

public class AlarmaLuminosa extends Alarma {
	Luz l;
	
	public AlarmaLuminosa() {
		super();
		l = new Luz();
	}


	@Override
	public void alarmar() {
		// TODO Auto-generated method stub
		super.alarmar();
		l.encender();
	}

	@Override
	public void apagarAlarma() {
		// TODO Auto-generated method stub
		super.apagarAlarma();
		l.apagar();
	}
	
	
}
