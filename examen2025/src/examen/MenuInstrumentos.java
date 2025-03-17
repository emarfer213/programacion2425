package examen;

public class MenuInstrumentos {

    /**
     * clase main en la colocare todos los comandos pertinentes para que aparezca el texto que se pide en el examen,
     * llamando a diversas funciones de interfaces
     * @param args
     */
    public static void main(String[] args) {
        try {
            GuitarraAcustica ins1 = new GuitarraAcustica("guitarra española", false, 2.5);
            GuitarraElectrica ins2 = new GuitarraElectrica("Fender Stratocaster", true, 3.5);
            Piano ins3 = new Piano("yamaha clavinova", false);
            Flauta ins4 = new Flauta("flauta dulce", true, 0.5);
            Bateria ins5 = new Bateria("bateria acustica", false);

            System.out.println("=== AFINAR Y TOCAR INSTRUMENTOS ===");
            System.out.println(ins1.comprobarAfinado());
            System.out.println(ins1.tocarInstrumento());
            System.out.println(ins2.comprobarAfinado());
            System.out.println(ins2.tocarInstrumento());
            System.out.println(ins3.comprobarAfinado());
            System.out.println(ins3.tocarInstrumento());
            System.out.println(ins4.comprobarAfinado());
            System.out.println(ins4.tocarInstrumento());
            System.out.println(ins5.comprobarAfinado());
            System.out.println(ins5.tocarInstrumento());
            System.out.println("=== PRUEBA DE PORTABILIDAD ===");
            System.out.println(ins1.comprobarPortabilidad());
            System.out.println(ins2.comprobarPortabilidad());
            System.out.println(ins4.comprobarPortabilidad());
            System.out.println("=== PRUEBA DE AMPLIFICACIÓN === ");
            System.out.println(ins2.conectarAmplificador());
            System.out.println(ins2.ajustarVolumen());

        } catch (InstrumentoException e1) {

        }
    }



}
