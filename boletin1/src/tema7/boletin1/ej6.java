package tema7.boletin1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class ej6 {
    public static void main(String[] args) {

    }

    /*public static Path mostrarDirectorio(Path nombre) throws IOException {
        Path ruta = Path.of("src/tema7/boletin1/"+nombre);

        try (Stream<Path> flujo = Files.list(ruta)){
            List<String> archibos = flujo
                    .filter(Files::isRegularFile)
                    .map(path -> {})
        }
    }*/
}
