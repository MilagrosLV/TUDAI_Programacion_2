package alarmaSensorial2;

public class SensorTemperatura extends Sensor{
	private double tempAct, tempMax;
	
	public SensorTemperatura (String zona, double tempMax) {
		super(zona);
		this.tempMax=tempMax;
		tempAct=tempMax -1;
	}

	//getters
	public double getTempAct() {return tempAct;}
	public double getTempMax() {return tempMax;}
	
	//setter
	public void setTempAct(double tempAct) {this.tempAct = tempAct;}
	public void resetSensor(boolean b) {
		if(!b) this.tempAct = tempMax -1;
	}
	
	@Override
	public boolean isActivado() {
		return getTempAct()>getTempMax();
	}
	

}
