package org.ies.animals;

import java.util.Objects;

public class Dog extends Animal {
    private String breed;

    public Dog(int age, String breed) {
        super(age);
        this.breed = breed;
    }

    @Override
    public void talk() {
        System.out.println("Guau, Guau");
    }

    @Override
    public void showInfo() {
        System.out.println("El perro es un " + breed + " con " + age + "años");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
