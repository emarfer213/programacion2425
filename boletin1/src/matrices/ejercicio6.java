package matrices;

public class ejercicio6 {
    public static void main(String[] args) {

        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        elementosMatriz(matriz);

    }
    private static void elementosMatriz(int[][] matriz) {
        for (int j = matriz[0].length-1; j >= 0; j--) {
            for (int i = matriz[j].length-1; i >= 0; i--) {
                System.out.print(matriz[i][j] + ", ");
            }
        }
    }
}