package tema5.boletin5_2.ej2;

public class Main {
    public static void main(String[] args) {
        Encendible l = new Lampara();
        l.encender();
        l.apagar();
        Encendible t = new Televisor();
        t.encender();
        t.apagar();
    }
}
