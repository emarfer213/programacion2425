package tema7.boletin1;

import java.io.*;

public class ej3 {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter os = new PrintWriter(new FileWriter("salida.txt"))) {

            String l;
            while ((l = br.readLine()) != null) {
                os.println(l);
            }
            os.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}

