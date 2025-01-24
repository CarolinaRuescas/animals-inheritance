package org.ies.animals.components;

import org.ies.animals.model.Animal;

import java.util.Scanner;

public class AnimalReader {
    private final Scanner scanner;
    private final CatReader catReader;
    private final DogReader dogReader;
    private final PigReader pigReader;

    public AnimalReader(Scanner scanner, CatReader catReader, DogReader dogReader, PigReader pigReader) {
        this.scanner = scanner;
        this.catReader = catReader;
        this.dogReader = dogReader;
        this.pigReader = pigReader;
    }

    public Animal read(){
        int option;
        do{
            System.out.println("ELIGE EL TIPO DE ANIMAL QUE QUIERES VER ");
            System.out.println("1. Perro");
            System.out.println("2. Gato");
            System.out.println("3. Cerdo");
            option = scanner.nextInt();
            scanner.nextLine();
        }while (option <1 || option >3);

        if (option==1){
            return dogReader.read();
        }else if (option==2){
            return catReader.read();
        }else{
            return pigReader.read();
        }




    }

}
