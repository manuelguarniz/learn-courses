package com.futurelabs.poo.mguarniz.semana3;

import javax.swing.*;

public class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;
    private String numeroSerie;

    public Vehiculo() {}

    public Vehiculo(String marca, String modelo, double precio, String numeroSerie) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.numeroSerie = numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", numeroSerie='" + numeroSerie + '\'' +
                '}';
    }

    public void showInformation() {
        JOptionPane.showMessageDialog(null, toString());
    }
}
