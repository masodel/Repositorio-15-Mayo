package ni.edu.uam.OrdenacionListas.Ejemplo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //Ejemplo: Orden Ascendente
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(50);
        numeros.add(10);
        numeros.add(30);
        numeros.add(20);

        // Ordenar
        Collections.sort(numeros);

        System.out.println(numeros);

        //Ejemplo: Orden Descendente
        ArrayList<Integer> numeros2 = new ArrayList<>();

        numeros2.add(50);
        numeros2.add(10);
        numeros2.add(30);
        numeros2.add(20);

        // Orden descendente
        Collections.sort(numeros2, Collections.reverseOrder());

        System.out.println(numeros2);

        //Ejemplo: Ordenar Palabras
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Luis");

        Collections.sort(nombres);

        System.out.println(nombres);
    }
}
