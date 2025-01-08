package tema4.boletin4_4_ej7;

public class ej7 {

    public static void main(String[] args) {
        String frase = "curso de progranacion";
        frase = separarConsonantesVocales(frase);
        System.out.println(frase);
    }

    private static String separarConsonantesVocales(String frase) {
        StringBuilder sb = new StringBuilder(frase);
        char[] vocales = new char[frase.length()];
        int contadorVocales = 0;

        for (int i = 0; i < frase.length(); i++) {
            if ((frase.charAt(i)) == 'a' || (frase.charAt(i)) == 'e' || (frase.charAt(i)) == 'i' || (frase.charAt(i)) == 'o' || (frase.charAt(i)) == 'u') {
                ;
                sb.deleteCharAt(i);
                i--;
                vocales[contadorVocales++] = frase.charAt(i);
            } else if (frase.charAt(i)==' ') {
                sb.deleteCharAt(sb.indexOf(String.valueOf(frase.charAt(i))));
            }
        }
        return sb.append(new String(vocales).trim()).toString();
    }
}
