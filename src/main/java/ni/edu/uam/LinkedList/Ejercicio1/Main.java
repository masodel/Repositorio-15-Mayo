package ni.edu.uam.LinkedList.Ejercicio1;

import java.util.LinkedList;

// Crear un LinkedList de números enteros y mostrar todos los elementos.

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> numeros = new LinkedList<>();

        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);

        System.out.println("Elementos del LinkedList:");

        System.out.println(numeros);
    }
}
