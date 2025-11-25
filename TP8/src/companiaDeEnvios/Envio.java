package companiaDeEnvios;

public abstract class Envio {
	//ATRIBUTES
    protected String codigoDeSeguimiento;
	protected Persona destinatario, remitente;
    
    //Constructor
    public Envio (String codigoDeSeguimiento, Persona remitente, Persona destinatario) {
    	this.codigoDeSeguimiento = codigoDeSeguimiento;
    	this.destinatario = destinatario;
        this.remitente = remitente;
    }
    
    //Abstract Methods
    public abstract double getPeso();
    public abstract String getCodigoDeSeguimiento();
    
    //Getters
	public Persona getDestinatario() {
		Persona d = this.destinatario;
		return d;
	}
	public Persona getRemitente() {
		Persona r = remitente;
		return r;
	}
}
