package libreria;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Crear Librería
        Libreria libreria = new Libreria("Librería Central");

        // 2. Crear Clientes
        // Descuentos: Normal (10%), Frecuente (15%), Socio (30%)
        Cliente c1 = new Cliente("Juan Pérez", "11111111", "Calle 1 #123", 10.0);
        c1.addAutorFavorito("Jorge Luis Borges");
        c1.addGeneroFavorito("Ficción");

        Cliente c2 = new Cliente("María Gómez", "22222222", "Calle 2 #456", 15.0);
        c2.addAutorFavorito("Jorge Luis Borges");
        c2.addGeneroFavorito("Poesía"); // No tiene 'Ficción'

        Cliente c3 = new Cliente("Carlos Rodríguez", "33333333", "Calle 3 #789", 30.0);
        c3.addAutorFavorito("Julio Cortázar");
        c3.addGeneroFavorito("Ficción");

        libreria.agregarCliente(c1);
        libreria.agregarCliente(c2);
        libreria.agregarCliente(c3);

        // 3. Crear Productos (Libros y Revistas)
        Producto p1 = new Producto("Ficciones", "Jorge Luis Borges", "Colección de cuentos", 12000.0, 220);
        p1.agregarGenero("Ficción");
        p1.agregarGenero("Fantástico");

        Producto p2 = new Producto("Rayuela", "Julio Cortázar", "Novela de la posmodernidad", 15000.0, 600);
        p2.agregarGenero("Novela");

        libreria.agregarProducto(p1);
        libreria.agregarProducto(p2);

        // Simular compra previa
        c1.addCompra(p1);

        System.out.println("==================================================");
        System.out.println("            PRUEBAS DE SERVICIOS                  ");
        System.out.println("==================================================\n");

        // Servicio 1: Conocer precio según el cliente y su descuento
        System.out.println("--- SERVICIO 1: Precio con descuento ---");
        System.out.println("Precio lista de '" + p1.getNombre() + "': $" + p1.getPrecio());
        System.out.println("Precio para Juan (10% desc): $" + libreria.calcularPrecioProducto(c1, p1));
        System.out.println("Precio para María (15% desc): $" + libreria.calcularPrecioProducto(c2, p1));
        System.out.println("Precio para Carlos (30% desc): $" + libreria.calcularPrecioProducto(c3, p1));

        // Servicio 2: Conocer si un cliente ya compró un producto
        System.out.println("\n--- SERVICIO 2: Verificación de compra previa ---");
        System.out.println("¿Juan ya compró 'Ficciones'?: " + libreria.yaTieneProducto(c1, p1)); // true
        System.out.println("¿María ya compró 'Ficciones'?: " + libreria.yaTieneProducto(c2, p1)); // false

        // Definición de Condiciones para Búsqueda / Gustos
        Condicion condAutor = new CondicionAutorFavorito("Jorge Luis Borges");
        Condicion condGenero = new CondicionGenero("Ficciones");
        Condicion condExigente = new CondicionAND(condAutor, condGenero);

        // Servicio 3: Saber si a un cliente le gusta un producto específico
        System.out.println("\n--- SERVICIO 3: ¿Le gusta el producto? ---");
        System.out.println("A Juan (Estándar - Autor Favorito) ¿le gusta 'Ficciones'?: " 
                + libreria.leGustaProducto(c1, p1, condAutor)); // true
        
        System.out.println("A María (Exigente - Autor Y Género) ¿le gusta 'Ficciones'?: " 
                + libreria.leGustaProducto(c2, p1, condExigente)); // false (Borges es su autor pero no le gusta 'Ficció'n)

        // Servicio 4: Devolver listado de clientes a los que les gusta un producto
        System.out.println("\n--- SERVICIO 4: Lista de clientes a los que les gusta 'Ficciones' ---");
        
        System.out.println("> Criterio Estándar (Solo Autor Favorito):");
        List<Cliente> clientesEstandar = libreria.lesGustaProducto(p1, condAutor);
        for (Cliente c : clientesEstandar) {
            System.out.println("- " + c.getNombre());
        }

        System.out.println("\n> Criterio Exigente (Autor Y Género Favoritos):");
        List<Cliente> clientesExigentes = libreria.lesGustaProducto(p1, condExigente);
        for (Cliente c : clientesExigentes) {
            System.out.println("- " + c.getNombre());
        }
    }
}
