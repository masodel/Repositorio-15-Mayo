package ni.edu.uam.LinkedList.Ejercicio3;

import java.util.LinkedList;

//Crear un LinkedList de productos y eliminar un producto específico.
public class Main {
    public static void main(String[] args) {

        // Crear LinkedList de productos
        LinkedList<String> productos = new LinkedList<>();

        // Agregar productos
        productos.add("Laptop");
        productos.add("Mouse");
        productos.add("Teclado");
        productos.add("Monitor");

        // Mostrar lista original
        System.out.println("Lista de productos:");
        System.out.println(productos);

        // Eliminar un producto específico
        productos.remove("Mouse");

        // Mostrar lista actualizada
        System.out.println("\nLista después de eliminar:");
        System.out.println(productos);
    }
}
