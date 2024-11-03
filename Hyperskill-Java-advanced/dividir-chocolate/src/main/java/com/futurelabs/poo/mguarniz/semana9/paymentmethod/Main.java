package com.futurelabs.poo.mguarniz.semana9.paymentmethod;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        MedioDePago payPall = new PayPal();
        MedioDePago tarjetaCredito = new TarjetaCredito();
        MedioDePago transferencia = new TransferenciaBancaria();

        Stream.of(payPall, tarjetaCredito, transferencia).forEach(MedioDePago::pagar);
    }
}
