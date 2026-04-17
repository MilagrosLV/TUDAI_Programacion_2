package contactosDeUnCelular;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
         //Iterarciones
        Celular cel = new Celular();
        Contacto c1 = new Contacto("Juan", "Perez", "123456789", "juan.perez@email.com", new Direccion("Ciudad1", "Calle1", "123"), LocalDate.of(1990, 1, 1));
        Contacto c2 = new Contacto("Maria", "Gomez", "987654321", "maria.gomez@email.com", new Direccion("Ciudad2", "Calle2", "456"), LocalDate.of(1985, 5, 15));
        Contacto c3 = new Contacto("Carlos", "Lopez", "555555555", "carlos.lopez@email.com", new Direccion("Ciudad3", "Calle3", "789"), LocalDate.of(1995, 10, 20));
        Contacto c4 = new Contacto("Ana", "Martinez", "555555555", "ana.martinez@email.com", new Direccion("Ciudad4", "Calle4", "012"), LocalDate.of(1992, 8, 10));
        Contacto c5 = new Contacto("Juan", "Perez", "123456789", "juan.perez@email.com", new Direccion("Ciudad5", "Calle5", "345"), LocalDate.of(1988, 3, 25));
        Contacto c6 = new Contacto("Laura", "Lopez", "222222222", "laura.garcia@email.com", new Direccion("Ciudad6", "Calle6", "678"), LocalDate.of(1990, 12, 5));


        cel.agregarContacto(c1);
        cel.agregarContacto(c2);
        cel.agregarContacto(c3);
        cel.agregarContacto(c4);
        cel.agregarContacto(c5);
        cel.agregarContacto(c6);

        cel.mostrarResumen();
        System.out.println(cel.contactosPorTel(c3.getNroTel()));
    }
}   
