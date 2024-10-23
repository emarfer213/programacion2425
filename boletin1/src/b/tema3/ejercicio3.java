package b.tema3;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

    public class ejercicio3 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("¿Cuántos elementos quieres en el array de enteros?");
            int elementos = entrada.nextInt();

            int[] numero = new int[elementos];

            System.out.println("Pon los números del Array");

            for (int i = 0; i < elementos; i++) {
                System.out.print("Pon el número: " + (i + 1) + " : ");

                numero[i] = entrada.nextInt();
            }

            System.out.print("Los números son: ");
            System.out.println(Arrays.toString(numero));


            int mayor = numero[0];
            int menor = numero[0];

            float media = 0;
            int numRepeMayor = 1;
            int numRepeMenor = 1;

            for (int i = 1; i < numero.length; i++) {
                if (numero[i] > mayor) {
                    mayor = numero[i];
                    numRepeMayor = 1;
                }
                if (numero[i] < menor) {
                    menor = numero[i];
                    numRepeMenor = 1;
                }
                if (numero[i] == mayor) {
                    numRepeMayor++;
                }
                if (numero[i] == menor) {
                    numRepeMenor++;
                }
                media += numero[i];
            }
            media = media / elementos;

            System.out.printf("El número mayor es %d, el menor %d, y la media %s", mayor, menor, media);
        }
    }