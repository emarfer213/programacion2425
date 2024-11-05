/*3. Crea un método que reciba una matriz e imprima,en una sola línea, los elementos de la misma, leídos por filas:*/

package matrices;

public class ejercicio3 {
    public static void main(String[] args) {

        int[][] matriz = {{1,2,3}, {4,5,6}};
        elementosMatriz(matriz);

    }
    private static void elementosMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + ", ");
            }
        }
    }
}
