package ni.edu.uam.ArrayList.Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

// Crear un ArrayList de nombres de estudiantes. Eliminar un nombre y mostrar la lista actualizada.

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> estudiantes = new ArrayList<>();

        estudiantes.add("Carlos");
        estudiantes.add("Maria");
        estudiantes.add("Juan");
        estudiantes.add("Ana");

        System.out.println("Lista de estudiantes:");

        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println(i + " - " + estudiantes.get(i));
        }

        System.out.print("Ingrese el índice del estudiante que desea eliminar: ");
        int indice = sc.nextInt();

        estudiantes.remove(indice);

        System.out.println("\nLista actualizada:");

        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        sc.close();
    }
}
