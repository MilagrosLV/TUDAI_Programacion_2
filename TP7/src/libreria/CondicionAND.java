package libreria;

public class CondicionAND extends Condicion{
	private Condicion c1, c2;
	public CondicionAND(Condicion c1, Condicion c2) {this.c1=c1; this.c2=c2;}
	public Condicion getCondicion1() {return c1;}
	public Condicion getCondicion2() {return c2;}
	


	@Override
	public boolean cumple(Cliente c, Producto p) {
		return c1.cumple(c, p) && c2.cumple(c, p);
	}
}
