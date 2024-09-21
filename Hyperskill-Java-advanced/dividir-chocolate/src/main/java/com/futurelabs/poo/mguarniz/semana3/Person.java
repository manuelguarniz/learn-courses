package com.futurelabs.poo.mguarniz.semana3;

import javax.swing.*;

public class Person {
    private String name;
    private String lastname;
    private String identified;
    private int age;

    public Person() {}
    public Person(String name, String lastname, int age, String identified) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.identified = identified;
    }

    public String getIdentified() {
        return identified;
    }

    public void setIdentified(String identified) {
        this.identified = identified;
    }

    public String getFullName() {
        return name + " " + lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Datos: " + getFullName() + "(" + identified + ") de " + age + " años.";
    }

    public void showInformation() {
        JOptionPane.showMessageDialog(null, toString());
    }
}
