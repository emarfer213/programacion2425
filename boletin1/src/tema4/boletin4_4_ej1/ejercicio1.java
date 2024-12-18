package tema4.boletin4_4_ej1;

public class ejercicio1 {
    public static void main(String[] args) {
        String cadena = "Frigorifico";
        System.out.println(contarCaracter(cadena.toLowerCase(), 'f'));
    }

    public static int contarCaracter(String cadena, char caracter) {

        int contador = 0;
        cadena=cadena.toLowerCase();
        caracter=Character.toLowerCase(caracter);

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }
        return contador;
    }
}
