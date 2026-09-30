package alarmaSensorial2;

import java.util.Objects;

public abstract class Sensor {
	private String zona;
	
	public Sensor(String zona) {
		this.zona=zona;
	}

	//getters
	public String getZona() {return zona;}
	public abstract boolean isActivado();
	public abstract void resetSensor(boolean b);
	
	@Override
	public boolean equals(Object o) {
		if(this==o)return true;
		if(o==null || getClass()!=o.getClass())return false;
		Sensor s = (Sensor)o;
		return Objects.equals(zona, s.zona);
	}
	
	@Override
	public int hashCode() { return Objects.hash(zona);}
	
	@Override
	public String toString() {
		return "Zona: "+getZona()+" | ";
	}

}
