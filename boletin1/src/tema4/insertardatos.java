package tema4;

import java.util.Scanner;

public class insertardatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean fin = false;
        StringBuilder frase = new StringBuilder();

        while (!fin) {
            System.out.println("introduce palabras no dejara de acumularlas hasta que se añada la palabra fin");
            String respuesta = sc.next();
            if ("fin".equals(respuesta)) {
                fin = true;
            } else {
                frase.append(respuesta);
            }

        }
        System.out.println(frase);
    }
}
