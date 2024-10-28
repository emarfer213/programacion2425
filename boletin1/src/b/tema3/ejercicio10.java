package b.tema3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio10 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arrayOriginal = creaArray();
        int[] nuevoArray = eliminarDuplicados(arrayOriginal);
        System.out.println(Arrays.toString(nuevoArray));

    }

    private static int[] creaArray(){
        System.out.println("cuantos numeros quieres meter");
        int n1 = sc.nextInt();

        int[] array = new int[n1];

        for (int i = 0; i < array.length; i++) {
            System.out.println("dime un numero");
            array[i] = sc.nextInt();
        }

        return array;

    }

    private static int buscarNumero (int[] array, int num){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }

    private static int[] eliminarDuplicados(int[] arrayOriginal){
        int[] nuevoArray = new int[arrayOriginal.length];
        int indiceCopia = 0;
        for (int i = 0; i < arrayOriginal.length; i++) {
            if (buscarNumero(nuevoArray, arrayOriginal[i]) == -1) {
                nuevoArray[indiceCopia] = arrayOriginal[i];
                indiceCopia++;
            }
        }
        int[] arrayFinal = new int[indiceCopia];

        for (int i = 0; i < arrayFinal.length; i++) {
            arrayFinal[i] = nuevoArray[i];
        }

        return arrayFinal;
    }
}

/*public static int[] eliminaDuplicados(int[] array){
    int[] arraySinDuplicados = new int[array.length];
    int indiceArraySinDuplicados = 0;
    for (int i = 0; i < array.length; i++) {
        if (!buscarElemento(arraySinDuplicados, array[i])){
            arraySinDuplicados[indiceArraySinDuplicados++] = array[i];
        }
    }

    int[] arrayTamExacto = new int[indiceArraySinDuplicados];

    for (int i = 0; i < indiceArraySinDuplicados; i++) {
        arrayTamExacto[i] = arraySinDuplicados[i];
    }

    return arrayTamExacto;
}*/