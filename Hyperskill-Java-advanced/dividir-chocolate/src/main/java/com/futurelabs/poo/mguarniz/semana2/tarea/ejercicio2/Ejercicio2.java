package com.futurelabs.poo.mguarniz.semana2.tarea.ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.setNumberCopies(2);

        print("1. prestar libro: " + libro.loans());
        print("2. prestar libro: " + libro.loans());
        print("3. prestar libro: " + libro.loans());
        print("4. prestar libro: " + libro.loans());
        print("5. prestar libro: " + libro.loans());
        print("6. prestar libro: " + libro.loans());
        print("7. prestar libro: " + libro.loans());
        print("8. prestar libro: " + libro.loans());
        print("9. prestar libro: " + libro.loans());
        print("10. prestar libro: " + libro.loans());
        print("11. prestar libro: " + libro.loans());
        print("9. returnLoans: " + libro.returnLoans());
        print("10. prestar libro: " + libro.loans());
        print("11. prestar libro: " + libro.loans());
        print("12. prestar libro: " + libro.loans());
    }

    private static void print(String text) {
        System.out.println(text);
    }
}
