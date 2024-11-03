package com.futurelabs.poo.mguarniz.semana9.paymentmethod;

public class TarjetaCredito implements MedioDePago {
    @Override
    public void pagar() {
        System.out.println("Pagar Tarjeta de Credito");
    }
}
