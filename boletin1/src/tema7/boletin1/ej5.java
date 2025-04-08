package tema7.boletin1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class ej5 {
    public static void main(String[] args) {
        try {
            //crearDirectorioNio("experimento2|");
            crearFicheroTexto("experimento3", "es un experimento y es el tercero");
        } catch (Ej5Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static File crearDirectorio(String nombre) throws Ej5Exception {
        File directorio = new File("src/tema7/boletin1/" + nombre);
        if (!directorio.mkdir()) {
            throw new Ej5Exception("no se puede crear la carpeta");
        }
        return directorio;
    }

    public static Path crearDirectorioNio(String nombre) throws Ej5Exception {
        try {
            Path directorioNio = Path.of("src/tema7/boletin1/", nombre);
            Files.createDirectory(directorioNio);
            return directorioNio;
        } catch (FileAlreadyExistsException i) {
            throw new Ej5Exception(i.getMessage());
        } catch (IOException e) {
            throw new Ej5Exception(e.getMessage());
        } catch (InvalidPathException e) {
            throw new Ej5Exception(e.getMessage());
        }
    }

    public static Path crearFicheroTexto(String nombre, String contenido) throws Ej5Exception {
        try {
            Path ficheroNio = Path.of("src/tema7/boletin1/", nombre);
            Files.createFile(ficheroNio);
            Files.writeString(ficheroNio, contenido);
            return ficheroNio;
        } catch (FileAlreadyExistsException i) {
            throw new Ej5Exception("no se puede duplicar: "+i.getMessage());
        } catch (IOException e) {
            throw new Ej5Exception(e.getMessage());
        } catch (InvalidPathException e) {
            throw new Ej5Exception(e.getMessage());
        }
    }

    public static void borrarFicheroDeTexto(String nombre, String contenido) throws Ej5Exception {
        try {
            Path ficheroNio =  Path.of("src/tema7/boletin1/", nombre);
            if (!Files.deleteIfExists(ficheroNio)){
                throw new Ej5Exception("el fichero no existe");
            }

        } catch (IOException e) {
            throw new Ej5Exception(e.getMessage());
        } catch (InvalidPathException e) {
            throw new Ej5Exception(e.getMessage());
        }

    }
}
