package figuras;

public class ManejadorDeFiguras {
    
    public void imprimir(Rectangulo r) {
        System.out.println(r.getDatosCompletos());
    }

    public void imprimir(Circulo c) {
        System.out.println(c.getDatosCompletos());
    }
}
