package org.ies.animals;

import java.util.Objects;

public  class Pig extends Animal{
    private String feeding;

    public Pig(int age, String feeding) {
        super(age);
        this.feeding = feeding;
    }

    @Override
    public void talk() {
        System.out.println("Oink, Oink");
    }

    @Override
    public void showInfo() {
        System.out.println("Cerdo que come" + age + " años que come" + feeding);
    }

    public String getFeeding() {
        return feeding;
    }

    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pig pig = (Pig) o;
        return Objects.equals(feeding, pig.feeding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), feeding);
    }

    @Override
    public String toString() {
        return "Pig{" +
                "color='" + feeding + '\'' +
                ", age=" + age +
                '}';
    }
}
