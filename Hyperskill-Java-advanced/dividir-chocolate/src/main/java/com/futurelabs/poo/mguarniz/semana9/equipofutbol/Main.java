package com.futurelabs.poo.mguarniz.semana9.equipofutbol;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        EquipoDeportivo visitante = new EquipoVisitante("Matute", 2);
        EquipoDeportivo local = new EquipoLocal("AL", 5);


        local.jugarPartido();
        local.obtenerDetalle(visitante);
        visitante.jugarPartido();
        visitante.obtenerDetalle(local);
    }
}
