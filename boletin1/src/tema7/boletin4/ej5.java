package tema7.boletin4;

import java.io.*;

public class ej5 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter pw = new PrintWriter(new FileWriter("src/tema7/boletin4/datos.txt", true))) {

            String l;
            while ((l = br.readLine()) != null && !l.equalsIgnoreCase("fin")) {
                pw.println(l);
                pw.flush();


            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
