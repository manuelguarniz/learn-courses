package com.futurelabs.poo.mguarniz.semana9.juevo;

public class JuegoGeneral implements Juego {
    private String nombre;
    private int nivelDificultad;

    public JuegoGeneral() {}

    public JuegoGeneral(String nombre, int nivelDificultad) {
        this.nombre = nombre;
        this.nivelDificultad = nivelDificultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    @Override
    public void iniciarJuego() {
        System.out.println("Iniciando Juego");
    }

    @Override
    public void obtenerDetallers() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "JuegoGeneral{" +
                "nombre='" + nombre + '\'' +
                ", nivelDificultad=" + nivelDificultad +
                '}';
    }
}
