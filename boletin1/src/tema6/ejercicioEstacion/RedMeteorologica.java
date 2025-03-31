package tema6.ejercicioEstacion;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class RedMeteorologica {
    public static void main(String[] args) {
        EstacionMeteorologica estacionMeteorologica = new EstacionMeteorologica("Huelva", 200);
        Sensores sensores1 = new Sensores("c4t", Tipo.Humedad);
        Sensores sensores2 = new Sensores("n32", Tipo.Temperatura);
        Sensores sensores3 = new Sensores("h34", Tipo.Viento);
        Sensores sensores4 = new Sensores("h47", Tipo.Radiacion);

        estacionMeteorologica.addSensor(sensores1);
        estacionMeteorologica.addSensor(sensores2);
        estacionMeteorologica.addSensor(sensores3);
        estacionMeteorologica.addSensor(sensores4);
        estacionMeteorologica.eliminarSensor(sensores3);

        sensores1.addMedicion(LocalDateTime.of(2005, 3, 7, 16, 30), 21.5);
        sensores2.addMedicion(LocalDateTime.of(2006, 4, 6, 17, 31), 22.5);
        sensores3.addMedicion(LocalDateTime.of(2007, 5, 9, 18, 32), 23.5);

        sensores1.addMultiMediciones(Map.of(LocalDateTime.now(), 1.5, LocalDateTime.of(2002, 4,7,5,7, 2), 20.3));

        sensores1.historicoMediciones().entrySet().stream()
                .forEach(s -> System.out.println(s.getKey().format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm")) + " | " + s.getValue()));

        try {
            System.out.printf("%,2f", estacionMeteorologica.getMediaMediciones(sensores1, 4));
        } catch (EstacionException e){
            System.out.println(e.getMessage());
        }
    }
}
