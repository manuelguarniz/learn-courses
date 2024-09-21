package com.futurelabs.poo.mguarniz.semana4;

public class Docente extends Lector {
    private String codigoDocente;
    public Docente(String nombre, String direccion, String telefono, String codigoDocente) {
        super(nombre, direccion, telefono);
        this.codigoDocente = codigoDocente;
    }
}
