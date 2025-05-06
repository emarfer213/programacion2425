package tema7.examenPrueba;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ej1 {
    public static void main(String[] args) {
        Path dirEntrada = Paths.get("src/tema7/examenPrueba/directorio1");
        Path dirSalida = Paths.get("src/tema7/examenPrueba/directorio2");

        if (!Files.exists(dirEntrada)){

        }
    }

    public static void copiarDirectorio(Path origen, Path destino){
        if (!Files.exists(origen) || !Files.exists(destino)){
            throw new examenException("no existen los directorios");
        }
        if (!Files.isDirectory(origen) || !Files.isDirectory(destino)){
            throw new examenException("no es directorio");
        }
        if (!Files.isReadable(origen)) {
            throw new examenException("no tiene permisos de lectura");
        }
        if (!Files.isReadable(destino)){
            throw new examenException("no tiene permisos de escritura");
        }

        try(Stream<Path> pathStream = Files.walk(destino);) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
