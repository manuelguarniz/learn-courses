package com.futurelabs.poo.mguarniz.semana3;

import java.util.Date;

import static com.futurelabs.poo.mguarniz.semana3.Util.println;

public class Daler {
    private Car auto;
    private int numberOfCars;

    public Daler() {
        auto = new Car();
        auto.setBrand("Mercedes Benz");
        auto.setModel("AMG C63");
        auto.setYear(new Date(2024, 1, 1));

        numberOfCars = 5;
    }

    public Daler(Car auto, int quantity) {
        this.auto = auto;
        this.numberOfCars = quantity;
    }

    public Car getAuto() {
        return auto;
    }

    public void setAuto(Car auto) {
        this.auto = auto;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public boolean sale(Person person) {
        if (person.getAge() < 18) {
            println("No se puede vender a " + person.getFullName() + ", es menor de edad");
            return false;
        }
        if (numberOfCars == 0) {
            println("Sin stock");
            return false;
        }
        numberOfCars--;
        println("Auto vendido: " + auto);
        println("Propietario: " + person);
        return true;

    }

    public void importCars(int numberOfCars) {
        if (this.numberOfCars > 0) {
            println("Aun tienes stock");
        }
        this.numberOfCars = numberOfCars;
    }

    @Override
    public String toString() {
        return "Stock: " + numberOfCars + ", auto: " + auto;
    }
}
