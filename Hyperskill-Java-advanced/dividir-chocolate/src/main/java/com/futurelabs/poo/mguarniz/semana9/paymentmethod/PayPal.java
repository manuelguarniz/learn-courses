package com.futurelabs.poo.mguarniz.semana9.paymentmethod;

public class PayPal implements MedioDePago{
    @Override
    public void pagar() {
        System.out.println("Pagar PayPal");
    }
}
