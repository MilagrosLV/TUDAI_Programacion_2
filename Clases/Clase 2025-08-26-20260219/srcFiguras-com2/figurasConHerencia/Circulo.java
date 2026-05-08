package figurasConHerencia;

public class Circulo extends Figura {

    int radio;

    public Circulo(String nombre, int radio) {
        super(nombre);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.getRadio(), 2);
    }

    public double getPerimetro() {
        return 2 * Math.PI * this.getRadio();
    }

}
