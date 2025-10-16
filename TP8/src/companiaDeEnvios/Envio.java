package companiaDeEnvios;

public abstract class Envio {
	//ATRIBUTES
    protected String codigoDeSeguimiento;
    
    //Constructor
    public Envio (String codigoDeSeguimiento) {
    	this.codigoDeSeguimiento = codigoDeSeguimiento;
    }
    
    public abstract double getPeso();
    public abstract String getCodigoDeSeguimiento();
}
