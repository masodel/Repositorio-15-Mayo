package ni.edu.uam.ArrayList.Ejercicio1;

import java.util.ArrayList;

// Crear un ArrayList de números enteros y agregar 5 números. Luego mostrar todos los elementos.

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        System.out.println("Elementos del ArrayList:");

        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
