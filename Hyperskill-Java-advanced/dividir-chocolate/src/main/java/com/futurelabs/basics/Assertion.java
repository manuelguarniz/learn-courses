package com.futurelabs.basics;

public class Assertion {
    public static void main(String[] args) {
        final Animal animal = new Animal(null);
        System.out.println(animal.getName());
    }

}
class Animal {
    private String name;

    Animal(String name) {
        assert name != null : "Name must not be null";
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
