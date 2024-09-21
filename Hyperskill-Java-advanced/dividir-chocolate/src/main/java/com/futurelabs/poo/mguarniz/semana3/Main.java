package com.futurelabs.poo.mguarniz.semana3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String identified = JOptionPane.showInputDialog("Ingresa tu documento de identidad");
        String name = JOptionPane.showInputDialog("Ingresa tu nombre");
        String lastname = JOptionPane.showInputDialog("Ingresa tus apellidos");
        String inAge = JOptionPane.showInputDialog("Ingresa tu edad");
        int age = Integer.parseInt(inAge);

        Person person = new Person(name, lastname, age, identified);

        Daler daler = new Daler();
        boolean result = daler.sale(person);
        if (result) {
            JOptionPane.showMessageDialog(null,
                    person.getFullName() + ", la venta del auto " +
                            daler.getAuto().getBrand() + ", " + daler.getAuto().getModel() + " fue con exito");
        } else {
            JOptionPane.showMessageDialog(null, "Lo lamentamos " +
                    person.getName() +" la venta no se completo con éxito");
        }
        System.exit(0);
    }
}
