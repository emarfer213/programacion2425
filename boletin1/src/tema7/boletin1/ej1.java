package tema7.boletin1;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ej1 {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("input.txt");
             BufferedReader br = new BufferedReader(fr)) {

            int contador = 0;
            while (br.readLine() != null) {
                contador++;
            }

            System.out.println("el fichero tiene " + contador + " lineas");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

