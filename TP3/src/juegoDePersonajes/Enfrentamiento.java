package juegoDePersonajes;

public class Enfrentamiento {
	private Personaje p1, p2;
	private String caracteristica;
	
	public Enfrentamiento(Personaje p1, Personaje p2, String caracteristica) {
		this.p1 = p1;
		this.p2 = p2;
		this.caracteristica = caracteristica;
	}
	
	private void luchar(int c1, int c2) {
		if(c1 > c2) {
			System.out.println("Ganó " + p1.getNombrePersonaje());
		} else if (c1 < c2) {
			System.out.println("Ganó " + p2.getNombrePersonaje());

		} else {
			System.out.println("Empate. Compare otra caracteristica");

		}
	}
	
	public void luchar(String caracteristica) {
		int c1 = 0, c2 = 0;
		switch (caracteristica) {
			case "vision nocturna":
				c1 = p1.getVisionNocturna();
				c2 = p2.getVisionNocturna();
				break;
			case "velocidad":
				c1 = p1.getVelocidad();
				c2 = p2.getVelocidad();
				break;
			case "fuerza":
				c1 = p1.getFuerza();
				c2 = p2.getFuerza();
				break;
			case "edad":
				c1 = p1.getEdad();
				c2 = p2.getEdad();
				break;
			case "peso":
				c1 = p1.getPeso();
				c2 = p2.getPeso();
				break;
			default:
				System.out.println("No escribió una caracteristica existente");
				break;
		}
		luchar(c1, c2);
	}
	
	public void luchar() {
		luchar(caracteristica);
	}
	
	
	public String getCaracterisyica() {
		return caracteristica;
	}
	
	
	
}