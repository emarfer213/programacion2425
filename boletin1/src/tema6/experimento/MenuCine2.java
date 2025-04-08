package tema6.experimento;

public class MenuCine2 {
    public static void main(String[] args) {
        BibliotecaCine2 bibliotecaCine2 = new BibliotecaCine2();

        Frase2 frase = new Frase2("yo soy tu padre", "Star Wars", "Dart Vader", 4);
        Frase2 frase2 = new Frase2("Wingardius Lebiosa", "Harry Potter", "Harry Potter", 2);
        Frase2 frase3 = new Frase2("Zas en toda la boca", "Big Bang Theory", "Sheldon Couper", 5);
        Frase2 frase4 = new Frase2("Multiplicate por 0", "Los Simpsons", "Bart Simpson", 5);
        Frase2 frase5 = new Frase2("I... Am Steve", "Minecraft; The Movie", "Jack Black", 0);
        Frase2 frase6 = new Frase2("¿Jugamos un Cooperativo?", "Super Mario Bros: La Pelicula", "Donkey Kong", 3);
        Frase2 frase7 = new Frase2("Lo primero... Buenos Dias", "Shazam", "Lex Luthor", 5);

        try {
            bibliotecaCine2.addCategoria("Terror");
            bibliotecaCine2.addCategoria("Comedia");
            bibliotecaCine2.addCategoria("Accion");
            bibliotecaCine2.addCategoria("Drama");

            bibliotecaCine2.addFrase("Drama" ,frase5 );
            bibliotecaCine2.addFrase("Accion" ,frase7 );
            bibliotecaCine2.addFrase("Accion" ,frase3 );
            bibliotecaCine2.addFrase("Accion" ,frase4 );
            bibliotecaCine2.addFrase("Accion" ,frase5 );
            bibliotecaCine2.addFrase("Comedia" ,frase6 );
            bibliotecaCine2.addFrase("Comedia" ,frase3 );
            bibliotecaCine2.addFrase("Comedia" ,frase );
            bibliotecaCine2.addFrase("Comedia" ,frase2 );
            bibliotecaCine2.addFrase("Terror" ,frase6 );
            bibliotecaCine2.addFrase("Terror" ,frase7 );

            System.out.println(bibliotecaCine2.categoriasConFrasesSinValoracion() + "\n");

            System.out.println(bibliotecaCine2.categoriasDeFrase(frase6) + "\n");

            System.out.println(bibliotecaCine2.getTodasLasFrasesOrdenadasPorValoracion() + "\n");

            bibliotecaCine2.deleteFrase(frase6);
            System.out.println(bibliotecaCine2.categoriasDeFrase(frase6) + "\n");

            System.out.println(bibliotecaCine2.frasesUltimoAnho());


        } catch (CineException2 e) {
            System.out.println(e.getMessage());
        }
    }
}
