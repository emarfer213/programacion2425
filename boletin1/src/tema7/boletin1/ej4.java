package tema7.boletin1;

import java.io.*;
import java.nio.file.*;

public class ej4 {
    public static void main(String[] args) {

        Path emptyfile = Path.of("boletin1/salida.txt");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {

            String l;
            while ((l = br.readLine()) != null && !l.equalsIgnoreCase("fin")) {
                Files.writeString(emptyfile, l + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
