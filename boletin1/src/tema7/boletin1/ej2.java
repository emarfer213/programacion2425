package tema7.boletin1;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ej2 {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("input.txt");
             BufferedReader br = new BufferedReader(fr)) {
            StringBuilder stringBuilder = new StringBuilder();
            String l;

            while ((l = br.readLine()) != null) {
                stringBuilder.append(l);
            }
            System.out.println(stringBuilder);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

