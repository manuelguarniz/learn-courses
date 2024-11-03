package com.futurelabs.poo.mguarniz.semana9.equipofutbol;

public class EquipoDeportivo implements Equipo {
    private String nombre;
    private int goles;

    public EquipoDeportivo() {}
    public EquipoDeportivo(String nombre, int goles) {
        this.nombre = nombre;
        this.goles = goles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    @Override
    public void jugarPartido() {

    }

    @Override
    public void obtenerDetalle(EquipoDeportivo equipo) {

    }

    @Override
    public String toString() {
        return "EquipoDeportivo{" +
                "nombre='" + nombre + '\'' +
                ", goles=" + goles +
                '}';
    }
}
