package tema6;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class prueba_de_clase {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Luis", "Pedro", "Luis");

        List<String> nuevaLista = nombres.stream().distinct().toList();

    }
}
