package tema6.experimento;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class BibliotecaCine2 {
    private final Map<String, Set<Frase2>> categoriasYFrases;

    public BibliotecaCine2() {
        categoriasYFrases = new HashMap<>();
    }

    public void addCategoria(String categoria) throws CineException2 {
        if (categoriasYFrases.containsKey(categoria)) {
            throw new CineException2("La categoria ya estaba añadida");
        }
        categoriasYFrases.put(categoria, new HashSet<>());
    }

    public void addFrase(String categoria, Frase2 frase2) throws CineException2 {
        if (!categoriasYFrases.containsKey(categoria)) {
            throw new CineException2("La categoria no esta añadida y no se puede añadir la frase a esta");
        }
        if (categoriasYFrases.get(categoria).contains(frase2)) {
            throw new CineException2("la frase ya estaba añadida");
        }
        categoriasYFrases.get(categoria).add(frase2);
    }

    public Set<String> categoriasConFrasesSinValoracion() {
        return categoriasYFrases.entrySet().stream()
                .filter(e -> e.getValue().stream()
                        .anyMatch(frase2 -> frase2.getValoracion() == 0))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }

    public Set<String> categoriasDeFrase(Frase2 frase2) {
        return categoriasYFrases.entrySet().stream()
                .filter(e -> e.getValue()
                        .contains(frase2)).map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }

    public List<Frase2> getTodasLasFrasesOrdenadasPorValoracion() {
        return categoriasYFrases.values().stream()
                .flatMap(Set::stream)
                .sorted(Comparator.comparingInt(Frase2::getValoracion))
                .distinct()
                .toList()
                .reversed();
    }

    public void deleteFrase(Frase2 frase2) throws CineException2 {
        categoriasYFrases.values().stream()
                .filter(frase2s -> frase2s.contains(frase2))
                .forEach(frase2s -> frase2s.remove(frase2));
    }

    public List<Frase2> frasesUltimoAnho() {
        return categoriasYFrases.values().stream()
                .flatMap(frase2s -> frase2s.stream()
                        .filter(frase2 -> frase2.getFechaIncorporacion()
                                .plusYears(1).isAfter(LocalDate.now())))
                .distinct()
                .toList();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BibliotecaCine2 that = (BibliotecaCine2) o;
        return Objects.equals(categoriasYFrases, that.categoriasYFrases);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(categoriasYFrases);
    }
}
