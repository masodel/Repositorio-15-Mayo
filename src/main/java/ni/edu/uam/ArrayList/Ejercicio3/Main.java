package ni.edu.uam.ArrayList.Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

// Crear un programa que permita almacenar productos en un ArrayList y mostrar cuántos productos hay registrados.

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> productos = new ArrayList<>();

        System.out.print("¿Cuántos productos desea agregar?: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {

            System.out.print("Ingrese el producto #" + (i + 1) + ": ");
            String producto = sc.nextLine();

            productos.add(producto);
        }

        System.out.println("\nProductos registrados:");

        for (String producto : productos) {
            System.out.println(producto);
        }

        System.out.println("\nCantidad de productos: " + productos.size());

        sc.close();
    }
}
