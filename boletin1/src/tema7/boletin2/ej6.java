package tema7.boletin2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ej6 {
    public static void main(String[] args) {
        Path nombresEj6 = Path.of("./src/tema7/boletin2/ficheroEj6");
        Path directoriosDestino = Path.of("./src/tema7/boletin2/Directorios");
        Pattern patron = Pattern.compile("^(?<NOMBRE>\\p{L}+)\\s+(?<APELLIDO1>\\p{L}+)+\\s+(?<APELLIDO2>\\p{L}+)\\s+(?<CURSO>.+)$");

        try (BufferedReader br = new BufferedReader(new FileReader(nombresEj6.toFile()))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                Matcher matcher = patron.matcher(linea);
                if (matcher.matches()) {
                    Path directorioCreado = Files.createDirectories(Path.of(directoriosDestino.toString(), matcher.group("CURSO"),
                            matcher.group("APELLIDO1") + matcher.group("APELLIDO2") + matcher.group("NOMBRE")));
                    System.out.println("se ha creado el directorio: " + directorioCreado);
                } else {
                    System.out.println("la linea " + linea + " no es correcta");
                }
            }

        } catch (IOException e) {
            System.out.println("ha ocurrido un error" + e.getMessage());
        }

    }
}
