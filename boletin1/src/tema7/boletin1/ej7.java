package tema7.boletin1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ej7 {
    public static void main(String[] args) {

    }

    public static void listarFicherosDirectorio(String ruta) throws ej7Exception{
        try{
            Path archivo = Path.of(ruta);
            if (!Files.exists(archivo)){
                throw new ej7Exception("no existe el directorio");
            }
            if (!Files.isReadable(archivo)){
                throw new ej7Exception("el archivo no es lejible");
            }
            try (Stream<Path> flujo = Files.list(archivo)){
                flujo.map(p -> {
                    if (Files.isDirectory(p)){
                        return String.format("ni se puede calcular", p.getFileName());
                    } else {
                        try {
                            return String.format("nombre: %s, peso: %.2f", p.getFileName(), (double) Files.size(p) / 1024);
                        } catch (IOException e){
                            throw new RuntimeException(e);
                        }
                    }
                }).forEach(System.out::println);
            } catch (IOException e){
                throw new ej7Exception(e.getMessage());
            }
        } catch (InvalidPathException e){
            throw new ej7Exception(e.getMessage());
        }
    }


}
