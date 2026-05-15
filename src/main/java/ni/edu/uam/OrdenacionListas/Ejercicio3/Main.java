package ni.edu.uam.OrdenacionListas.Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;

//Crear un programa que ordene números en forma descendente.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(15);
        numeros.add(50);
        numeros.add(8);
        numeros.add(32);
        numeros.add(20);

        System.out.println("Lista original:");
        System.out.println(numeros);

        // Ordenar de mayor a menor
        Collections.sort(numeros, Collections.reverseOrder());

        System.out.println("\nLista descendente:");
        System.out.println(numeros);
    }
}
