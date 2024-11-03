package com.futurelabs.poo.mguarniz.semana7;

public interface MotorElectrico {
    String voltaje = "";
    void run();
    static void encender() {
        System.out.println("encender");
    }
    default void apagar() {
        System.out.println("apagar");
    }
    private void detener() {
        System.out.println("detener");
    }
}
