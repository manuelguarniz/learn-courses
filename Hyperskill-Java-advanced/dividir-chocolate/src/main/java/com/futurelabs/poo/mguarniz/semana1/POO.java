package com.futurelabs.poo.mguarniz.semana1;

public class POO {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(202401, 3, "Manuel", "Guarniz", "Cruz");

        Empleado empleado2 = new Empleado(202402, 10, "Juan", "Perez", "Cruz");

        Empleado empleado3 = new Empleado(202403, 17, "Mario", "Lloza", "Cruz");

        System.out.println(empleado1.calculaCategoria());

        System.out.println(empleado2.calculaCategoria());

        System.out.println(empleado3.calculaCategoria());
    }
}
