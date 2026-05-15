package ni.edu.uam.OrdenacionListas.Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;

//Crear una lista de nombres y ordenarla alfabéticamente.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("María");
        nombres.add("Pedro");

        System.out.println("Lista original:");
        System.out.println(nombres);

        // Ordenar alfabéticamente
        Collections.sort(nombres);

        System.out.println("\nLista ordenada:");
        System.out.println(nombres);
    }
}
