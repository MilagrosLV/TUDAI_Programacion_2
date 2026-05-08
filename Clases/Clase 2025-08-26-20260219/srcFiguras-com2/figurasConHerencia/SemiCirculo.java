package figurasConHerencia;

public class SemiCirculo extends Circulo {

    public SemiCirculo(String nombre, int radio) {
        super(nombre, radio);
    }

    public double getArea() {
        return super.getArea() / 2;
    }

    public double getPerimetro() {
        return super.getPerimetro() / 2 + 2 * this.getRadio();
    }

}
