package figurasConHerencia;

public class Rectangulo extends Figura {

    private static final int LADO_POR_DEFECTO = 10;
    private int lado1, lado2;


    public Rectangulo(String nombre, int lado1, int lado2) {
        super(nombre);
        this.setLado1(lado1);
        this.lado2 = lado2;
    }

    public Rectangulo(String nombre) {
        this(nombre, 10, 10);
    }

    public void setLado1(int lado1) {
        if (lado1 > 0)
            this.lado1 = lado1;
        else
            this.lado1 = LADO_POR_DEFECTO;
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    @Override
    public double getArea() {
        return this.getLado1() * this.getLado2();
    }

    public double getPerimetro() {
        return (this.getLado1() + this.getLado2()) * 2;
    }


}
