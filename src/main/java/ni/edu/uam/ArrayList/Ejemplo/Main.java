package ni.edu.uam.ArrayList.Ejemplo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();

        // Agregar elementos
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");

        // Mostrar elementos
        System.out.println(frutas);

        // Obtener un elemento
        System.out.println("Primera fruta: " + frutas.get(0));

        // Eliminar un elemento
        frutas.remove("Banana");

        // Mostrar tamaño
        System.out.println("Cantidad: " + frutas.size());
    }
}
