package com.futurelabs.poo.mguarniz.semana9.juevo;

public class JuegoAccion extends JuegoGeneral {
    public JuegoAccion() {
        super();
    }

    public JuegoAccion(String nombre, int nivelDificultad) {
        super(nombre, nivelDificultad);
    }

    @Override
    public void iniciarJuego() {
        System.out.println("Iniciando Juego accion");
    }
}
