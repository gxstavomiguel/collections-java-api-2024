import java.util.HashMap;
import java.util.Map;

public class GenericsExempleMap {
    public static void main(String[] args) {
        Map mapaSemGenerics = new HashMap();
        mapaSemGenerics.put("Chave 1", 10);
        mapaSemGenerics.put("Chave 2", 20);

        Map<String, Integer> mapaGenerics = new HashMap<>();
        mapaGenerics.put("chave 1", 20);
        mapaGenerics.put("chave 2", 20);

        for (Map.Entry<String, Integer> entry : mapaGenerics.entrySet()) {
            String chave = entry.getKey();
            int valor = entry.getValue();
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }

    }
}
