package com.futurelabs.poo.mguarniz.semana9.equipofutbol;

public class EquipoVisitante extends EquipoDeportivo implements Equipo{
    public EquipoVisitante() {
    }

    public EquipoVisitante(String nombre, int goles) {
        super(nombre, goles);
    }

    @Override
    public void jugarPartido() {
        System.out.println("Jugando partido visitante");
    }

    @Override
    public void obtenerDetalle(EquipoDeportivo equipo) {
        System.out.println("obtener detalle visitante: " + equipo);
    }
}
