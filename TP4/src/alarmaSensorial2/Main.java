package alarmaSensorial2;

public class Main {
    public static void main(String[] args) {
        // 1. Crear sensores para distintas zonas de la casa
        SensorTemperatura tempCocina = new SensorTemperatura("Cocina", 40.0); // Alerta si pasa los 40°C
        SensorTemperatura tempGaraje = new SensorTemperatura("Garaje", 50.0); // Alerta si pasa los 50°C
        SensorDisturbio disturbioPatio = new SensorDisturbio("Patio Trasero");
        SensorDisturbio disturbioEntrada = new SensorDisturbio("Entrada Principal");

        // 2. Probar una Alarma Convencional
        System.out.println("=== PRUEBA 1: ALARMA CONVENCIONAL ===");
        Alarma alarmaCasa = new Alarma();

        // Agregar los sensores
        alarmaCasa.agregarSensor(tempCocina);
        alarmaCasa.agregarSensor(tempGaraje);
        alarmaCasa.agregarSensor(disturbioPatio);

        // Primer chequeo (Todo normal)
        System.out.println("--> Primer chequeo (sin eventos):");
        alarmaCasa.comprobar();

        // Simular eventos que activan el sistema
        System.out.println("\n--> Simulando incendio en Cocina y movimiento en Patio...");
        tempCocina.setTempAct(45.5); // Supera el límite de 40.0
        disturbioPatio.dispararDisturbio();

        // Segundo chequeo (Debe sonar el timbre y listar 'Cocina' y 'Patio Trasero')
        alarmaCasa.comprobar();

        // Resetear la alarma
        System.out.println("\n--> Reseteando alarma...");
        alarmaCasa.resetearAlarma();

        // Tercer chequeo (Debe volver a la normalidad)
        System.out.println("--> Chequeo posterior al reseteo:");
        alarmaCasa.comprobar();


        // 3. Probar la Alarma Luminosa
        System.out.println("\n==========================================");
        System.out.println("=== PRUEBA 2: ALARMA LUMINOSA ===");
        AlarmaLuminosa alarmaLuminosa = new AlarmaLuminosa();

        alarmaLuminosa.agregarSensor(tempGaraje);
        alarmaLuminosa.agregarSensor(disturbioEntrada);

        // Simular elevación de temperatura extrema en Garaje
        System.out.println("--> Simulando sobrecalentamiento en Garaje...");
        tempGaraje.setTempAct(62.0);

        // Al comprobar, debe encender el timbre y activar la luz
        alarmaLuminosa.comprobar();

        // Apagar la alarma luminosa
        System.out.println("\n--> Apagando alarma luminosa...");
        alarmaLuminosa.apagarAlarma();
    }
}
