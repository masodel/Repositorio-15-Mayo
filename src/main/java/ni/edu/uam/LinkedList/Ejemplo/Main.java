package ni.edu.uam.LinkedList.Ejemplo;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> ciudades = new LinkedList<>();

        // Agregar elementos
        ciudades.add("Managua");
        ciudades.add("León");
        ciudades.add("Granada");

        // Agregar al inicio
        ciudades.addFirst("Masaya");

        // Agregar al final
        ciudades.addLast("Estelí");

        // Mostrar lista
        System.out.println(ciudades);

        // Eliminar un elemento
        ciudades.remove("León");

        // Mostrar tamaño
        System.out.println("Cantidad: " + ciudades.size());
    }
}
