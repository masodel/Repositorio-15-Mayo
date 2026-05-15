package ni.edu.uam.Colecciones;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Interface List
        List<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Manzana"); // Duplicado permitido
        System.out.println(lista.get(0)); // Acceso por índice

        //Interface Set
        Set<String> conjunto = new HashSet<>();
        conjunto.add("Rojo");
        conjunto.add("Verde");
        conjunto.add("Rojo"); // No se agrega (duplicado)

        System.out.println(conjunto.size()); // 2

        //Interface Map
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Juan");
        mapa.put(2, "Ana");
        mapa.put(1, "Carlos"); // Sobrescribe el valor anterior

        System.out.println(mapa.get(1)); // Carlos
    }
}
