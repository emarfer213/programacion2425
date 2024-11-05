/* Crea un método que reciba una matriz e imprima,en una sola línea, los elementos de la misma, leídos por filas, empezando por los últimos índices: */

package matrices;

public class ejercicio4 {
    public static void main(String[] args) {

        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        elementosMatriz(matriz);

    }
    private static void elementosMatriz(int[][] matriz) {
        for (int i = matriz.length-1; i >= 0; i--) {
            for (int j = matriz[i].length-1; j >= 0; j--) {
                System.out.print(matriz[i][j] + ", ");
            }
        }
    }
}
