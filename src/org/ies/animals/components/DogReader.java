package org.ies.animals.components;

import org.ies.animals.model.Dog;

import java.util.Scanner;

public class DogReader {
    private final Scanner scanner;

    public DogReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Dog read(){
        System.out.println("-- DATOS DEL PERRO -- ");
        System.out.println("Edad: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Raza: ");
        String breed = scanner.nextLine();

        return new Dog(
                age,
                breed
        );
    }
}
