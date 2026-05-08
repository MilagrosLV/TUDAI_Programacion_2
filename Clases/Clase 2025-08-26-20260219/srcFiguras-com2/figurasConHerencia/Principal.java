package figurasConHerencia;

public class Principal {
    public static void main(String[] args) {
        ManejadorDeFiguras mf = new ManejadorDeFiguras();

        Rectangulo r1 = new Rectangulo("R1", 15, 1);

        mf.imprimir(r1);

        Circulo c1 = new Circulo("C1", 10);

        mf.imprimir(c1);

        Figura f1 = new Rectangulo("R2");

        //Figura f1 = new Circulo("C2", 15);
        //f1.getLado1();
        int lado1DeR2 = ((Rectangulo)f1).getLado1(); // Casting solo si estoy seguro que f1 apunta a un rectangulo, sino ocurre un error en tiempo de ejecucion
        System.out.println(lado1DeR2);

        //Rectangulo r3 = new Circulo("C2", 10); // Una variable Rectangulo no puede referenciar a un Circulo o una Figura
        //Rectangulo r3 = new Figura("R3");

        Figura semi = new SemiCirculo("Semi1", 10);
        mf.imprimir(semi);
    }
}
