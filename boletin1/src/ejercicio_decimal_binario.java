import java.util.Scanner;

public class ejercicio_decimal_binario {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //pedimos un numero
        System.out.println("dame un numero");

        //creamos dos entidades, n1 sera el numero que vamos a introducir y digito sera el que nos vaya acumulando los restos
        int n1 = sc.nextInt();
        int digito;

        //creamos otra entidad en la cual se van a listar los restos de cada division
        String binario = "";


        //creamos un do while para que la division se repita hasta que el resto sea 0
        do {

            digito = n1 % 2;
            //esta linea sera la que baya acumulando los restos
            binario += digito;
            n1 = n1/2;

        }while (n1 != 0);
        // para que el resultado nos salga correctamente tenemos que darle la vuelta a binario, asi que usamos la siguiente linea
        binario = new StringBuilder(binario).reverse().toString();
       //solo queda mostrar el resultado que sale en binario
        System.out.println("el numero en binario sale " + binario);
    }

}