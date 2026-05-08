package figuras;

public class Circulo {

    String nombre;
    int radio;

    public Circulo(String nombre, int radio) {
        this.nombre = nombre;
        this.radio = radio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getDatosCompletos() {
        return "Nombre: " + this.getNombre() + " Area: " + this.getArea() + " Perimetro: " + this.getPerimetro(); 
    }

}
