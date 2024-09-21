package com.futurelabs.poo.mguarniz.semana4;

public class Estudiante extends Lector{
    private String codigoEstudiante;

    public Estudiante(String nombre, String direccion, String telefono, String codigoEstudiante) {
        super(nombre, direccion, telefono);
        this.codigoEstudiante = codigoEstudiante;
    }
}
