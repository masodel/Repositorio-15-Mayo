package ni.edu.uam.LinkedList.Ejercicio2;

import java.util.LinkedList;

//Crear un LinkedList de nombres y agregar un nombre al inicio y otro al final.

public class Main {
    public static void main(String[] args) {

        LinkedList<String> nombres = new LinkedList<>();

        nombres.add("Carlos");
        nombres.add("Maria");

        nombres.addFirst("Ana");

        nombres.addLast("Juan");

        System.out.println("Lista de nombres:");

        System.out.println(nombres);
    }
}
