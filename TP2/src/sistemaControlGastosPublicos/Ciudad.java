package sistemaControlGastosPublicos;

import java.util.ArrayList;

public class Ciudad {
	private String nombre;
	private int cantHabitantes;
	private ArrayList<Impuesto> impuestos;
	private ArrayList<Gasto> gastos;
	
	//Constructor
	public Ciudad(String nombre, int cantHabitantes) {
		setNombre(nombre);
		setCantHabitantes(cantHabitantes);
		this.impuestos = new ArrayList<>();
		this.gastos = new ArrayList<>();
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
	
	//Other methods
	public void agregarImpuesto(Impuesto i) {
		boolean impuestoRepetido = false;
		for(Impuesto ii : impuestos) {
			if(i.equals(ii)) {
				impuestoRepetido=true;
			}
		}
		if(!impuestoRepetido) {
			impuestos.add(i);
		}
	}
	
	public void agregarGasto(Gasto g) {
		boolean gastoRepetido = false;
		for(Gasto gg : gastos) {
			if(g.equals(gg)) {
				gastoRepetido = true;
			}
		}
		if(!gastoRepetido) {
			gastos.add(g);
		}
	}
	
	public double montoTotalRecaudado() {
		double suma = 0;
		for(Impuesto ii : impuestos) {
			suma += (ii.getMontoHabitante()*cantHabitantes);
		}
		return suma;
	}
	
	public double montoTotalGastos() {
		double suma = 0;
		for(Gasto gg : gastos) {
			suma += gg.getPrecioGasto();
		}
		return suma;
	}
	
	public boolean estaEnDeficit() {
		return (montoTotalGastos()>montoTotalRecaudado());
	}

	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + ", cantHabitantes=" + cantHabitantes + ", impuestos=" + impuestos
				+ ", gastos=" + gastos + "]";
	}
	
	
	
	
	
	
	
}
