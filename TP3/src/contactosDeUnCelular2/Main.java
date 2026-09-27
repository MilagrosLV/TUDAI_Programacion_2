package contactosDeUnCelular2;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciamos la aplicación de contactos
        AppContactos app = new AppContactos();

        // 2. Creación de contactos usando el Patrón Builder
        
        // Contacto 1: Completo
        Contacto c1 = new Contacto.Builder("Juan", "Pérez", "2494112233")
                .ciudad("Tandil")
                .direccion("Av. España 456")
                .mail("juan.perez@email.com")
                .dob(LocalDate.of(1995, 5, 20))
                .build();

        // Contacto 2: Sin datos opcionales (para probar valores por defecto y sin fecha de nacimiento)
        Contacto c2 = new Contacto.Builder("María", "Gómez", "2494889900")
                .build();

        // Contacto 3: Con fecha de nacimiento
        Contacto c3 = new Contacto.Builder("Lucas", "Rodríguez", "1155667788")
                .ciudad("Azul")
                .dob(LocalDate.of(2000, 10, 15))
                .build();

        // Contacto 4: Duplicado de Juan Pérez (mismo nombre, apellido y teléfono, pero distinta ciudad/fecha)
        Contacto c4 = new Contacto.Builder("Juan", "Pérez", "2494112233")
                .ciudad("Buenos Aires")
                .dob(LocalDate.of(1995, 5, 20))
                .build();

        // 3. Carga de contactos en la app
        app.agregarContacto(c1);
        app.agregarContacto(c2);
        app.agregarContacto(c3);
        app.agregarContacto(c4);

        // 4. Mostrar Resumen de la Aplicación
        System.out.println("==========================================");
        System.out.println("       RESUMEN DE LA APP DE CONTACTOS     ");
        System.out.println("==========================================\n");
        
        app.resumen();

        // 5. Prueba del método para buscar contactos por número de teléfono
        System.out.println("\n==========================================");
        System.out.println("   BUSCAR CONTACTOS POR TELÉFONO (2494112233)");
        System.out.println("==========================================");
        
        List<Contacto> contactosPorTel = app.getContactosNroTel("2494112233");
        for (Contacto c : contactosPorTel) {
            System.out.println(c);
        }
    }
}
