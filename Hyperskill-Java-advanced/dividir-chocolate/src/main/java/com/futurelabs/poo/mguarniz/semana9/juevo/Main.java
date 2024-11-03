package com.futurelabs.poo.mguarniz.semana9.juevo;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        JuegoGeneral general = new JuegoAccion("Call of Duty", 5);
        JuegoGeneral aventura = new JuegoAventura("Mario Bross", 2);

        Stream.of(general, aventura).forEach(e -> {
            e.iniciarJuego();
            e.obtenerDetallers();
        });
    }
}
