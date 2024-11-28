package matrices;

public class ejercicio7 {
    public static void main(String[] args) {

        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matriz2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean size = comprobarSize(matriz1, matriz1);
        if (size) {
            boolean numeros = comprobarNumeros(matriz1, matriz2);
            if (numeros) {
                System.out.println("las dos son exactamente iguales");
            } else {
                System.out.println("mismo tamaño diferentes numeros");
            }
        } else {
            System.out.println("son completamente distintas");
        }

    }

    private static boolean comprobarSize(int[][] matriz1, int[][] matriz2) {
        if (matriz1.length != matriz2.length) {
            return false;
        }
        for (int i = 0; i < matriz1.length; i++) {
            if (matriz1[i].length != matriz2[i].length) {
                return false;
            }
        }
        return true;
    }

    private static boolean comprobarNumeros(int[][] matriz1, int[][] matriz2) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}