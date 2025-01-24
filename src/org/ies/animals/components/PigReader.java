package org.ies.animals.components;

import org.ies.animals.model.Pig;

import java.util.Scanner;

public class PigReader {
    private final Scanner scanner;

    public PigReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Pig read(){

        System.out.println("-- DATOS DEL CERDO -- ");
        System.out.println("Edad: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Alimentación: ");
        String breed = scanner.nextLine();

        return new Pig(
                age,
                breed
        );
    }
}
