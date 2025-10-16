package companiaDeEnvios;

import java.util.ArrayList;

public class EnvioCompuesto extends Envio {
	//Atributes
	private ArrayList<Envio> combo;
	
	//Constructor
	public EnvioCompuesto(String codigoDeSeguimiento) {
		super(codigoDeSeguimiento);
		this.combo = new ArrayList<>();
	}
	

	@Override
	public double getPeso() {
		
		return ;
	}

	@Override
	public String getCodigoDeSeguimiento() {
		return null;
	}
	
	public void agregarEnvio (Envio e) {
		
	}

}
