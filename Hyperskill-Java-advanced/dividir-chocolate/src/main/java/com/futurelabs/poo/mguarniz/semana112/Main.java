package com.futurelabs.poo.mguarniz.semana112;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Auto> list = new ArrayList<>();

        Auto auto1 = new Auto("ABC123", "Verde");
        list.add(auto1);

        print(list.size());
        print(auto1);
        print("*".repeat(40));

        Auto auto2 = new Auto("DBC456", "Rojo");
        list.add(auto2);

        print(list.size());
        print(list);
        print("*".repeat(40));

        Auto auto3 = new Auto("00C156", "Azul");
        list.add(auto3);

        print(list.size());
        print(list);
        print("*".repeat(40));

        print("El auto numero 2 es: " + list.get(1));
        print("*".repeat(40));

//        for (int i = 0; i < list.size(); i++) {
//            print("el auto en la posicion " + i + " es: " + list.get(i));
//        }
//        for (Auto auto : list) {
//            print("el auto en la posicion " + 0 + " es: " + auto);
//        }
        list.forEach(auto -> {
            print("el auto en la posicion " + 0 + " es: " + auto);
        });
        print("*".repeat(40));

        list.remove(0);

        print(list.size());
        print(list);
        print("*".repeat(40));
    }

    private static void print(Object obj) {
        System.out.println(obj);
    }
}
