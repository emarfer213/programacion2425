package tema7.boletin2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class ej3 {
    public static void main(String[] args) {
        Path fichEj6 = Path.of("./src/tema7/boletin2/fichero");
        String linea;
        boolean validez = true;
        try (BufferedReader miLector = new BufferedReader(new FileReader("./src/tema7/boletin2/fichero"))) {

            while (validez && (linea = miLector.readLine()) != null) {
                validez = linea.matches("\\p{L}{2,} \\p{L}{2,} \\p{L}{2,} [1-9]\\d?$");
            }

            if(validez){
                System.out.println("cumple");
            } else {
                System.out.println("no cumple");
            }

        } catch (IOException ex) {
            System.out.println("ha ocurrido un error");
            ex.printStackTrace();
        }
    }
}
