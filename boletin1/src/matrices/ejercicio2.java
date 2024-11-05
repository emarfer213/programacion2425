
/*2. Crea un método que sume todas las posiciones de una matriz y devuelva dicho número.*/

package matrices;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        int[][] matriz = {{1,2,3}, {4,5,6}};
        int resultado = sumaMatriz(matriz);
        System.out.println("este es el resultado");
        System.out.println(resultado);
    }

    public static int sumaMatriz(int[][] matriz) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

}
