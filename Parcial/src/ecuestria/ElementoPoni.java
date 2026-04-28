package ecuestria;

import java.util.ArrayList;

public abstract class ElementoPoni {
	public abstract double getVelocidad();
	public abstract int getPoderMagico();
	public abstract ArrayList<String> getHabilidades();
	public abstract int contarPonis(Condicion c);
}
