package ni.edu.uam.OrdenacionListas.Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

//Crear un ArrayList con 5 números y ordenarlos de menor a mayor.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(40);
        numeros.add(10);
        numeros.add(25);
        numeros.add(5);
        numeros.add(30);

        System.out.println("Lista original:");
        System.out.println(numeros);

        // Ordenar de menor a mayor
        Collections.sort(numeros);

        System.out.println("\nLista ordenada:");
        System.out.println(numeros);
    }
}
