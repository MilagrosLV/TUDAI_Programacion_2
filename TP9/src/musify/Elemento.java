package musify;

import java.util.List;

public abstract class Elemento {
	public abstract int getDuracionSeg();
	public abstract List<Pista> buscar(Filtro f);
}
