package com.futurelabs.poo.mguarniz.semana112;

public class Auto {
    private String patente;
    private String color;

    public Auto(String patente, String color) {
        this.patente = patente;
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("{\"patente\":\"%s\",\"color\":\"%s\"}", patente, color);
    }
}
