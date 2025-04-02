package tema7.pruebas;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Path;

public class prueba1 {
    public static void main(String[] args) throws FileNotFoundException {
        new prueba1();
    }

    public prueba1() throws FileNotFoundException {
        try (RandomAccessFile data = new RandomAccessFile("..\\boletin1\\src\\tema7\\pruebas\\pradera.bmp", "r");
             FileOutputStream out = new FileOutputStream("..\\boletin1\\src\\tema7\\pruebas\\praderaInversa.bmp")){

            byte[] cabecera = new byte[54];
            data.read(cabecera);
            out.write(cabecera);

            byte[] pixel = new byte[3];

            /**
             * este while se encarga de invertir los colores de la imagen
             */
            while (data.read(pixel) != -1){
                for (int i = 0; i < pixel.length; i++) {
                    pixel[i] = (byte) ~pixel[i];
                }
                out.write(pixel);
            }

            /**
             * este while se encarga de cambiar los colores de la imagen,
             * en este caso colorea la imagen de rojo
             */
            /*while (data.read(pixel) != -1){
                for (int i = 0; i < pixel.length; i++) {
                    if (i != 2){
                        pixel[i] = 0;
                    }
                }
                out.write(pixel);
            }*/

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
