package com.futurelabs;

import java.util.Arrays;
import java.util.List;

class Persona {
    private String nombre;
    private String apelido;

    public Persona() {}
    public Persona(String nombre, String apelido) {
        this.nombre = nombre;
        this.apelido = apelido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
}
public class SimulatePrintTable {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Manuel", "Guarniz");
        Persona persona2 = new Persona("Juan", "Perez");

        List<Persona> personas = Arrays.asList(persona1, persona2);

        System.out.printf("%10s | %10s\n", "Nombres", "Apellidos");
        System.out.println("=".repeat(23));
        for (Persona persona : personas) {
            System.out.printf("%10s | %10s\n", persona.getNombre(), persona.getApelido());
        }
    }
}
