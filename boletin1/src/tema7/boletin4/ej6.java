package tema7.boletin4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ej6 {
    public static void main(String[] args) {
        //File file = new File("src/tema7/boletin4/bitacoras.txt");
        rotarContenido();
    }

    public static void rotarContenido() {
        Path rutaDestino = Path.of("src/tema7/boletin4/bitacoras.txt");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String l;
            while (!(l = br.readLine()).equals("fin")) {
                Files.writeString(rutaDestino, l + "\n", StandardOpenOption.APPEND, StandardOpenOption.CREATE);
                if (Files.size(rutaDestino) > 20) {
                    List<String> listaDeLineas = Files.readAllLines(rutaDestino);
                    listaDeLineas.removeFirst();
                    Files.write(rutaDestino, listaDeLineas, StandardOpenOption.TRUNCATE_EXISTING);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
