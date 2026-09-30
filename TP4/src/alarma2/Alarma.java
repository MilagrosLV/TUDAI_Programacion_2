package alarma2;

public class Alarma {
	private boolean vidrioRoto, aperturaAbierta, movimientoDetectado;
	Timbre t;
	
	public Alarma() {
		vidrioRoto = false;
		aperturaAbierta = false;
		movimientoDetectado = false;
		t = new Timbre();
	}

	//getters y setters
	public boolean isVidrioRoto() {
		return vidrioRoto;
	}

	public void setVidrioRoto(boolean vidrioRoto) {
		this.vidrioRoto = vidrioRoto;
	}

	public boolean isAperturaAbierta() {
		return aperturaAbierta;
	}

	public void setAperturaAbierta(boolean aperturaAbierta) {
		this.aperturaAbierta = aperturaAbierta;
	}

	public boolean isMovimientoDetectado() {
		return movimientoDetectado;
	}

	public void setMovimientoDetectado(boolean movimientoDetectado) {
		this.movimientoDetectado = movimientoDetectado;
	}
	
	//otros métodos
	public boolean comprobar() {
		return isAperturaAbierta() || isVidrioRoto() || isMovimientoDetectado();
	}

	public void alarmar() {
		t.hacerSonar();
	}
	

	
	//monitoreo
	public void monitorear() {
		while(!comprobar()) {
			try {
				Thread.sleep(1000); // 1 segundo

			} catch (Exception e) {
				Thread.currentThread().interrupt();
				System.out.println("Hilo de monitoreo interrumpido");
			}
		}
		alarmar();
	}
	
	//resetear alarma
	public void resetearAlarma() {
		setVidrioRoto(false);
		this.setAperturaAbierta(false);
		this.setMovimientoDetectado(false);
		apagarAlarma();
	}
	public void apagarAlarma() {
		t.apagar();
	}
	
}
