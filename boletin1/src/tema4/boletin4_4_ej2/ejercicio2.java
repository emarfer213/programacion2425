package tema4.boletin4_4_ej2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        int contarMayusculas = 0;
        int contarMinusculas = 0;
        int contarNumero = 0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ingrese una palabra");
            String cadena = sc.nextLine();

            for (int i = 0; i < cadena.length(); i++) {
                char c = cadena.charAt(i);

                if (Character.isLetter(c)) {
                    if (Character.isUpperCase(c)) {
                        contarMayusculas++;
                    } else {
                        contarMinusculas++;
                    }
                } else if (Character.isDigit(c)) {
                    contarNumero++;
                }
            }
        }

        System.out.printf("mayusculas=%d , minuscula=%d , numeros=%d ", contarMayusculas, contarMinusculas, contarNumero);

    }


}
