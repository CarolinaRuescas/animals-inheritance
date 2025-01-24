package org.ies.animals.components;

import org.ies.animals.model.Cat;

import java.util.Scanner;

public class CatReader {
    private final Scanner scanner;

    public CatReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Cat read(){
        System.out.println("-- DATOS DEL GATO --");
        System.out.println("Edad:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Color: ");
        String color = scanner.nextLine();

        return new Cat(
                age,
                color
        );
    }
}
