package sistemaControlGastosPublicos;

import java.util.ArrayList;

public class Ciudad {
	private String nombre;
	private int cantHabitantes;
	private ArrayList<Double>impuestos;
	private ArrayList<Double>gastos;
	
	//Constructor
	public Ciudad(String nombre, int cantHabitantes, ArrayList<Double> impuestos, ArrayList<Double> gastos) {
		setNombre(nombre);
		setCantHabitantes(cantHabitantes);
		this.impuestos = impuestos;
		this.gastos = gastos;
	}


	//Getters and Setters methods
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantHabitantes() {
		return cantHabitantes;
	}
	public void setCantHabitantes(int cantHabitantes) {
		this.cantHabitantes = cantHabitantes;
	}
	public ArrayList<Double> getImpuestos() {
		ArrayList<Double> copiaImpuestos = new ArrayList<>();
		copiaImpuestos = this.impuestos;		
		return copiaImpuestos;
	}
	public ArrayList<Double> getGastos() {
		ArrayList<Double> copiaGastos = new ArrayList<>();
		copiaGastos = this.impuestos;		
		return copiaGastos;
	}
	
	//Other methods
	public double montoTotalRecaudado() {
		double suma = 0;
		for(Double ii : impuestos) {
			suma += ii;
		}
		return suma;
	}
	
	public double montoTotalGastos() {
		double suma = 0;
		for(Double gg : gastos) {
			suma += gg;
		}
		return suma;
	}
	
	public boolean estaEnDeficit() {
		return (montoTotalGastos()>montoTotalRecaudado());
	}


	@Override
	public String toString() {
		return "Ciudad [getNombre()=" + getNombre() + ", getCantHabitantes()=" + getCantHabitantes()
				+ ", montoTotalRecaudado()=" + montoTotalRecaudado() + ", montoTotalGastos()=" + montoTotalGastos()
				+ ", estaEnDeficit()=" + estaEnDeficit() + "]";
	}

	
	
	
	
	
	
	
}
