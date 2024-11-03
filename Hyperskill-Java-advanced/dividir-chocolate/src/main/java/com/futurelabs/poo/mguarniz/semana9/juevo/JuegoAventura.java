package com.futurelabs.poo.mguarniz.semana9.juevo;

public class JuegoAventura extends JuegoGeneral {
    public JuegoAventura() {
        super();
    }

    public JuegoAventura(String nombre, int nivelDificultad) {
        super(nombre, nivelDificultad);
    }

    @Override
    public void iniciarJuego() {
        System.out.println("Iniciando Juego aventura");
    }
}
