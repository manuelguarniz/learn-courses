package com.futurelabs.poo.mguarniz.semana3;

import javax.swing.*;

public class Main2 {
    public static void main(String[] args) {

        String identified = JOptionPane.showInputDialog("Ingresa tu documento de identidad:");
        String name = JOptionPane.showInputDialog("Ingresa tu nombre:");
        String lastname = JOptionPane.showInputDialog("Ingresa tus apellidos:");

        Person person = new Person(name, lastname, 0, identified);

        String marca = JOptionPane.showInputDialog("Ingrese la marca del vehiculo:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo:");
        String inPrecio = JOptionPane.showInputDialog("Ingrese el precio del vehiculo:");
        String numeroSerie = JOptionPane.showInputDialog("Ingrese el numero de serie");

        double precio = Double.parseDouble(inPrecio);

        Vehiculo vehiculo = new Vehiculo(marca, modelo, precio, numeroSerie);
        person.showInformation();
        vehiculo.showInformation();
    }
}
