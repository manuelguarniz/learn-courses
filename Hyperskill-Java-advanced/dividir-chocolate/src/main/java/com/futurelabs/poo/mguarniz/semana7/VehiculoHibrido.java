package com.futurelabs.poo.mguarniz.semana7;

public class VehiculoHibrido extends Vehiculo implements MotorElectrico{

    @Override
    public void run() {
        String voltaje = MotorElectrico.voltaje;
    }
}
