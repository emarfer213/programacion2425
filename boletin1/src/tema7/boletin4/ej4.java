package tema7.boletin4;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ej4 {
    public static void main(String[] args) {
        File file = new File("src/tema7/boletin4/salidaEj4.txt");
        PrintWriter pw = null;

        if (file.exists()){
            file.delete();
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            pw = new PrintWriter(new FileWriter(file));
            String l;
            while ((l = br.readLine()) != null && !l.equalsIgnoreCase("fin")) {
                pw.println(l);
                pw.flush();
            }

            if (file.length() > 20) {
                pw.close();
                String nombreNuevoFile = "log " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_hhmmss"));
                if (!file.renameTo(new File("src/tema7/boletin4/" + nombreNuevoFile))) {
                    System.out.println("error, no se ha podido renombrar");
                }

                file = new File(file.getPath());
                pw = new PrintWriter(new FileWriter(file));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            assert pw != null;
            pw.close();
        }
    }
}
