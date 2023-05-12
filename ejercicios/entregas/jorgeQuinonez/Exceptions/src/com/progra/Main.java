package com.progra;

import com.progra.inventory.Inventory;
import com.progra.inventory.exceptions.FullStorageException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String newObject = "";
        Integer position = null;
        String answer = "";

        System.out.print("Ingresa la capacidad de tu inventario: ");
        int capacity = Integer.parseInt(input.nextLine()); // nextInt has problems with EOL
        Inventory inv = new Inventory(capacity);
        do {
            try {
                if (answer.equals("y") || answer.equals("Y")) {
                    do {
                        System.out.print("Ingresa la posición del elemento a eliminar: ");
                        position = input.nextInt();
                        input.nextLine();
                        inv.removeItem(position - 1);
                        System.out.println(inv.getItems());
                        System.out.print("¿Deseas eliminar otro elemento? (y/n): ");
                        String newAnswer = input.nextLine();
                        if (newAnswer.equals("n") || newAnswer.equals("N")) {
                            System.out.println(inv.getItems());
                            System.exit(0);
                        }
                    } while (answer.equals("y") || answer.equals("Y"));
                }

                System.out.print("Ingresa un objeto a tu invetario: ");
                newObject = input.nextLine();
                inv.setItem(newObject);

            } catch (FullStorageException e) {
                System.err.println(e.getMessage());
                System.out.println();
                System.out.println("Actual inventory: " + inv.getItems());
                System.out.print("¿Deseas eliminar un elemento? (y/n): ");
                answer = input.nextLine();
                if (answer.equals("n") || answer.equals("N")) {
                    System.exit(0);
                }

                // HERE you can do something with the exception :)
            }
        } while (true);

        // TODO Borrar Elementos del inventario, Añadir Elementos a través de un archivo
        // externo y manejar excepciones
        // como FileNotFoundException, también crear validaciones por medio de
        // Excepciones personalizadas

    }
}
