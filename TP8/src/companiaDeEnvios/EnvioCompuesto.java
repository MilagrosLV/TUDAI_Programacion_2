package companiaDeEnvios;

import java.util.ArrayList;

public class EnvioCompuesto extends Envio {
	//Atributes
	private ArrayList<Envio> combo;
	
	//Constructor
	public EnvioCompuesto(String codigoDeSeguimiento, Persona remitente, Persona destinatario) {
		super(codigoDeSeguimiento, remitente, destinatario);
		this.combo = new ArrayList<>();
	}
	

	@Override
	public double getPeso() {
		double suma = 0;
		for(Envio ee : combo) {
			suma += ee.getPeso();
		}
		return suma;
	}

	@Override
	public String getCodigoDeSeguimiento() {
		return null;
	}
	
	public void agregarEnvio (Envio e) {
		if (e.getDestinatario().getCiudad().equals(this.getDestinatario().getCiudad())) {
			combo.add(e);
		}
	}

}
