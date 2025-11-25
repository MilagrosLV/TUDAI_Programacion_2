package companiaDeEnvios;

public class EnvioSimple extends Envio{
	private double peso; // in kg
    private boolean retiroDomicilio;
	
    //Constructor
    public EnvioSimple(Persona destinatario, Persona remitente, double peso, String codigoDeSeguimiento, boolean retiroDomicilio) {
        super(codigoDeSeguimiento, remitente, destinatario);
    	this.peso = peso;
        this.retiroDomicilio = retiroDomicilio; 
        
    }

    //Methods
    @Override
    public double getPeso() {
        return this.peso;
    }
    @Override
    public String getCodigoDeSeguimiento() {
    	return super.codigoDeSeguimiento;
    }
    
	public boolean isRetiroDomicilio() {
		return retiroDomicilio;
	}
	
	
    
}
