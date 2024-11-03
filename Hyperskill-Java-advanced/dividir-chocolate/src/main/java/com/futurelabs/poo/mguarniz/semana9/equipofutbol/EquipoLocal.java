package com.futurelabs.poo.mguarniz.semana9.equipofutbol;

public class EquipoLocal extends EquipoDeportivo implements Equipo{
    public EquipoLocal() {
    }

    public EquipoLocal(String nombre, int goles) {
        super(nombre, goles);
    }

    @Override
    public void jugarPartido() {
        System.out.println("Jugando partido local");
    }

    @Override
    public void obtenerDetalle(EquipoDeportivo equipo) {
        System.out.println("Obteniendo detalle partido local: " + equipo);
    }
}
