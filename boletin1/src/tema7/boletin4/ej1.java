package tema7.boletin4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ej1 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/tema7/boletin4/archivo1");
             BufferedReader br = new BufferedReader(fr)){
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null){
                String[] palabras = linea.split("\\s");
                contador += palabras.length;
            }
            System.out.println("el numero de palabras es " + contador);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
