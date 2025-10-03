package alarma;

public class Main {

	public static void main(String[] args) {
		
		Alarma a1 = new Alarma(true, false, false);
		
		System.out.println(a1.isVidrioRoto());
	}

}
