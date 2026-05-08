package figuras;

public class Principal {
    public static void main(String[] args) {
        ManejadorDeFiguras mf = new ManejadorDeFiguras();

        Rectangulo r1 = new Rectangulo("R1", 15, 1);

        mf.imprimir(r1);

        Circulo c1 = new Circulo("C1", 10);

        mf.imprimir(c1);
    }
}
