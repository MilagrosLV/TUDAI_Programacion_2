package companiaDeEnvios;

public class EnvioSimple extends Envio{
	private double peso; // in kg
	private Persona destinatario;
	private Persona remitente;
    private boolean retiroDomicilio;
	
    //Constructor
    public EnvioSimple(Persona destinatario, Persona remitente, double peso, String codigoDeSeguimiento, boolean retiroDomicilio) {
        super(codigoDeSeguimiento);
    	this.peso = peso;
        this.destinatario = destinatario;
        this.remitente = remitente;
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
	public Persona getDestinatario() {
		return destinatario;
	}
	public Persona getRemitente() {
		return remitente;
	}
	public boolean isRetiroDomicilio() {
		return retiroDomicilio;
	}
	
	
    
}
