package com.futurelabs.poo.mguarniz.semana32;

public class Client {
    private String name;
    private String lastname;
    private int age;

    public Client() {}

    public Client(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
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

    protected String showInformation() {
        return "Nombre: " + name + "\n Apellido: " + lastname + "\n Edad: " + age + " años";
    }
}
