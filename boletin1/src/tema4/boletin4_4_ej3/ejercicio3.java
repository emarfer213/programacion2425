package tema4.boletin4_4_ej3;

public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println(comprobarPalindromo2("anilina"));
    }

    /*public static boolean comprobarPalindromo(String palabra) {
        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }*/

    public static boolean comprobarPalindromo2(String palabra) {
        String palabraInvertida = new StringBuilder(palabra).reverse().toString();
        return palabraInvertida.equals(palabra);
    }
}
