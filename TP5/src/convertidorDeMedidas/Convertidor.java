package convertidorDeMedidas;

/* Para lograr que la clase no deba instanciarse, 
 * declararemos sus métodos como static y definiremos 
 * un constructor privado. Esto evita el uso de new Convertidor().
 */
public class Convertidor {
	private static final double CM_EN_PULGADA=2.54, 
								KG_EN_LIBRA=0.453592, 
								L_EN_GALON=3.78541;
	
	//Constructor privado --> evita que otras clases puedan crear instancias (objetos) de esa clase usando el operador new.
	private Convertidor() {
		//Tira error si se intenta instanciar
		throw new UnsupportedOperationException("Esta es una clase de utilidad y no puede ser instanciada.");
	}

	//métodos con regla de tres simples
	public static double cmAPulg(double cm) {
		return cm/CM_EN_PULGADA;
	}
	public static double pulgACm(double pulg) {
		return pulg*CM_EN_PULGADA;
	}
	public static double kgALb(double kg) {
		return kg/KG_EN_LIBRA;
	}
	public static double lbAKg(double lb) {
		return lb*KG_EN_LIBRA;
	}
	public static double lAGal(double l) {
		return l/L_EN_GALON;
	}
	public static double galAL(double gal) {
		return gal*L_EN_GALON;
	}
	
}