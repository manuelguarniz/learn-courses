package com.futurelabs.poo.mguarniz.semana2;

public class Main {
    public static void main(String[] args) {
        Automovil automovil = new Automovil();
        automovil.setFabricante("Mazda");
        automovil.setModelo("BT-50");
        automovil.setColor("Blanco");
        automovil.setCilindrada(3.0);

        System.out.println("====================================");
        System.out.println("Mostrando datos del objeto automovil");
        System.out.println("====================================");
        System.out.println("- Fabricante: " + automovil.getFabricante());
        System.out.println("- Modelo: " + automovil.getModelo());
        System.out.println("- Color: " + automovil.getColor());
        System.out.println("- Cilindrada: " + automovil.getCilindrada());
    }
}
