package ejercicio_interfaces_videojuegos;

public class MenuJuego {
    public static void main(String[] args) {
        JuegoAccion juegoAccion = new JuegoAccion("uncharted", "naughty dog", 40, 10);
        JuegoRPG juegoRPG = new JuegoRPG("pokemon", "game freack", 50, 4);
        JuegoDeportes juegoDeportes = new JuegoDeportes("Fifa", "electronic arts", 45, "futbol", true);
        JuegoEstrategia juegoEstrategia = new JuegoEstrategia("xcom", "x", 20, "dolares", 30);

        Juego[] juegos = new Juego[] {juegoAccion, juegoRPG, juegoDeportes, juegoEstrategia};

        try {
            for (int i = 0; i < juegos.length; i++) {
                double costoJuego = juegos[i].getCostoBase();
                if (juegos[i] instanceof Actualizable actualizable){
                    actualizable.actualizar();
                    costoJuego += Actualizable.costeActualizacion;
                }
                if (juegos[i] instanceof Multijugador multijugador){
                   if (multijugador.comprobarCompatibilidadServidor()){
                       costoJuego += Multijugador.costoServidores;
                       System.out.println("el juego es compatible");
                   } else {
                       System.out.println("el juego no es compatible");
                   }
                }
                System.out.printf("el coste del juego %s es %.2f €\n", juegos[i].getTitulo(), costoJuego);
            }
        } catch (JuegoException e){
            System.out.println();
        }
    }
}
