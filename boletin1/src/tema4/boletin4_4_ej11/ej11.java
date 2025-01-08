package tema4.boletin4_4_ej11;

import java.util.Scanner;

public class ej11 {
    public static final int limiteFallos = 7;
    private static final String palabraOculta = "Aprobar";
    private static final StringBuilder palabraMostrar = new StringBuilder("_".repeat(palabraOculta.length()));
    private static int contadorDeFallos;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean terminado = false;

        while (!terminado) {
            System.out.println(palabraMostrar);
            System.out.println("ponga una letra");
            char letra = sc.next().charAt(0);
            buscarLetra(letra);
            System.out.printf("tiene %d fallos \n", contadorDeFallos);
            if (palabraOculta.contentEquals(palabraMostrar)) {
                System.out.println("ganaste!");
                terminado = true;
            } else if (contadorDeFallos == limiteFallos) {
                System.out.println(palabraOculta);
                System.out.println("has perdido");
                terminado = true;
            }
        }
    }

    public static void buscarLetra(char letra) {
        boolean letraEsta = false;

        for (int i = 0; i < palabraOculta.length(); i++) {
            if (palabraOculta.toLowerCase().charAt(i) == letra) {
                palabraMostrar.replace(i, i + 1, palabraOculta.substring(i, i+1));
                letraEsta = true;
            }
        }
        if (!letraEsta) {
            contadorDeFallos++;
        }
    }
}
